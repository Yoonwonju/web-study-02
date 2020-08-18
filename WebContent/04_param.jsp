<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="param.js"></script>
</head>
<body>
	<form method="get" action="ParamServlet" name="frm">
		아이디 : <input type = "text" name = "id"><br>
		나&nbsp;이 : <input type = "text" name = "age"><br>
		<input type = "submit" value = "전송" onclick="return check()">
	</form>
	
	<hr>
	<!--  -->
	
	<h3>get 방식에서 한글 깨짐 방지</h3>
	<form method = "get" action = "InfoServlet">
		이&nbsp;름 : <input type = "text" name = "name"><br>
		주&nbsp;소 : <input type = "text" name = "addr"><br>
		<input type = "submit" value = "전송">
	</form>
	<hr>
	<h3>post 방식에서 한글 깨짐 방지</h3>
	<form method = "post" action = "InfoServlet">
		이&nbsp;름 : <input type = "text" name = "name"><br>
		주&nbsp;소 : <input type = "text" name = "addr"><br>
		<input type = "submit" value = "전송">
	</form>
	
	<hr>
	<!--  -->
	
	<h3>로그인 폼</h3>
	<form method = "get" action = "LoginServlet">
		<label for = "userid">아이디</label> : <input type = "text" name = "id" id = "userid"><br>
		<label for = "userpwd">암&nbsp;호</label> : <input type = "password" name = "pwd" id = "userpwd"><br>
		<input type = "submit" value = "로그인">
	</form>
	
	<hr>
	<!--  -->
	
	<h3>글상자와 라디오버튼</h3>
	<form method = "get" action = "RadioServlet">
		<label for = "gender"> 성별 : </label>
		<input type = "radio" id = "gender" name = "gender" value = "남자" checked> 남자
		<input type = "radio" id = "genter" name = "gender" value = "여자"> 여자<br><br><hr>
		
		<label for = "chk_mail"> 메일 정보 수신 여부 : </label>
		<input type = "radio" id = "chk_mail" name = "chk_mail" value = "yes" checked> 수신
		<input type = "radio" id = "chk_mail" name = "chk_mail" value = "no"> 거부<br><hr>
		
		<label for = "content"> 간단한 가입 인사를 적어주세요~ </label><br>
		<textarea id = "content" name = "content" rows="3" cols="30"></textarea><br>
		<input type = "submit" value = "전송"><br><br><hr>
	</form>
	
	<hr>
	<!--  -->
	
	<h3>체크박스와 getParameterValues()</h3>
	<form method = "get" action = "CheckboxServlet">
		<input type = "checkbox" name = "item" value = "신발"> 신발
		<input type = "checkbox" name = "item" value = "가방"> 가방
		<input type = "checkbox" name = "item" value = "벨트"> 벨트<br>
		<input type = "checkbox" name = "item" value = "모자"> 모자
		<input type = "checkbox" name = "item" value = "시계"> 시계
		<input type = "checkbox" name = "item" value = "쥬얼리"> 쥬얼리<br>
		<input type = "submit" value = "전송">
	</form>
	
	<hr>
	<!--  -->
	
	<h3>콤보박스와 리스트박스</h3>
	<form method = "get" action = "ComboboxListboxServelet">
		<label for = "job">직업</label>
		<select id = "job" name = "job" size = "1">
			<option value ="">선택하세요</option>
			<option value ="학생">학생</option>
			<option value ="컴퓨터/인터넷">컴퓨터/인터넷</option>
			<option value ="언론">언론</option>
			<option value ="공무원">공무원</option>
			<option value ="군인">군인</option>
			<option value ="서비스업">서비스업</option>
			<option value ="교육">교육</option>
		</select>
	<hr>
	<!--  -->
	
	<label for = "interest">관심분야</label>
		<select id = "interest" name = "interest" multiple = "multiple">
			<option value = "에스프레소">에스프레소</option>
			<option value = "로스팅">로스팅</option>
			<option value = "생두">생두</option>
			<option value = "원두">원두</option>
			<option value = "핸드드립">핸드드립</option>
		</select>
		<input type = "submit" value = "전송">
	<br><br>
	</form>
	
</body>
</html>




























