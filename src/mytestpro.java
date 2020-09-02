

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class mytestpro
 */
@WebServlet("/mytestpro")
public class mytestpro extends HttpServlet {
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");

		String user=req.getParameter("userName");
		String pass=req.getParameter("userPassword");

		if(user.equals("admin")&&pass.equals("admin")) {
	           RequestDispatcher rs = req.getRequestDispatcher("dashboard.html");
	           rs.forward(req, res);

		} 
                else {
                 pw.println("<h4 style='color:white;text-align:center;'>Login Failed...!</h4>");
                 req.getRequestDispatcher("index.html").include(req, res);  

             
                }
		pw.close();
	}

	

}
