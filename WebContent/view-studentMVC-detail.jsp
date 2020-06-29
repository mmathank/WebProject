<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Student Information</title>
<body>
	<h3 align="center"> MVC example using Servlet & JSP </h3>
	<c:forEach var="student" items="${studentList}">
		<p>${student}</p>
	</c:forEach>
</body>
</head>
</html>