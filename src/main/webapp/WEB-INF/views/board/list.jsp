<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>날짜</th>
			<th>조회수</th>
		</tr>	
	</thead>
	<tbody>
		<c:forEach items="${list}" var="list">
 			<tr>
				<td>${list.SEQ}</td>
				<td>${list.SUBJECT}</td>
				<td>${list.CONTENT}</td>
				<td>${list.NAME}</td>
				<td>${list.REGDATE}</td>
				<td>${list.READCOUNT}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>