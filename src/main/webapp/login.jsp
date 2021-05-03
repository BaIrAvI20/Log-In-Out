<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<jsp:include page="layout.jsp"/>
<form method ="post" action="login" modelAttribute = "login">
<p>${error}</p>
<table>
	<tr><td>USER NAME</td><td><input type= "text" name="name"></td></tr>
	<tr><td>PASSWORD</td><td><input type= "password" name="password"></td></tr>
</table>
<button type="submit">LOGIN</button>

</form>
</body>
</html>