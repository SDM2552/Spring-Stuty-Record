<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적표</title>
</head>
<body>

<button onclick="location.href='index.jsp'">처음으로</button >

<form action="Insert.jsp" method="post">
번호	<input type="text" name="num"><br/>
이름	<input type="text" name="name"><br/>
국어	<input type="text" name="kor"><br/>
영어	<input type="text" name="eng"><br/>
수학	<input type="text" name="math"><br/>
<br/>
<input type="submit" value="입력">
<input type="reset" value="초기화"><br/>
</form>
</body>
</html>