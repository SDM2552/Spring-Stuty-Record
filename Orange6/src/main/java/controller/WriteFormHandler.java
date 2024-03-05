package controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BoardDao;
import dto.Board;
import mvc.command.CommandHandler;
import mvjsp.jdbc.connection.ConnectionProvider;

public class WriteFormHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		HttpSession session = req.getSession();
		String memberId = (String)session.getAttribute("userId"); 
		//if(memberId==null){ //로그인 해야만 페이지 접근 가능
//			response.sendRedirect("loginForm2.jsp");
		//}
		Connection conn = ConnectionProvider.getConnection();
		BoardDao dao = BoardDao.getInstance();
		//List<Board> list = dao.selectList(conn);

		    // 글 번호 값 얻기, 주어지지 않았으면 0으로 설정
		    String tmp = req.getParameter("num");
		    int num = (tmp != null && tmp.length() > 0) ? Integer.parseInt(tmp)
		                                                : 0;

		    // 새 글쓰기 모드를 가정하고 변수 초기값 설정
		    String title   = "";
		    String writer  = (String)session.getAttribute("userName");
		    String content = "";
		    String action  = "insert.jsp";
		   // int userNumId = (int)session.getAttribute("userNumId");
		    req.setAttribute("writer", writer);
		    req.setAttribute("action", action);

		    // 글 번호가 주어졌으면, 글 수정 모드
		    if (num > 0) {

				Board board = dao.selectOne(conn, num, false);
				System.out.println("board값을 가져오나? "+board);
				
				conn.close();
				
				System.out.println("num값을 가져오나? "+num);
				
				title = board.getTitle();
				content = board.getContent();
		        
				action = "update.jsp?num="+num;
				req.setAttribute("board", board);
		        req.setAttribute("action", action);
		        System.out.println("board request 체크 "+board);
		        System.out.println("action requuest 체크 "+action);
		        
		    }
		
		return "/WEB-INF/view/writeForm_view.jsp";
	}

}
