<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet - doGet & doPost</title>
</head>
<body>
	<form method="get" action="MethodSevlet">
		<input type="submit" value="get 방식으로 호출하기">
	</form>
	<br><br>
	<form method="post" action="MethodServlet">
		<input type="submit" value="post 방식으로 호출하기">
	</form>
</body>
</html>