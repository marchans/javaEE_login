package net.codejava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginForm
 */
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		authentication(req, resp);
	}

	public void authentication(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		resp.setContentType("text/html");

		String param1 = req.getParameter("username");

		String param2 = req.getParameter("password");

		if (!"".equals(param1) && !"".equals(param2) && param1 != null && param2 != null) {
			if ((param1.equals("tomcat")) && (param2.equals("tomcat"))) {

				resp.sendRedirect("success.html");

			} else {

				resp.sendRedirect("error.html");
			}
		}
	}
}
