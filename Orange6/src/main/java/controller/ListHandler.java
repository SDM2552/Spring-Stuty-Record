package controller;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BoardDao;
import dto.Board;
import mvc.command.CommandHandler;
import mvjsp.jdbc.connection.ConnectionProvider;

public class ListHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		HttpSession session = req.getSession();
		String memberId = (String)session.getAttribute("userId"); 
//		if(memberId==null){ //로그인 해야만 페이지 접근 가능
//			response.sendRedirect("loginForm2.jsp");
//		}

		Connection conn = ConnectionProvider.getConnection();
		BoardDao dao = BoardDao.getInstance();
		List<Board> list = dao.selectList(conn);
		req.setAttribute("list", list);
		return "/WEB-INF/view/list_view.jsp";
	}

}
