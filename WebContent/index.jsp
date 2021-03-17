<%@ page import = "util.core.Book" %>
<%@ page import = "java.time.*" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<html>
<head>
<body>
	
	<h1 align=center>My First JSP Page</h1>
	
	<!-- This is an example for Expression Tag -->
	<p> Multiplication of 25 and 4 is: <%= 25 * 4 %> </p>
	
	<!-- This is an example for Declaration Tag  -->
	<%! String message() {
		return "welcome";
	}%>
	<p> Convert "welcome" to upper case: <%= message().toUpperCase() %></p>
	
	<!-- This is an example of Scriptlet Tag  -->
	<%
		String name = "CTS";
		for (int i = 1; i <= 5; i++){
			out.println(name);
		}
	%>
	</br></br>
	<p> Current Date is: <%= LocalDate.now() %> </p>
	<!-- Using Java Class in JSP  -->
	<p> <%= Book.showBook() %> </p>
	
	<p> Accessing in-built objects in JSP: <%= request.getHeader("User-Agent") %> </p>
	
	<a href="HelloworldServlet"> Go To My Servlet </a> |
	<a href="IncludeDirectiveServlet"> Include Directive Example </a> | 
	<a href="TagLibExample"> TagLib Example </a> |
	<a href="ContextConfigExample"> Read Context Parameters </a> |
	<a href="StudentServlet"> Display Student Names </a> |
	<a href="StudentServletMVC"> Student MVC</a> |
	<a href="UserFormServlet"> Session Example </a> |
	<a href="DBTestServlet"> Check DB Connection </a>
</body>
</head>
</html>