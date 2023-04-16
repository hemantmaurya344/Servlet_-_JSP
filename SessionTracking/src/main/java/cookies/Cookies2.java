package cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Cookies2 extends HttpServlet {
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		try(PrintWriter out = response.getWriter()){
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet1</title>");
			out.println("</head>");
			out.println("<body>");
			
			// getting all the cookies
			
			Cookie c[] = request.getCookies();
			boolean old_user = false;
			String name = "";
			
			if(c == null) {
				out.println("<h1>Name Not Found!!</h1>");
				return;
			}
			else {
				for(Cookie c1 :c) {
					String tempName = c1.getName();
					if(tempName.equals("user_name")) {
						old_user = true;
						name = c1.getValue();
					}
				}
			}
			if(old_user) {
				out.println("<h1>hello my name from second servlet is "+name+"</h1>");
			}
			else
				out.println("<h1>User Not found</h1>");
			
			out.println("</body>");
			out.println("</html>");
		}
		
	}
    
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	
	
}
