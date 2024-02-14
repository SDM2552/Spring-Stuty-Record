<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dao.BoardDao" %>
<%@ page import="java.sql.*" %>  
    
<%
    // 지정된 글 번호 얻기
    int num = Integer.parseInt(request.getParameter("num"));

	BoardDao dao = BoardDao.getInstance();
        // 쿼리 실행
        dao.delete(num);
        
    } catch(Exception e) {
        e.printStackTrace();
    }
    
    // 목록보기 화면으로 돌아감
    response.sendRedirect("list.jsp");
%>