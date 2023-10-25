<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="../include/member_header.jsp" %>

<script>
	$(function() {
		$("#btnDelete").click(function() {
			if(confirm("삭제하시겠습니까?")){
				document.form1.action="${path}/project/member/delete";
				document.form1.submit();
			}
		});
		$("#btnUpdate").click(function() {
			if(confirm("수정하시겠습니까?")){
				document.form1.action="${path}/project/member/update";
				document.form1.submit();
			}
		});
		
	});


</script>

</head>
<body>
<h2> 회원 상세보기 </h2>
<hr>
<form name="form1" method="post">
* 아이디 : <input type="text" name="userId" value="${dto.userId}" readonly> <br>
* 비밀번호 : <input type="password" name="userPw"> <br>
* 이름 : <input type="text" name="userName" value="${dto.userName}"> <br>
* 이메일 : <input type="text" name="userEmail" value="${dto.userEmail}"> <br>


	<input type="button" value="수정" id="btnUpdate">
	<input type="button" value="삭제" id="btnDelete">

</form>
<div> ${message} </div>
</body>
</html>