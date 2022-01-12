<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<body>
<style>
.btn{
	width : 185px;
}
.registerBtn{
	width : 185px;
}
</style> 
<script type="text/javascript">
$(function(){
	$(".registerBtn").click(function(){
		location.href = "registerpage.jsp"
	})
	
});
</script> 
<h1>로그인</h1>
<form action="A_Controller?command=loginCheckAction" method = "post">
	ID : <input type = "text" name = "id"> <br>
	PW : <input type = "password" name = "pw"> <br>
	<input type="submit" value = "로그인" class= "btn"> <br>
</form>
	<button class= "registerBtn">회원가입</button>


</body>
</html>