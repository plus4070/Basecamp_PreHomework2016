<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %> 
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/bootstrap/bootstrap.min.css'/>" />
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/board/boardList.css'/>" />
<title>Basecamp_PreHomeworwk</title>
</head>
<body>
	<div class="bs-callout-info">
		<p>방명록</p>
	</div>
	<div id="listDiv">
		<table class="table" style="width: 1000px; word-break: break-all;">
			<thead>
				<tr>
					<th id="docNum">글 번호</th>
					<th id="docEmail">이메일</th>
					<th id="docContent">본문</th>
					<th id="docDate">글 등록시간</th>
					<th id="docEDate">글 수정시간</th>
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${f:length(boardList) > 0}">
						<c:set var="rowLen" value="${f:length(boardList)}" />
						<c:forEach items="${boardList}" var="row" varStatus="status">
						<tr>
								<td style="text-align: center;">${rowLen-status.index}</td>
								<td>${row.boardEmail}</td>
								<td>${row.boardContent }</td>
								<td>${row.writeDateTime }</td>
								<td>${row.editDateTime}</td>
								<td id="editBtnCol"><input type="button"	id="edit${row.boardId }" value="수정" class="btn btn-default" /></td>
								<td id="delBtnCol"><input type="button" 	id="delete${row.boardId }" value="삭제" class="btn btn-danger" /></td>
							</tr>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<tr>
							<td colspan="4">조회된 결과가 없습니다.</td>
						</tr>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>
		<a href="#this" class="btn btn-primary" id="write">방명록 작성</a>
		<footer id="footer">
			<hr>
			<br>
			<div id="copyRight">
				<a href="https://github.com/plus4070/Basecamp_PreHomework2016">plus4070/Basecamp_PreHomework2016 </a><span class="label label-success" 	id="gitLabel" onclick="pageToGit()">GitHub</span>
			</div>
		</footer>
	</div>
	<form id="commonForm" name="commonForm"></form>
</body>
<script src="<c:url value='/resources/js/jquery/jquery-3.1.1.min.js'/>" charset="utf-8"></script>
<script src="<c:url value='/resources/js/board/boardList.js'/>" charset="utf-8"></script>
</html>