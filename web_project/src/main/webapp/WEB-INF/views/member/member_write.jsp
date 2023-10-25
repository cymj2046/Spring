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
<h2> 회원 등록 화면 </h2>
<hr>
<form name="form1" method="post" action="${path}/member/insert">
* 아이디 : <input type="text" name="userId"> <br>
* 비밀번호 : <input type="password" name="userPw"> <br>
* 이름 : <input type="text" name="userName"> <br>
* 이메일 : <input type="text" name="userEmail"> <br>
<input type="submit" value="등록">
<input type="reset" value="취소">

</form>
</body>
</html>