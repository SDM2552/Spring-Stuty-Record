package controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDao;
import dto.Member;
import mvc.command.CommandHandler;
import mvjsp.jdbc.connection.ConnectionProvider;

public class memberUpdateFormHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		HttpSession session = req.getSession();
				Connection conn = ConnectionProvider.getConnection();
		Member member = MemberDao.getInstance().select(conn, 
				(int)session.getAttribute("userNumId"));
		req.setAttribute("member", member);
		System.out.println("회원정보수정 체크 "+member);
		
		return "/WEB-INF/view/memberUpdateForm_view.jsp";
	}
	
	

}
