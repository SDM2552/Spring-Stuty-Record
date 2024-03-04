<%@page import="java.sql.Connection"%>
<%@page import="mvjsp.jdbc.connection.ConnectionProvider"%>
<%@page import="java.util.List"%>
<%@page import="dto.Comments"%>
<%@page import="dao.CommentsDao"%>
<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    // 지정된 글 번호 얻기
    int num = Integer.parseInt(request.getParameter("num")); 

	// 게시글 데이터를 담을 변수 정의
	String name  = "";
	String title   = "";
	String content = "";
	String regtime = "";
	int    hits    = 0;
	
	String memberId = (String)session.getAttribute("userId");
	if (memberId == null) {
		response.sendRedirect("list.jsp");
	}
	Connection conn = ConnectionProvider.getConnection();
	BoardDao dao = BoardDao.getInstance();
	Board board = dao.selectOne(conn, num, true);
	
	// 글 데이터를 변수에 저장
    name  = board.getName();
    title   = board.getTitle();
    content = board.getContent();
    regtime = board.getRegtime();
    hits    = board.getHits();
	
	// 글 제목과 내용이 웹 페이지에 올바르게 출력되도록 
    // 공백과 줄 바꿈 처리
    title   = title.replace  (" ", "&nbsp;");
    content = content.replace(" ", "&nbsp;").replace("\n", "<br>");
    
  //댓글
    String commentWriter ="";
    String comment = "";
    String commentTime = "";
    conn = ConnectionProvider.getConnection();
    CommentsDao cdao = CommentsDao.getInstance();
    List<Comments> list = cdao.printComments(conn, num);
    request.setAttribute("board", board);
    request.setAttribute("clist", list);

%>

<jsp:forward page="/WEB-INF/view/post_view.jsp" />
