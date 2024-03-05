package controller;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BoardDao;
import dao.CommentsDao;
import dto.Board;
import dto.Comments;
import mvc.command.CommandHandler;
import mvjsp.jdbc.connection.ConnectionProvider;

public class PostHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		 // 지정된 글 번호 얻기
	    int num = Integer.parseInt(req.getParameter("num")); 

		// 게시글 데이터를 담을 변수 정의
		String name  = "";
		String title   = "";
		String content = "";
		String regtime = "";
		int    hits    = 0;
		
		HttpSession session = req.getSession();
		String memberId = (String)session.getAttribute("userId");
		if (memberId == null) {
			res.sendRedirect("list.jsp");
		}
		Connection conn = ConnectionProvider.getConnection();
		BoardDao dao = BoardDao.getInstance();
		Board board = dao.selectOne(conn, num, true);
		conn.close();
		
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
	    req.setAttribute("board", board);
	    req.setAttribute("clist", list);
		
		return "/WEB-INF/view/post_view.jsp";
	}

}
