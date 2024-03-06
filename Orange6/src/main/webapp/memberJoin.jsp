<%@page import="java.sql.Connection"%>
<%@page import="mvjsp.jdbc.connection.ConnectionProvider"%>
<%@page import="dto.Member"%>
<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<%
//    request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	Connection conn = ConnectionProvider.getConnection();
   	MemberDao dao = MemberDao.getInstance();
   			//MemberDao.getInstance().idCheck(request.getParameter("id"));
    
    
        if (id == dao.idCheck(conn, id)) {   
            // 이미 있는 아이디이면 오류 표시
%>
            <script>
                alert('이미 등록된 아이디입니다.');
                history.back()
            </script>
<%          
        } else {   	
            Member member1 = new Member(request.getParameter("id"  ),
                    request.getParameter("pw"  ),
                    request.getParameter("name"));
            conn = ConnectionProvider.getConnection();
            MemberDao.getInstance().insert(conn, member1);
            System.out.println("가입정보: "+member1.toString());
            System.out.println("가입 성공");
        	
%>
            <script>
                alert('가입이 완료되었습니다.');
            </script>
<%        
response.sendRedirect("index2.jsp");
        }
%>

</body>
</html>