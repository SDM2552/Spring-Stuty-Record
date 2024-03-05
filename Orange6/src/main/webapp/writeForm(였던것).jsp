<%@page import="java.sql.Connection"%>
<%@page import="mvjsp.jdbc.connection.ConnectionProvider"%>
<%@page import="java.util.List"%>
<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

String memberId = (String)session.getAttribute("userId"); 
//if(memberId==null){ //로그인 해야만 페이지 접근 가능
//	response.sendRedirect("loginForm2.jsp");
//}
Connection conn = ConnectionProvider.getConnection();
BoardDao dao = BoardDao.getInstance();
//List<Board> list = dao.selectList(conn);

    // 글 번호 값 얻기, 주어지지 않았으면 0으로 설정
    String tmp = request.getParameter("num");
    int num = (tmp != null && tmp.length() > 0) ? Integer.parseInt(tmp)
                                                : 0;

    // 새 글쓰기 모드를 가정하고 변수 초기값 설정
    String title   = "";
    String writer  = (String)session.getAttribute("userName");
    String content = "";
    String action  = "insert.jsp";
   // int userNumId = (int)session.getAttribute("userNumId");

    // 글 번호가 주어졌으면, 글 수정 모드
    if (num > 0) {

		Board board = dao.selectOne(conn, num, false);
		System.out.println("board값을 가져오나? "+board);
		
		conn.close();
		
		System.out.println("num값을 가져오나? "+num);
		

		title = board.getTitle();
		content = board.getContent();
        
		action = "update.jsp?num="+num;
		request.setAttribute("board", board);
        request.setAttribute("action", action);
        System.out.println("board request 체크 "+board);
        System.out.println("action requuest 체크 "+action);
        
    }
    
%>
<jsp:forward page="/WEB-INF/view/writeForm_view.jsp" />