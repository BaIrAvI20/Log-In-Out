<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   

<!DOCTYPE html>
<html>
<body>
	<jsp:include page = "layout.jsp"/>
		<form method = "post"  action = "endpage" modelAttribute = "data">
            <p>${greet}</p>
		<button type="submit">LOG OUT</button>
	</form>
	
</body>
</html>