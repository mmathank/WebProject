package util.core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextConfigExample
 */
@WebServlet(value="/ContextConfigExample",
			initParams= {@WebInitParam(name="name",value="Mathankumar",description="Name of the Employee" )},
			description="Servlet Initilization Parameters using Annotations")
public class ContextConfigExample extends HttpServlet {
	
	String companyName;
	String teamName;
	String empName;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContextConfigExample() {
        super();
    }

    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	
        ServletContext ctx = config.getServletContext();
        companyName = ctx.getInitParameter("company");
        teamName = ctx.getInitParameter("team");
        empName = config.getInitParameter("name");
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<h2> Context Parameter Configuration Example </h2>");
		out.println("<p> <strong>Company Name: </strong>" + companyName + "</p>");
		out.println("<p> <strong>Team Name: </strong>" + teamName + "</p>");
		out.println("<p> <strong>Employee Name: </strong>" + empName + "</p>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
