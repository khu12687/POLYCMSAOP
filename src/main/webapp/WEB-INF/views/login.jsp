<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<script>
if(${msg !=null})
	window.onload = function(){
		alert("${msg}");
	}
</script>
<style>
.error_msg{
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<div>
		<div>
			<h1>로그인</h1>
			<c:if test="${msg != null}">
				<div class="error_msg">${msg}</div>
			</c:if>
		</div>
		
		<form method="post">
			<div>
				<label>아이디:</label>
				<input type="text" name="id">
			</div>
			
			<div>
				<label>비밀번호:</label>
				<input type="password" name="passwd">
			</div>
			
			<div>
				<button>로그인</button>
			</div>
		</form>
	</div>
</body>
</html>