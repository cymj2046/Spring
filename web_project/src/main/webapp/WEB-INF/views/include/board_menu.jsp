<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- context 경로 -->

<c:set var="path" value="${pageContext.request.contextPath}"/>

<a href="${path}/board/list">게시판보기</a> <br />

<a href="${path}/board/write">글쓰기</a> 
   