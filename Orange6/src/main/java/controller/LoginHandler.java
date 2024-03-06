package controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDao;
import dto.Member;
import mvc.command.CommandHandler;
import mvjsp.jdbc.connection.ConnectionProvider;
import util.Cookies;

public class LoginHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		Connection conn = ConnectionProvider.getConnection(); //연걸은 이걸로
		Member member = MemberDao.getInstance().selectForLogin(conn, id, pw);
		HttpSession session = req.getSession();
		
		String remember = req.getParameter("remember");
		String rememberId = req.getParameter("id");
		System.out.println(remember);
		if (remember != null && remember.equals("on")) {
			res.addCookie(Cookies.createCookie("rememberId", rememberId, "/", 60 * 60));
			System.out.println("생성된 쿠키: " + req.getParameter("remember")+" + "+req.getParameter("id"));
		} else {
			res.addCookie(Cookies.createCookie("rememberId", "", "/", 0));
		}
		
		if(member != null){
		session.setAttribute("userNumId", member.getNumId());
		session.setAttribute("userId", member.getId());
		session.setAttribute("userName", member.getName());
//		res.sendRedirect("index2.jsp");
		System.out.println("세션에 저장된 값: " +member.getNumId()+" + "+member.getId()+" + "+member.getName() );
		
		return "/WEB-INF/view/redirect.jsp";
		}
		
		return "/WEB-INF/view/loginFail.jsp";
	}

}
