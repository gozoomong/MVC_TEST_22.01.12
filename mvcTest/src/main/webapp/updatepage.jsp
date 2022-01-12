<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	int point = Integer.parseInt(request.getParameter("point"));
%>
<h1>회원관리-수정관리자</h1>
<form action="A_Controller?command=updateAction" method = "post">
	<input type = "hidden" name = "up_id" value = "<%=id%>"> <br>
	ID <input readonly type = "text"   value = "<%=id%>"> <br>
	PW <input type = "text"  name = "up_pw"  value = "<%=pw%>"> <br>
	Name <input type = "text"  name = "up_name"  value = "<%=name%>"> <br>
	point <input type = "text"  name = "up_point"  value = "<%=point%>"> <br>
	<input type = "submit" value = "제출">
</form>
</body>
</html>