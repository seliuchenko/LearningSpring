<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Info</title>
</head>
<body>
	<jsp:include page="_menu.jsp"/>
	<h2>User Info Page</h2>
	<!-- <h3>Welcome: ${pageContext.request.userPrincipal.name}</h3>  -->
	<b>This page is secured!</b>

</body>
</html>