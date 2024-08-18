package in.sp.application.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;


@jakarta.servlet.annotation.WebServlet("/log-out")
public class LogoutServlet extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			if(request.getSession().getAttribute("auth")!=null) {
				request.getSession().removeAttribute("auth");
				response.sendRedirect("login.jsp");
			}else {
				response.sendRedirect("index.jsp");
			}

		} 
	}
	protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
