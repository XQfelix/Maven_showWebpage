package com;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Student;
import util.JdbcUtil;

@WebServlet("/index")
public class TestServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		//创建一个List来接收数据库中的信息
		List<Student> students = JdbcUtil.executeQuery("select id,name,b_id,gerden from student",Student.class, null);
		//设置键值对将数据传入页面
		request.setAttribute("list", students);
		
		//将页面转发到index.jsp
		request.getRequestDispatcher("/pages/index.jsp").forward(request, response);
		
		
	}
}
