<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<%@ include file="../include/member_menu.jsp" %>

</head>
<body>
<h2> 로그인 </h2>
<hr>
<form name="form1" method="post" action="${path}/login/loginCheck">
	* 아이디 : <input type="text" name="userId"> <br>
	* 비밀번호 : <input type="password" name="userPw"> <br>
	<input type="submit" value="로그인">
	<input type="reset" value="로그인취소">
</form>

<c:if test="${msg=='실패'}">
	<div> 아이디와 비밀번호 불일치 </div>
</c:if>
<c:if test="${msg=='logout'}">
	<div> 로그아웃 되었습니다. </div>
</c:if>

</body>
</html>