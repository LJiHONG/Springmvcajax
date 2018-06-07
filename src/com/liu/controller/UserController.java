package com.liu.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liu.po.UserInfo;

@Controller
public class UserController {
	
	@RequestMapping("/ajaxUser.do")
	public void userNum(String userNum,HttpServletResponse response){
		System.out.println(userNum);
		try {
			response.setContentType("text/html");
			response.setCharacterEncoding("utf-8");
			PrintWriter out=response.getWriter();
			if(!"liu".equals(userNum)){
				out.println("�Բ��������������˺�");
			}else{
				out.println("��ϲ�㣬�˺ſ���ʹ��");
			}
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/ajaxUser2.do")
	public @ResponseBody UserInfo ajaxUser(Integer userId){
		UserInfo user=new UserInfo();
		user.setUserID(userId);
		user.setUserName("����");
		user.setUserSex("��");
		return user;
	}
}
