<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	//클라이언트 쪽에 저장되어있는 쿠키정보를 가져오기
	Cookie cookie[] = request.getCookies();

	if (cookie != null) {
		out.print("쿠키의 개수 : " + cookie.length + "<br/>");
		for (Cookie co : cookie) {
			out.print(co.getName() + " = " + co.getValue() + "<br/>");
		String path = co.getPath();
		out.print(path);
		}
	} else {
		out.print("쿠키가 존재하지 않습니다.");
	}
	%>

</body>
</html>