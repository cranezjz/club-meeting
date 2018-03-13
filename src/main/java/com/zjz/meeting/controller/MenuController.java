package com.zjz.meeting.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("meeting")
public class MenuController {
	@RequestMapping("/menus")
    public String index() {
		String content="<ul class=\"nav nav-pills\">\r\n" + 
				"  <li role='presentation' id='index'><a href='http://aa.njcb.com:8080/' target='_blank'>网站首页</a></li>\r\n" + 
				"  <li role='presentation' id='meeting'><a href='/meeting.html'>会务系统</a></li>\r\n" + 
				"  <li role='presentation' id='train'><a href='/train.html'>培训系统</a></li>\r\n" + 
				"  <li role='presentation' id='train'><a href='/mine.html'>会员中心</a></li>\r\n" + 
				"  <li role='presentation' id='login'><a href='/login.html'>网站登录</a></li>\r\n" + 
				"</ul>";
        return content;
    }
}
