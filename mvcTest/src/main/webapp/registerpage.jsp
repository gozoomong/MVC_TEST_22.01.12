<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>REGISTER PAGE</title>
</head>
<body>
<h1>회원가입</h1>
<style>
.subBtn{
width : 200px;
}
</style>
<form action="A_Controller?command=registerAction" method = "post">
	<table>
		<tr>
			<td>ID : </td>
			<td> <input type = "text" name = "id"> </td>
		</tr>
		<tr>
			<td>PW : </td>
			<td> <input type = "text" name = "pw"> </td>
			<!-- 회원가입이라 일부러 type password 안했습니다. -->
		</tr>
		<tr>
			<td>Name : </td>
			<td> <input type = "text" name = "name"> </td>
		</tr>
	</table>
	<input type = "submit" value = "작성완료" class= "subBtn">
</form>
</body>
</html>