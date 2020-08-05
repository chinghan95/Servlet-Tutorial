package org.o7planning.tutorial.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(name = "loginServlet", urlPatterns = { "/loginServlet" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * When the user submits the login form, the servlet's doPost() method
	 * will be invoked by the servlet container.
	 * 
	 * DO the following tasks inside doPost() method:
	 * 1. Read values of the fields posted from the form via the request object
	 * 2. Do some processing, e.g. connecting to database to validate the username and password
	 * 3. Return response back to the use via the response object
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. Read values of text and password fields
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		
//		System.out.println("username: " + username);
//		System.out.println("password: " + password);
//		
//		// Do some processing....
//		
//		// To send response back to the client, we need to obtain a writer from
//		// the response object by calling the method getWriter() of the HttpServletResponse interface
//		PrintWriter writer = response.getWriter();
//		
//		// Build HTML code
//		String htmlResponse = "<html>";
//		htmlResponse += "<h2>Your username is: " + username + "<br/>";
//		htmlResponse += "Your password is: " + password + "</h2>";
//		htmlResponse += "</html>";
//		
//		// Return response
//		writer.println(htmlResponse);
		
		// 2. Read value of checkbox field
//		String languages[] = request.getParameterValues("language");
//		PrintWriter writer = response.getWriter();
//		if(languages != null) {
//			System.out.println("Languages are: ");
//			String htmlResponse = "<html>";
//			htmlResponse += "<h2>";
//			for(String lang : languages) {
//				htmlResponse += "Your language is: " + lang + "<br/>";
//			}
//			htmlResponse += "</html>";
//			
//			// Return response
//			writer.println(htmlResponse);
//		}
		
		// 3. Read value of radio button field
//		String gender = request.getParameter("gender");
//		System.out.println("Gender is: " + gender);
		
		// 4. Read value of text area field
//		String feedback = request.getParameter("feedback");
//		System.out.println("Feedback is: " + feedback);
	
		// 5. Read value of dropdown list(bombobox) field
//		String jobCategory = request.getParameter("jobCat");
//		System.out.println("Job category is: " + jobCategory);
		
	}

}
