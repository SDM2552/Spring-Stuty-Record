<%@page import="dto.Member"%>
<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("utf-8");
	System.out.println("MemberUpdateForm.jsp으로 이동");//디버그용
	Member member = MemberDao.getInstance().select(
			(int)session.getAttribute("userNumId"));
	System.out.println("member 생성 완료");//디버그용

%>
<!doctype html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="">
  <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
  <meta name="generator" content="Hugo 0.88.1">
  <title>회원 정보 수정</title>
	<link rel="icon" href="img/favicon.ico" type="image/x-icon">
  <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/checkout/">



  <!-- Bootstrap core CSS -->
  <link href="assets/dist/css/bootstrap.min.css" rel="stylesheet">

  <style>
    .bd-placeholder-img {
      font-size: 1.125rem;
      text-anchor: middle;
      -webkit-user-select: none;
      -moz-user-select: none;
      user-select: none;
    }

    @media (min-width: 768px) {
      .bd-placeholder-img-lg {
        font-size: 3.5rem;
      }
    }
  </style>


  <!-- Custom styles for this template -->
  <link href="css/form-validation.css" rel="stylesheet">
</head>

<body class="bg-light">

  <div class="container">
    <main>
      <div class="py-5 text-center">
        <img class="mb-4" src="img/orange300.png" alt="Orange" width="200" height="200">
        <h2>회원 정보 수정</h2>
      </div>

      <div class="wrap">
        <div class="col-md-7 col-lg-8">
          <h4 class="mb-3">회원 정보</h4>
          <form action="memberUpdate.jsp" method="post" class="needs-validation" novalidate>
            <div class="row g-3">


              <div class="col-12">
                <label for="address" class="form-label">아이디</label>
                <input type="text" name="id" class="form-control" value="<%=member.getId()%>" id="address" placeholder="아이디 입력" required>
                <div class="invalid-feedback">
                  이 칸은 반드시 채워야 합니다.
                </div>
              </div>

              <div class="col-12">
                <label for="address" class="form-label">비밀번호</label>
                <input type="password" name="pw" readonly class="form-control" value="<%=member.getPw()%>" id="address" placeholder="비밀번호 입력" required>
                <div class="invalid-feedback">
                  이 칸은 반드시 채워야 합니다.
                </div>
              </div>

              <div class="col-12">
                <label for="address" class="form-label">이름</label>
                <input type="text" name="name" class="form-control" value="<%=member.getName()%>" id="address" placeholder="이름 입력" required>
                <div class="invalid-feedback">
                  이 칸은 반드시 채워야 합니다.
                </div>
              </div>

            </div>


            <hr class="my-4">

            <div class="btn-wrap">
              <button class="w-100 btn btn-primary btn-lg" type="submit">수정 완료</button>
            </div>
            <div class="btn-wrap">
              <button class="w-100 btn btn-primary btn-lg" type="button" onclick="history.back()">취소</button>
            </div>
            <div class="btn-wrap2">
              <button class="w-100 btn btn-danger btn-lg" type="button">계정 탈퇴</button>
            </div>
          </form>
        </div>
      </div>
    </main>
    <footer class="my-5 pt-5 text-muted text-center text-small">
      <p class="mb-1">&copy; 2024–2024 Orange Company</p>
      <ul class="list-inline">
        <li class="list-inline-item"><a href="#">Privacy</a></li>
        <li class="list-inline-item"><a href="#">Terms</a></li>
        <li class="list-inline-item"><a href="#">Support</a></li>
      </ul>
    </footer>
  </div>


  <script src="assets/dist/js/bootstrap.bundle.min.js"></script>

  <script src="js/form-validation.js"></script>
</body>

</html>