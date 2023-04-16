package urlRewriting;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class URL_rewriting extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		response.setContentType("text/html");
		try(PrintWriter out = response.getWriter()){
			out.println("<!DOCTYPE html>");
			out.println("<html>");
				out.println("<head>");
					out.println("<title>Servlet1</title>");
				out.println("</head>");
				out.println("<body>");
					String name = request.getParameter("user_name");
					out.println("<h1>hello my name is "+name+" from url rewriting</h1>");
					out.println("<a href='url2?user="+name+" '> Servet2 </a>");
					
				out.println("</body>");
			out.println("</html>");
		}
	}

}
