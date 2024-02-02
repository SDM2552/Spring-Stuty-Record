<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제목</title>
</head>
<body>

<button onclick="location.href='index.jsp'">처음으로</button >


<form action="insert.jsp" method="post">
이름	<input type="text" name="ename"><br/>
직무	<input type="text" name="job"><br/>
월급	<input type="text" name="sal"><br/><br/>
<input type="submit" value="입력">
<input type="reset" value="초기화"><br/>
</form>
</body>
</html>