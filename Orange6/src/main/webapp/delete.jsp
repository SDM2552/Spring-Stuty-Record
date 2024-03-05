<%@page import="mvjsp.jdbc.connection.ConnectionProvider"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>  
    
<%
    // 지정된 글 번호 얻기
    int num = Integer.parseInt(request.getParameter("num"));

	String memberId = (String)session.getAttribute("userId"); 
	if(memberId==null){ //로그인 해야만 페이지 접근 가능
		response.sendRedirect("list.jsp");
	}
	Connection conn = ConnectionProvider.getConnection();
	BoardDao dao = BoardDao.getInstance();
	dao.delete(conn, num);
 %>
 <script>
	alert('글이 삭제됐습니다.');
	location.href="list.do";
</script>
  <%
    
//     목록보기 화면으로 돌아감
//    response.sendRedirect("list.jsp");
%>