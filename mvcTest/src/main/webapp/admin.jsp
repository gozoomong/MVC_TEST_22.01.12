<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.gozoo.www.*" %>
<%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADMINISTRATOR PAGE</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script type="text/javascript">
$(function(){
	$(".updateBtn").click(function(){
		var id = $(this).parent().parent().find(".up_id").val();
		var pw = $(this).parent().parent().find(".up_pw").val();
		var name = $(this).parent().parent().find(".up_name").val();
		var point = $(this).parent().parent().find(".up_point").val();
		alert(id + " / " + pw + " / " + name  +  " / " + point);
		location.href = "updatepage.jsp?id="+id+"&pw="+pw+"&name="+name+"&point="+point
	
	})
	
	$(".deleteBtn").click(function(){
		var id = $(this).parent().parent().find(".up_id").val();
		location.href = "A_Controller?command=deleteAction&id="+id;
	})
	
 	$(".start").click(function(){
		location.href="A_Controller?command=start"
	}) 

	$(".stop").click(function(){
		location.href="A_Controller?command=stop"
	}) 
	
	$(".goLogin").click(function(){
		location.href="login.jsp"
	})
	
});
</script>

</head>
<body>

<h1>회원관리</h1>
<button class = "goLogin">로그인</button>
<table>
	<tr>
		<td>ID</td>
		<td>PW</td>
		<td>NAME</td>
		<td>POINT</td>
		<td>수정</td>
		<td>삭제</td>
	</tr>
<%
A_MemberDao mDao = new A_MemberDao();
ArrayList<A_MemberDto> list = mDao.getList();
for(A_MemberDto dto : list){
%>
	<tr>
		<td><%=dto.getId() %></td>
		<td><%=dto.getPw() %></td>
		<td><%=dto.getName() %></td>
		<td><%=dto.getPoint() %></td>
		<td> <button class= "updateBtn">수정</button> </td>
		<td> <button class= "deleteBtn">삭제</button> </td>
		<td><input type = "hidden" class = "up_id"  value = "<%=dto.getId() %>"></td>
		<td><input type = "hidden" class = "up_pw"  value = "<%=dto.getPw() %>"></td>
		<td><input type = "hidden" class = "up_name"  value ="<%=dto.getName() %>"></td>
		<td><input type = "hidden" class = "up_point"  value = "<%=dto.getPoint() %>"></td>
	</tr>
<%
	}
%>		
</table>
	
	
	
	

<h1>스케줄러 관리</h1>
<button class = "start">스케줄러(20초마다 포인트1 증가) 실행 시작</button>
<button class= "stop">스케줄러 실행 종료</button>


</body>
</html>