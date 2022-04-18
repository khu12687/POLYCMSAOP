<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<script src="/js/jquery-3.6.0.min.js"></script>
<script src="/js/article_count.js"></script>
</head>
<body>
	<div>		
		<div>
			<label>제목</label>
			<div>${item.subject}</div>	
		</div>
		
		<div>
			<label>내용</label>
			<div>${item.contents}</div>	
		</div>
		
		<div>
			<div id="good_count">
				<p>${item.goodCount}</p> 
				<button >좋아요</button>
			</div>
			<div id="bad_count">
				<p>${item.badCount}</p> 
				<button >싫어요</button>
			</div>
		</div>
		
		<div>
			<a href="../list">목록</a>			
		</div>			
	</div>	
</body>
</html>