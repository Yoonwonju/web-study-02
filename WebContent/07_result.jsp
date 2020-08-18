<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>당신이 입력한 정보입니다.</h3>
	성별 : ${gender }, <br>
	메일 정보 수신 여부 : ${chk_mail }, <br>
	가입 인사 : <br><br>
	${content }<br>
	<br><a href = 'javascript:history.go(-1)'>이전 페이지로 이동</a>
</body>
</html>