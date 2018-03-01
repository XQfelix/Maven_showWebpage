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
		//����һ��List���������ݿ��е���Ϣ
		List<Student> students = JdbcUtil.executeQuery("select id,name,b_id,gerden from student",Student.class, null);
		//���ü�ֵ�Խ����ݴ���ҳ��
		request.setAttribute("list", students);
		
		//��ҳ��ת����index.jsp
		request.getRequestDispatcher("/pages/index.jsp").forward(request, response);
		
		
	}
}
