<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>
<%
	String memberId = (String)session.getAttribute("userId"); 
	if(memberId==null){ //로그인 해야만 페이지 접근 가능
		response.sendRedirect("loginForm2.jsp");
	}
	BoardDao dao = BoardDao.getInstance();
	List<Board> list = dao.selectList();
%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Orange - 게시판</title>
    <link rel="icon" href="img/favicon.ico" type="image/x-icon">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
   <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style2.css">
  </head>
  <body>
<header>
        <div class="inner">
            <h1><a href="index2.jsp">Orange</a></h1>

            <ul id="gnb">
                <li><a href="list.jsp">Orange</a></li>
                <li><a href="list.jsp">Orange</a></li>
                <li><a href="list.jsp">Orange</a></li>
                <li><a href="list.jsp">Orange</a></li>
                <li><a href="list.jsp">Orange</a></li>
            </ul>

            <ul class="util">
<%
if(session.getAttribute("userId")!=null){	
%>
	<li><form action="logout.jsp" method="post">
	<%=session.getAttribute("userName")%> 님 환영합니다.
	<input class="info" type="submit" value="로그아웃">
	<input class="info" type="button" value="회원 정보 수정"
			onclick="location.href='memberUpdateForm2.jsp'">
	</form></li>
	
<%
} else {
%>
				<li><input class="info" type="button" value="로그인"
			onclick="location.href='loginForm2.jsp'"></li>
			<li><input class="info" type="button" value="회원 가입"
			onclick="location.href='memberJoinForm2.jsp'"></li>
<%
}
%>
				<li><input class="info" type="button" value="메인 페이지"
			onclick="location.href='index2.jsp'"></li>
            </ul>
        </div>
    </header>
 
<div class="container" style="padding-top: 50px;">
    <div class="listheader"><h1> ORANGE BOARD</h1></div>
<table class="table table-bordered table-hover">
    <tr>
        <th class="num"    >번호    </th>
        <th class="title"  >제목    </th>
        <th class="name" >작성자  </th>
        <th class="regtime">작성일시</th>
        <th  class="hits"   >조회수  </th>
    </tr>
<%
	for(Board bo :list) {
%>         
        <tr>
            <td><%=bo.getNum()%></td>
            <td style="text-align:left;">
                <a href="post.jsp?num=<%=bo.getNum()%>">
                    <%=bo.getTitle()%> (<%=bo.getcCount() %>)
                </a>
            </td>
            <td><%=bo.getName()%></td>
            <td><%=bo.getRegtime()%></td>
            <td><%=bo.getHits()%></td>
        </tr>
<%
	}
%>
</table>
</div>

<div class="container" style="padding-top: 50px;">
<input type="submit" value="글쓰기" class="btn btn-outline-warning" onclick="location.href='writeForm.jsp'">
</div>

    <footer>
        <div class="inner">
            <div class="upper">
                <h1>Orange Company</h1>
                <ul>
                    <li><a href="#">Policy</a></li>
                    <li><a href="#">Terms</a></li>
                    <li><a href="#">Family Site</a></li>
                    <li><a href="#">Sitemap</a></li>
                </ul>
            </div>

            <div class="lower">
                <address>
                    Orange is awesome fruits where you seen in the world!<br>
                    TEL : 031-123-1234 C.P : 010-1234-5678
                </address>
                <p>
                    2024 Orange Company &copy; copyright all right reserved.
                </p>
            </div>
        </div>
    </footer>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>
