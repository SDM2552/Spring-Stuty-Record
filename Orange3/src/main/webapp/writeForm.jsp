<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    // 글 번호 값 얻기, 주어지지 않았으면 0으로 설정
    String tmp = request.getParameter("num");
    int num = (tmp != null && tmp.length() > 0) ? Integer.parseInt(tmp)
                                                : 0;

    // 새 글쓰기 모드를 가정하고 변수 초기값 설정
    String title   = "";
    String writer  = (String)session.getAttribute("userName");;
    String content = "";
    String action  = "insert.jsp";

    // 글 번호가 주어졌으면, 글 수정 모드
    if (num > 0) {
		BoardDao dao = BoardDao.getInstance();
		Board board = dao.selectOne(num, false);
		

		title = board.getTitle();
		content = board.getContent();
		
		action = "update.jsp?num="+num;
        
    }
%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Orange - 글쓰기</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
        <script src="https://cdn.ckeditor.com/ckeditor5/34.0.0/classic/ckeditor.js"></script>
        <script src="https://cdn.ckeditor.com/ckeditor5/34.0.0/classic/translations/ko.js"></script>
        <script>
          ClassicEditor.create( document.querySelector( '#editor' ), {
            language: "ko"
          } );
        </script>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="css/writeStyles.css" rel="stylesheet" />

</head>

<body>

    <!-- Page content-->
    <div class="container mt-5">
        <div class="row">
            
                <!-- Post content-->
                <article class="writewrap">
                    <h1> 글 작성</h1>
                    <form action="<%=action%>" method="POST">
                        <!-- Post header-->
                        <header class="mb-4">
                            <!-- Post title-->
                            
                            <div class="col-12">

                                <input type="text" name="title" value="<%=title%>" class="form-control" id="address" placeholder="제목" required>
                                <div class="invalid-feedback">
                                    제목을 입력해 주세요.
                                </div>
                            </div>
                            <div class="col-12"> <!-- 작성자 -->
                                <input type="text" readonly name="writer" value="<%=writer%>" class="form-control" id="address" placeholder="<%=session.getAttribute("userName")%>"
                                    required>

                            </div>
                            <!-- Post meta content-->
                            <div class="text-muted fst-italic mb-2">바르고 고운 말을 써 주세요.</div>
                        </header>
                        <!-- Post content-->
                        <section class="mb-5">

                            <textarea name="content" id="editor"><%=content%></textarea>
                        </section>
                        <div class="forbutton">
                            <button type="submit" class="btn btn-warning">저장</button>
                            <button type="button" class="btn btn-warning" onclick="history.back()">취소</button>
                        </div>
                    </form>
                </article>


            
        </div>
    </div>

    <!-- Bootstrap core JS-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Core theme JS-->
    <script src="js/scripts.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
    <script src="https://cdn.ckeditor.com/ckeditor5/34.0.0/classic/ckeditor.js"></script>
    <script>
        ClassicEditor.create(document.querySelector('#editor'));
    </script>
</body>

</html>