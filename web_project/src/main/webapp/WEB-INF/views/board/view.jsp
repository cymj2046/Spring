<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 상세 보기</title>
<%@ include file="../include/board_header.jsp" %>
<script>
$(function(){
	$("#btnUpdate").click(function(){
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
		if(confirm("수정하시겠습니까")){
		document.form1.action="${path}/board/update";
		document.form1.submit();			
		}	
	});
	$("#btnDelete").click(function(){
		if(confirm("삭제하시겠습니까")){
		document.form1.action="${path}/board/delete";
		document.form1.submit();			
		}	
	});
});


</script>
</head>
<body>
<%@ include file="../include/board_menu.jsp" %>
<h2> 글 상세 보기 </h2>
<form name="form1" method="post">
	<div> 작성 날짜 : ${dto.regdate}</div>
	<div> 조회수 : ${dto.viewcnt}</div>
	* 제목 : <input type="text" name="title" value="${dto.title}" id="title"><br>
	* 내용 : <br> <textarea name="content" id="content" rows="4"
	cols="40" id="content"> ${dto.content}</textarea>
	<br>
	* 작성자 :
	<input type="text" name="writer" value="${dto.writer}" id="writer">
	
	<div>
		<input type="hidden" name="bno" value="${dto.bno}">
		<input type="button" value="수정" id="btnUpdate">
		<input type="button" value="삭제" id="btnDelete">
	</div>
</form>
</body>
</html>