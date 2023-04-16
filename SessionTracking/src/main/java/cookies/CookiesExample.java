package cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class CookiesExample extends HttpServlet {       
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		try(PrintWriter out = response.getWriter()){
			out.println("<!DOCTYPE html>");
			out.println("<html>");
				out.println("<head>");
					out.println("<title>Servlet1</title>");
				out.println("</head>");
				out.println("<body>");
					String name = request.getParameter("name");
					out.println("<h1>hello my name is "+name+"</h1>");
					out.println("<a href='cookies2'> Servet2 </a>");
					//creating a cookie
					Cookie c = new Cookie("user_name", name);
					response.addCookie(c);
				out.println("</body>");
			out.println("</html>");
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

}
