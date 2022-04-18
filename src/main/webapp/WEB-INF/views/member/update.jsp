<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<div>
		<div>
			<h3>사용자 변경</h3>
		</div>
		<form method="post">
			<div>
				<label>아이디</label>
				<input type="text" name="id" value="${item.id}">	
			</div>			
			
			<div>
				<label>비밀번호</label>
				<input type="text" name="passwd" value="${item.passwd}">	
			</div>
			
			<div>
				<label>성명</label>
				<input type="text" name="name" value="${item.name}">	
			</div>
			
			<div>
				<label>등급</label>
				<input type="number" name="grade" value="${item.grade}">	
			</div>
			
			<div>
				<label>가입일시</label>
				<div><fmt:formatDate value="${item.regDate}" pattern="yyyy년 MM월 dd일 HH:mm:ss"/></div>	
			</div>
			
			<div>
				<button>변경</button>
				<button type="button">취소</button>
			</div>			
		</form>
	</div>	
</body>
</html>