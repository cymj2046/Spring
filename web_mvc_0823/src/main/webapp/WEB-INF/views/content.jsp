<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> content 공간 => model 클래스 이용 </h1>
	<h2>결과 - 아이디: ${id} </h2>
	<h2>결과 - 비번: ${pass} </h2>
	
	<h2> <%=request.getAttribute("id") %> </h2>
</body>
</html>