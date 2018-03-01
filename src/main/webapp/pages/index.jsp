<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bean.Student" %>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>复习e</title>
<style type="text/css">
	*{
		margin:0;
		padding:0;
	}
	
	#one{
		height:500px;
		width:600px;
		margin:0 auto;
		border-collapse: collapse;
		text-align: center;
	}
	
	#one td,
	#one th{
		font-size:24px;
		border:2px solid #000;
		padding:5px 7px;
	}
</style>

</head>
<body>
	<!-- 先使用java拼字符串实现页面输出 -->
	
	<table id="one">
		<thead>
			<tr>
				<th>学号</th>
				<th>姓名</th>
				<th>班级</th>
				<th>性别</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="student" items="${list }">
			<tr>
				<td>${student.id }</td>
				<td>${student.name }</td>
				<td>
					<c:choose>
						<c:when test="${student.BId==1 }">一班</c:when>
						<c:when test="${student.BId==2 }">二班</c:when>
						<c:when test="${student.BId==3 }">三班</c:when>
						<c:when test="${student.BId==4 }">四班</c:when>
						<c:when test="${student.BId==5 }">五班</c:when>
						<c:otherwise>混合班</c:otherwise>
					
					
					</c:choose>
				</td>
				<td>
					<c:if test="${student.gerden==1 }">男</c:if>
					<c:if test="${student.gerden==0 }">女</c:if>					
				</td>
				
			</tr>
		</c:forEach>
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			<%
			/*创建接收数据的容器*/
			/*List<Student> students = (List<Student>)request.getAttribute("list");*/
			/*使用for循环遍历*/
			//for(Student student : students){
			//	StringBuilder strbuilder = new StringBuilder();
			//	strbuilder.append("<tr>");
			//	strbuilder.append("<td>"+student.getId()+"</td>");
			//	strbuilder.append("<td>"+student.getName()+"</td>");
			//	strbuilder.append("<td>"+student.getBId()+"</td>");
			//	strbuilder.append("<td>"+student.getGerden()+"</td>");
			//	strbuilder.append("</tr>");	
			//	out.print(strbuilder.toString());
			//}
		
	
	
	  		%>
		
		</tbody>
	
	
	</table>
	
	
	
	
</body>
</html>