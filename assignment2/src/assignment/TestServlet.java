package assignment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init Successful");
	}
	public void destroy()
	{
		System.out.println("destroy Successful");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("firstname") == null || request.getParameter("firstname").equals(""))
		{
			request.setAttribute("message", "No first name entered.");
			request.getRequestDispatcher("TestError.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("firstname", request.getParameter("firstname"));
		}
		if(request.getParameter("lastname") == null || request.getParameter("lastname").equals(""))
		{
			request.setAttribute("message", "No last name entered.");
			request.getRequestDispatcher("TestError.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("lastname", request.getParameter("lastname"));
		}
		request.getRequestDispatcher("TestResponse.jsp").forward(request, response);
		System.out.println("doGet Successful");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}



}
