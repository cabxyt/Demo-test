package com.play.sys.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;

/**
 * 登录相关
 */
@Controller
public class SysLoginController {
	@Autowired
	private Producer producer;

	@RequestMapping("captcha")
	public void captcha(HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Cache-Control", "no-store, no-cache");
		response.setContentType("image/jpeg");
		// 生成文字验证码
		String text = producer.createText();
		// 生成图片验证码
		BufferedImage image = producer.createImage(text);
		// 保存到shiro session
		SecurityUtils.getSubject().getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, text);
		ServletOutputStream out = response.getOutputStream();
		ImageIO.write(image, "jpg", out);
	}

	/**
	 * 登录
	 */
	@ResponseBody
	@RequestMapping(value = "/sys/login", method = RequestMethod.POST)
	public String login(String username, String password, String captcha) throws IOException {
		String kaptcha = (String) SecurityUtils.getSubject().getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
		if (!captcha.equalsIgnoreCase(kaptcha)) {
			return "验证码不正确";
		}
		try {
			Subject subject = SecurityUtils.getSubject();
			// sha256加密
			// password = new Sha256Hash(password).toHex();
			UsernamePasswordToken token = new UsernamePasswordToken(username, password);
			subject.login(token);
		} catch (UnknownAccountException e) {
			return e.getMessage();
		} catch (IncorrectCredentialsException e) {
			return e.getMessage();
		} catch (LockedAccountException e) {
			return e.getMessage();
		} catch (AuthenticationException e) {
			return "账户验证失败";
		}

		return "true";

	}

	/**
	 * 
	 */
//	@RequestMapping(value = "logout", method = RequestMethod.GET)
//	public String logout() {
//		SecurityUtils.getSubject().logout();
//		return "redirect:login.html";
//	}

	/**
	 *
	 */
	@ResponseBody
	@RequestMapping(value = "/sys/user/info", method = RequestMethod.GET)
	public void userInfo() throws IOException {
	}

	/**
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/sys/user/password", method = RequestMethod.POST)
	public void updatePassword() throws IOException {

	}
}