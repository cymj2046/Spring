<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="path" value="${pageContext.request.contextPath}"/>
	<a href="${path}/member/list"> 목록보기 </a>
	<a href="${path}/member/write"> 등록하기 </a>
</body>
</html>