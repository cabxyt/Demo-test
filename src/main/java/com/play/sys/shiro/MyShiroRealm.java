package com.play.sys.shiro;

import java.util.HashSet;
import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.play.common.util.SpringUtil;
import com.play.phedb.dao.entity.SysUser;
import com.play.phedb.dao.mapper.SysUserMapper;
import com.play.sys.service.UserService;

public class MyShiroRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;
	/**
	 * 授权用户权限
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SysUser user = (SysUser)principals.getPrimaryPrincipal();
		if(user == null) {
            throw new UnknownAccountException("会话超时或用户未登录！");
        }

        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(userService.findRoles(user.getUsername()));
        authorizationInfo.setStringPermissions(userService.findPermissions(user.getUsername()));
        return authorizationInfo;
//		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//		info.setStringPermissions(new HashSet<String>());
//		return info;
		
	}

	/**
	 * 验证用户身份
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken)
			throws AuthenticationException {
		String username = (String) authcToken.getPrincipal();
		String password = new String((char[]) authcToken.getCredentials());
		SysUserMapper sysUserMapper = (SysUserMapper) SpringUtil.getBean(SysUserMapper.class);
		SysUser user = new SysUser();
		user.setUsername(username);
		user.setPassword(password);
		List<SysUser> list = sysUserMapper.query(user);
		// 账号不存在
		if (list.size() == 0) {
			throw new UnknownAccountException("账号或密码不正确");
		}
		user.setPassword(null);
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, password, getName());
		return info;
	}

}
