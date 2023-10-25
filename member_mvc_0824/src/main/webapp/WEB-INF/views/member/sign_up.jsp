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
<h3> 회원 가입 -> SignUP </h3>
<form name="frm1" method="post" action="<%=context%>/signUpConfirm">
	<p> * 아이디 : <input type="text" name="m_id"> </p>
	<p> * 비번 : <input type="text" name="m_pw"> </p>
	<p> * 이메일 : <input type="text" name="m_mail"> </p>
	<p> * 번호 : <input type="text" name="m_phone"> </p>
	<input type="submit" value="sign_up">
	<input type="reset" value="cancel">
</form>
</body>
</html>