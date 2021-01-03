package pac;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class TestServlet extends HttpServlet {
	

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<h2>Hello World</h2>");
		out.println("</BODY></HTML>");
		
	}

}
