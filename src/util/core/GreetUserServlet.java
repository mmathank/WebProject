package util.core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GreetUserServlet
 */
@WebServlet("/GreetUserServlet")
public class GreetUserServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public GreetUserServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(false);
		String userName = (String) session.getAttribute("nameOfTheUser");
		
		out.print("<p> Welcome " + userName + "</p>");
	}
	
}
