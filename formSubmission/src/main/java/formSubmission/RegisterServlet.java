package formSubmission;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class RegisterServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h2>Welcome</h2>");
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_pass");
		String email = req.getParameter("user_email");
		String gender = req.getParameter("user_gender");
		String course = req.getParameter("user_course");
		String condt = req.getParameter("terms");
		if(condt != null){
			out.println("<h2>"+name+"</h2>");
			out.println("<h2>"+password+"</h2>");
			out.println("<h2>"+email+"</h2>");
			out.println("<h2>"+gender+"</h2>");
			out.println("<h2>"+course+"</h2>");
			
			RequestDispatcher rd = req.getRequestDispatcher("registered");
			rd.forward(req, resp);
		}
		else {
			out.println("<h2>User didn't agree with terms</h2>");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);
		}
		
	}
}
