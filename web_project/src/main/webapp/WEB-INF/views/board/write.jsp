<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 글쓰기</title>
<%@ include file ="../include/board_header.jsp" %>

<script>
$(function(){
	$("#btnWrite").click(function(){
		var title=$("#title").val();
		var content=$("#content").val();
		var writer=$("#writer").val();
		//document.form1.title.value 동일한 기능
	
		if(title==""){ //빈 공백 체크
			alert("제목을 입력하세요");
			docuemnt.form1.title.focus();
			return;
		}
		
		if(content=""){
			alert("내용을 입력하세요");
			docuemnt.form1.title.focus();
			return;
		}
		
		if(writer==""){
			alert("작성자를 입력하세요");
			docuemnt.form1.title.focus();
			return;
		}
	
		document.form1.action="${path}/board/insert";
		document.form1.submit();			
			
	});
});

</script>

</head>
<body>
<%@ include file ="../include/board_menu.jsp" %>
<h2> 글쓰기 </h2>
<form name="form1" method="post">
	* 제목: <input type="text" name="title" id="title"> <br>
	* 내용: <br>
	 <textarea name="content" rows="4" cols="40" id="content"> </textarea>
	<br>
	* 작성자: <input type="text" name="writer" id="writer"> <br>
	
	<input type="button" value="확인" id="btnWrite">
	<input type="reset" value="취소"> 
</form>
</body>
</html>