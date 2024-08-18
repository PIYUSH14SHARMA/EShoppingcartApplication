package in.sp.application.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;



import in.sp.application.connection.DbCon;
import in.sp.application.dao.OrderDao;

@jakarta.servlet.annotation.WebServlet("/cancel-order")
public class CancelOrderServlet extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void doGet(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, IOException {
		try(PrintWriter out = response.getWriter()) {
			String id = request.getParameter("id");
			if(id != null) {
				OrderDao orderDao = new OrderDao(DbCon.getConnection());
				orderDao.cancelOrder(Integer.parseInt(id));
			}
			response.sendRedirect("orders.jsp");
		} catch (ClassNotFoundException|SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}