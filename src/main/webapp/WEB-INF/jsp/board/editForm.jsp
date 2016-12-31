<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/bootstrap/bootstrap.min.css'/>" />
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/board/editForm.css'/>" />
<title>Basecamp_PreHomeworwk</title>
</head>
<body>
	<div class="bs-callout-info">
		<p>변경할 내용을 입력하세요.</p>
	</div>
	<div id="editDiv">
		<input type="hidden" id="BOARDID" name="BOARDID" value="${board.boardId }"/>
		<input type="hidden" id="BOARDEMAIL" name="BOARDEMAIL" value="${board.boardEmail }"/>
		<table id="editTable">
			<tr>
				<th>이메일</th>
				<td>${board.boardEmail }</td>
			</tr>
			<tr>
					<th>비밀번호</th>
					<td><input type="password" id="BOARDPASSWORD" name="BOARDPASSWORD" class="form-control" placeholder="Password" /></td>
				</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="15" id="BOARDCONTENT" name="BOARDCONTENT">${board.boardContent }</textarea></td>
			</tr>
			<tr>
				<th></th>
				<td>
					<input type="button" id="btnSubmit" value="확인" class="btn btn-primary"/>
					<input type="button" id="btnCancel" value="취소" class="btn btn-default"/>
				</td>
			</tr>
		</table>
		<footer id="footer">
			<hr><br>
			<div id="copyRight"><a href="https://github.com/plus4070/Basecamp_PreHomework2016"> plus4070/Basecamp_PreHomework2016 </a><span class="label label-success" id="gitLabel" onclick="pageToGit()">GitHub</span></div>
		</footer>
	</div>
</body>
<script src="<c:url value='/resources/js/jquery/jquery-3.1.1.min.js'/>" charset="utf-8"></script>
<script src="<c:url value='/resources/js/board/editForm.js'/>" charset="utf-8"></script>
</html>