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
	BoardDao dao = BoardDao.getInstance();
	Board board = dao.selectOne(num, true);
	
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
    CommentsDao cdao = CommentsDao.getInstance();
    List<Comments> list = cdao.printComments(num);

%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Orange - <%=title%></title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="css/postStyles.css" rel="stylesheet" />
    <script src="https://kit.fontawesome.com/cb08c62fff.js" crossorigin="anonymous"></script>
</head>

<body>

    <!-- Page content-->
    <div class="container mt-5">
        <div class="row">
            <div class="col-lg-8">
                <!-- Post content-->
                <article>
                    <!-- Post header-->
                    <header class="mb-4">
                        <!-- Post title-->
                       
                        <h1 name="title" class="fw-bolder mb-1"><%=title%></h1>
                        <!-- Post meta content-->
                        <div class="text-muted fst-italic mb-2">Posted on <%=regtime%> by </div>
                         <div name="writer" class="text-muted fst-italic mb-2"><%=name%></div>
                         <div class="text-muted fst-italic mb-2">조회수 : <%=hits%></div>
                    </header>
                   
                    
                    <!-- Post content-->
                    <section class="mb-5">

                        <p name="content" class="fs-5 mb-4"><%=content%></p>
                    </section>
                </article>
                
                <!-- Comments section-->
                <section class="mb-5">
                    <div class="card bg-light">
                        <div class="card-body">
                            <!-- Comment form-->
                               <form action="commentwrite.jsp" method="post" cclass="mb-4" style="display: flex; align-items: center;">
                            	<input type="hidden" name="boardId" value="<%=num%>">
                                <textarea name="comment" lass="form-control mr-2" rows="3" placeholder="댓글 입력 칸"></textarea>
                                <button type="submit" id="commentbtn" class="btn btn-sm btn-primary btn1">댓글 작성</button>
                            </form>
                            <!-- Single comment-->
                            <!-- <div class="d-flex"> -->

                            <div class="ms-3">
                                <!-- <div class="fw-bold">댓글 작성자</div> -->
                                <!-- 댓글 내용 -->
                                <table class="commentwrap">
 <%
	for(Comments co :list) {
%>
                                    <td><%=co.getCommentWriter() %></td>
                                    <tr>
                                        <td><%=co.getComment() %></td>
                                        <td><%=co.getCommemtTime() %></td>
                                        <td><form action="commentdelete.jsp" method="post">
                                        <input type="hidden" name="commentId" value="<%=co.getCommentId() %>">
                                        <input type="hidden" name="boardId" value="<%=num%>">
                                        <button type="submit"><i class="fa-solid fa-square-xmark"></i></button>
                                        </form></td>
                                    </tr>
<%
	}
%>
                                 
                                </table>
                                <!-- </div> -->
                            </div>
                            <!-- </div> -->
                            
                        </div>
                </section>
                        
            </div>
             <div class="lastbtn">
                 		<button type="button" class="btn btn-primary btn1" onclick="location.href='list.jsp'">목록으로</button>
                        <button type="button" class="btn btn-primary btn1" onclick="location.href='writeForm.jsp?num=<%=num%>'">글 수정</button>
                        <button type="button" class="btn btn-primary btn1" onclick="location.href='delete.jsp?num=<%=num%>'">글 삭제</button>
                        </div>
        </div>
    </div>

    <!-- Bootstrap core JS-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Core theme JS-->
    <script src="js/scripts.js"></script>
</body>

</html>