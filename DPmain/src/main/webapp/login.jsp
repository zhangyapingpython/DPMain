<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>

</head>
<body>
	<h2 align="center">
		<font color=red>用户登录页面</font>
	</h2>
	<form action="login" method="post">
		<table align="center" border="1">
			<tr>
				<td>账&nbsp;&nbsp;户:</td>
				<td><input type="text" name="userAccount"></td>
			</tr>
			<tr>
				<td>密&nbsp;&nbsp;码:</td>
				<td><input type="text" name="userPassword"></td>
			</tr>
			<tr>
				<td><input type="submit" value="登录" name="login"></td>
				<td><input type="reset" value="重置" name="reset"></td>
			</tr>
		</table>
		<p align="center">
			<a href="regist">注册用户</a>
		</p>
	</form>

</body>
</html>