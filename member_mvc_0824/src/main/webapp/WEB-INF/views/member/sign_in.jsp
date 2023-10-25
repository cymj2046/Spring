<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String context = request.getContextPath(); %>
<h3> 로그인 -> SignIn </h3>
<form name="frm1" method="post" action="<%=context%>/signInConfirm">
	<p> * 아이디 : <input type="text" name="m_id"> </p>
	<p> * 비번 : <input type="text" name="m_pw"> </p>
	<input type="submit" value="sign_in">
	<input type="reset" value="cancel">
</form>
</body>
</html>