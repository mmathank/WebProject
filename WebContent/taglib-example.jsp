<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%
	String[] cities = { "Chennai", "Madurai", "Trichy" };
	pageContext.setAttribute("myCities", cities);
%>

<html>
<head>
<title>TagLib Example</title>
</head>
<body>
	<c:forEach var="city" items= "${myCities}">
		<p> ${city} </p>
	</c:forEach>
	
	<c:set var="name" value="mathankumar" />
	<p> Length of Name <b>${name}</b> is: ${fn:length(name)} </p>
	<p> UpperCase verion of <b>${name}</b> is: ${fn:toUpperCase(name)}
</body>
</html>