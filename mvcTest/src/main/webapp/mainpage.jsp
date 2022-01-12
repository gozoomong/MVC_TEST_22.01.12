<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	.imgA{
		width : 300px;
	}
	.imgB{
		width : 300px;
	}
	.imgC{
		width : 300px;
	}
	
	.frame{
		width : 1000px;
		margin : auto;
	}
</style>
<script type="text/javascript">
	$(function(){
		
		$(".logoutBtn").click(function(){
			location.href = "A_Controller?command=logoutAction"
		});
		
		$(".imgA").click(function(){
			var loginId = $(".loginId").val();
			var loginPoint = $(".loginPoint").val();
			var price = $(this).parent().find(".price").val();
			if(parseInt(loginPoint) < parseInt(price)){
				alert("포인트가 부족합니다. 광고를 클릭하세요.")
			}else{
				location.href = "A_Controller?command=minusPointAction&loginId="+loginId+"&price="+price
			}
		});
		
		
		$(".imgB").click(function(){
			var loginId = $(".loginId").val();
			var loginPoint = $(".loginPoint").val();
			var price = $(this).parent().find(".price").val();
			if(parseInt(loginPoint) < parseInt(price)){
				alert("포인트가 부족합니다. 광고를 클릭하세요.")
			}else{
				location.href = "A_Controller?command=minusPointAction2&loginId="+loginId+"&price="+price
			}
		});
		
		
		$(".imgC").click(function(){
			var loginId = $(".loginId").val();
			var loginPoint = $(".loginPoint").val();
			var price = $(this).parent().find(".price").val();
			if(parseInt(loginPoint) < parseInt(price)){
				alert("포인트가 부족합니다. 광고를 클릭하세요.")
			}else{
				location.href = "A_Controller?command=minusPointAction3&loginId="+loginId+"&price="+price
			}
		});
		
		$(".plusbtn").click(function(){
			var loginId = $(".loginId").val();
			var price = $(this).parent().find(".price").val();
			location.href = "A_Controller?command=plusPointAction&loginId="+loginId+"&price="+price
		});
		
		
	})
</script>
<body>
<div>
	<div style = "float : left">
		<h1>메인페이지</h1>
	</div>
	
	<div style = "float:right">
	<input type = "hidden" class = "loginId" value = "${loginId}">
	<input type = "hidden" class = "loginPoint" value = "${point}">
		<br>
		${loginName}(${loginId})님 안녕하세요 <button class= "logoutBtn">로그아웃</button> <br>
		포인트 : ${point }점
	</div>
</div>

<div style = "clear : both"></div>

구입할 컨텐츠를 선택하세요. <br>
<div class= "frame">
	<div style = "float : left;">
		<input type = "hidden" class = "price" value = "100000" >
		<img alt="" src="./images/Intro_350_408.png" class= "imgA"> <br>
		100,000 포인트
	</div>
	
	<div style = "float : left;">
		<input type = "hidden" class = "price" value = "500000" >
		<img alt="" src="./images/Java_350_408.png" class= "imgB"> <br>
		500,000 포인트
	</div>
	
	<div style = "float : left;">
		<input type = "hidden" class = "price" value = "300000" >
		<img alt="" src="./images/Cpp_350_408.png" class= "imgC"> <br>
		300,000 포인트
	</div>
</div>
<br> <br>
<div style="float : right; border : 1px solid gray;">
	<광고> <br>
	<input type = "hidden" class = "price" value = "1000" >
	<img alt="" src="./images/korea_it.png" class= "plusbtn">
</div>

</body>
</html>