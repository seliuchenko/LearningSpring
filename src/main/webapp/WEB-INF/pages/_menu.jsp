<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<div style="border: 1px solid #ccc; padding: 5px; margin-bottom:20px;">
	
	<a href="/welcome">Home</a>
	<a href="/userInfo">User Info</a>
	<a href="/admin">Admin</a>
	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<a href="/logout">Logout</a>
	</c:if>


</div>
