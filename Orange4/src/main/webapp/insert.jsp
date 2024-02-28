<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>  
<%@ page import="java.time.*" %>
 
<%
    request.setCharacterEncoding("utf-8");

    // 양식에 입력되었던 값 읽기
    String title   = request.getParameter("title"  );
    String writer  = request.getParameter("writer" );
    String content = request.getParameter("content");
    int memberno = (int)session.getAttribute("userNumId");
    System.out.println(title+writer+content+memberno);

    // 빈 칸이 하나라도 있으면 오류 출력하고 종료
    if (writer  == null || writer.length()  == 0 ||
        title   == null || title.length()   == 0 ||
        content == null || content.length() == 0) {
%>      
        <script>
            alert('모든 항목이 빈칸 없이 입력되어야 합니다.');
            history.back();
        </script>
<%        
        return;
    }

	String memberId = (String)session.getAttribute("userId"); 
	if(memberId==null){ //로그인 해야만 페이지 접근 가능
		response.sendRedirect("loginForm.jsp");
		return;
	}
	BoardDao dao = BoardDao.getInstance();
	Board board = new Board(title, content, memberno);
	dao.insert(board);
    
    // 목록보기 화면으로 돌아감
    if (!response.isCommitted()) { // 응답이 아직 커밋되지 않았을 경우에만 리다이렉션 수행
        response.sendRedirect("list.jsp");
    }
%>     