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
 * Servlet implementation class CollectUserDetailServlet
 */
@WebServlet("/CollectUserDetailServlet")
public class CollectUserDetailServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public CollectUserDetailServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("userName");
		HttpSession session = request.getSession();
		session.setAttribute("nameOfTheUser", name);

		out.print("<a href = 'GreetUserServlet'> Click here to welcome user </a>");
	}
}
