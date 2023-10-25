<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String context = request.getContextPath(); %>
<header> 로고나 top menu </header>
<nav>
	<ul>
	<li> 메뉴1 </li>
	<li> 메뉴2 </li>
	<li> <a href="<%=context%>/input"> 학생정보 입력 </a></li>
	</ul>
</nav>

<main>
	<h2> 메인화면 준비중</h2>

</body>
</html>