package com.play.sys.controller;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

@RestController
@RequestMapping("/sys")
public class MenuController {
	@RequestMapping("/menu")
	public Object user() {
		List<Menu> menuList = new ArrayList<Menu>();

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		String menuFile = "/menu.xml";
		InputStream is = this.getClass().getResourceAsStream(menuFile);
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(is);
			NodeList list = doc.getElementsByTagName("menu");
			// 遍历每一个节点
			// TODO 根据当前用户权限取得菜单,逻辑有点乱,此处需要重新梳理
			List<String> perms = new ArrayList<>(); // ShiroUtils.getUserPerms();
			for (int i = 0; i < list.getLength(); ++i) {
				Element element = (Element) list.item(i);
				if (element.getAttribute("type").equals("0")) {
					if (hasPerm(perms, element.getAttribute("perms"))) {// 导航菜单权限控制
						Menu menu = new Menu();
						menu.setIcon(element.getAttribute("icon"));
						menu.setMenuId(Long.parseLong(element.getAttribute("menuId")));
						menu.setName(element.getAttribute("name"));
						menu.setType(Integer.parseInt(element.getAttribute("type")));
						menu.setUrl(element.getAttribute("url"));
						List<Menu> menus = new ArrayList<Menu>();
						NodeList mlist = element.getElementsByTagName("menu");

						for (int j = 0; j < mlist.getLength(); ++j) {// 菜单权限控制
							Element ele = (Element) mlist.item(j);
							if (hasPerm(perms, ele.getAttribute("perms")) && ele.getAttribute("type").equals("1")) {
								Menu me = new Menu();
								me.setIcon(ele.getAttribute("icon"));
								me.setMenuId(Long.parseLong(ele.getAttribute("menuId")));
								me.setName(ele.getAttribute("name"));
								me.setType(Integer.parseInt(ele.getAttribute("type")));
								me.setUrl(ele.getAttribute("url"));
								menus.add(me);
							} else if (hasPerm(perms, ele.getAttribute("perms"))
									&& ele.getAttribute("type").equals("2")) {
								Menu me = new Menu();
								me.setIcon(ele.getAttribute("icon"));
								me.setMenuId(Long.parseLong(ele.getAttribute("menuId")));
								me.setName(ele.getAttribute("name"));
								me.setType(Integer.parseInt(ele.getAttribute("type")));
								me.setUrl(ele.getAttribute("url"));
								List<Menu> menusSecond = new ArrayList<Menu>();
								NodeList Second = ele.getElementsByTagName("menu");
								for (int x = 0; x < Second.getLength(); ++x) {
									Element eleSecond = (Element) Second.item(x);
									if (hasPerm(perms, eleSecond.getAttribute("perms"))
											&& eleSecond.getAttribute("type").equals("3")) {
										Menu meSecond = new Menu();
										meSecond.setIcon(eleSecond.getAttribute("icon"));
										meSecond.setMenuId(Long.parseLong(eleSecond.getAttribute("menuId")));
										meSecond.setName(eleSecond.getAttribute("name"));
										meSecond.setType(Integer.parseInt(eleSecond.getAttribute("type")));
										meSecond.setUrl(eleSecond.getAttribute("url"));
										menusSecond.add(meSecond);
									}
								}
								me.setList(menusSecond);
								menus.add(me);
							}
						}

						menu.setList(menus);
						menuList.add(menu);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return menuList;
	}

	private boolean hasPerm(List<String> perms, String perm) {
		return true;
		// return perms.contains(perm) || PhwebPropertyUtil.isTestMode();
	}
}

/**
 * 系统菜单定义
 */
class Menu {

	private String icon;
	private Long menuId;
	private String name;
	private Integer type;
	private String url;
	private List<Menu> list;

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Menu> getList() {
		return list;
	}

	public void setList(List<Menu> list) {
		this.list = list;
	}

}
