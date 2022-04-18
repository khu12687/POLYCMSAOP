<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<div>
		<div>
			<h3>사용자 등록</h3>
		</div>
		<form method="post">
			<div>
				<label>아이디</label>
				<input type="text" name="id">	
			</div>			
			
			<div>
				<label>비밀번호</label>
				<input type="text" name="passwd">	
			</div>
			
			<div>
				<label>성명</label>
				<input type="text" name="name">	
			</div>
			
			<div>
				<label>등급</label>
				<input type="number" name="grade">	
			</div>
			
			<div>
				<button>등록</button>
				<button type="button">취소</button>
			</div>			
		</form>
	</div>	
</body>
</html>