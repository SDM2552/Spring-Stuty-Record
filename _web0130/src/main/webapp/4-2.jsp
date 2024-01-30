<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제목</title>
  <link rel="stylesheet" href="css/style.css">

</head>
<body>
<h1 id="maintitle">국영수 점수 입력</h1>
<form action="4-2.jsp" method="get">
	국어: <%=request.getParameter("kor")%><br/>
	영어: <%=request.getParameter("eng")%><br/>
	수학: <%=request.getParameter("math")%><br/>
</form>
</body>
</html>