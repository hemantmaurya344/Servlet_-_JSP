<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<!-- 1. declaritive tag -->
			<!-- used to declare variables and funcions  -->
		<%! 
			int a = 10;
			int b = 50;
			String name = "Hemant Maurya";
			public int doSum(){
				return a+b;
			}
			public String reverse(){
				StringBuffer br = new StringBuffer(name);
				return br.reverse().toString();
			}
		%>
		
		<!-- 2. Scriptlet Tag : used to write java code/ processing code  -->
			<!-- whatever we write here it goes directly to the service method like in servlet we used to write 
		  here you get a default out object has given by jsp writer we don't need to create object of printwriter 
		 like we used to do in servlet
		 we need to use semicolon in this tag-->
		<%
			out.println(doSum());
			out.println("<br>");
			out.println(reverse());
		%>
		
		
		<!-- 3.  Expression Tag -->
			<!-- it is used to print on the screen or used to generate response to the screen
			we don't need to use semicolon because it is a expression -->
			
		<h1>sum is : <%= doSum() %></h1>
		
		<!-- 4. directive tag  -->
		<!-- provides direction and instruction to the server to deal the jsp page -->
		<!-- it has 3 types 
				1. Page Directive
				2. Include Directive 
				3. Taglib Directive-->
				
		<!-- 1. Page Directive -->
		<!-- 
			it is used for like importing the class which is particularly for this page 
				for implementating this we need to used this tag at the top of this jsp page above doctyple html tag
		-->
			<!-- syntax is  -->
			<%@page import="java.util.*, java.util.ArrayList" %>
			<!--  
				we don't need to put semicolon after writing import because it is not import statement 
			-->
			
			<!-- 
				Page directive some examples 
				1. Language - defines which language you goona use
				2. Extends - use it when you are extending to another class
				3. import 
				4. contentType
				5. info
				6. session - you can select that this page can use session or not
				7. isThreadSafe 
				8. autoflush
				9. isErrorPage - converts this page to an error page
				10. pageEncoding
				
				for more search on google
			-->
				
			<!-- 2. Include Directive  -->
			<!-- 
				used to include another jsp file and replace this tag with that file 
			-->
			<%@include file="filename.jsp" %>
			
			<!-- 3. Taglib Directive -->
			<!-- 
				it is used when we want to use other tag library in our jsp page.
				you need to declare that library using taglib library
				such as JSTL (Jsp Standard Tag Library) or custom library created by users. 
			-->
			<!--  taglib tag need two keyword 
				(1)prefix - pass only 1 letter 
							you can use the all the tag with the help of prefix on your file 
				(2) uri - unique identifies which define which part you want to use from that library -->
				
			<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
			
				
	</body>
</html>