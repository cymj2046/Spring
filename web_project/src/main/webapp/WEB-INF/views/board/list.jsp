<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시글 목록</title>
<%@ include file="../include/board_header.jsp" %>
</head>
<body>
<%@ include file="../include/board_menu.jsp" %>
    <h2> 게시글 목록</h2>
    
 <form name="form1" method="post" action="${path}/board/list">
 <select name="searchOption">
 <option value="all" <c:out value="${map.searchOption=='all'?'selected':''}"/>> 전체 </option>
 <option value="writer" <c:out value="${map.searchOption=='writer'?'selected':''}"/>>작성자</option>
 <option value="content" <c:out value="${map.searchOption=='content'?'selected':''}"/>>내용 </option>
 <option value="title" <c:out value="${map.searchOption=='title'?'selected':''}"/>>제목</option>
 </select>
 
 <input type="text" name="keyword" value="${map.keyword}" />
 <input type="submit" value="조회" />
 </form>
 <div>
 ${map.count} 개의 게시글 목록입니다.
 </div>
  
  <table border="1" width="600">
        <tr>
            <th>번호</th>
            <th>제목</th>
            <th>이름</th>
            <th>작성일</th>
            <th>조회수</th>
        </tr>
        <c:forEach var="row" items="${map.list}">
        <tr>
            <td>${row.bno}</td>
            <td><a href="${path}/board/view?bno=${row.bno}">${row.title}</a></td>
            <td>${row.writer}</td>
            <td>${row.regdate} </td>
            <td>${row.viewcnt}</td>
        </tr>    
        </c:forEach>
</table>
</body>
</html>