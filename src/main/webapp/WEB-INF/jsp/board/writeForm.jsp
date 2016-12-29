<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title>Basecamp_PreHomeworwk</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/bootstrap/bootstrap.min.css'/>" />
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/board/writeForm.css'/>" />
</head>
<body>
	<div class="bs-callout-info">
		<p>변경할 내용을 입력하세요.</p>
	</div>
	<div id="writeDiv">
		<table id="writeTable">
			<tr>
				<th>이메일 입력</th>
				<td><input type="email" id="BoardEmail" name="BoardEmail" class="form-control" placeholder="Email" required autocomplete="off"></input></td>
			</tr>
			<tr>
				<th>비밀번호 입력</th>
				<td><input type="password" id="BoardPassword" name="BoardPassword" class="form-control" placeholder="Password" required></input></td>
			</tr>
			<tr>
				<th>내용 입력</th>
				<td><textarea id="content" rows="15" id="BoardContent" name="BoardContent"  required></textarea></td>
			</tr>
			<tr>
				<th></th>
				<td>
					<a href="#this" class="btn btn-primary" id="btnWrite">작성하기</a>
					<a href="#this" class="btn btn-default" id="btnList">목록보기</a>
				</td>
			</tr>
		</table>
		<footer id="footer">
			<hr><br>
			<div id="copyRight"><a href="https://github.com/plus4070/Basecamp_PreHomework2016"> plus4070/Basecamp_PreHomework2016 </a><span class="label label-success" id="gitLabel" >GitHub</span></div>
		</footer>
	</div>
</body>
<script src="<c:url value='/resources/js/jquery/jquery-3.1.1.min.js'/>" charset="utf-8"></script>
<script src="<c:url value='/resources/js/common/commonForm.js'/>" charset= "utf-8"></script>
<script src="<c:url value='/resources/js/board/boardWrite.js'/>" charset="utf-8"></script>
</html>