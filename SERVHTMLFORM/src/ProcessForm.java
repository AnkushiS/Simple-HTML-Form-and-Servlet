

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcessForm
 */
@WebServlet("/ProcessForm")
public class ProcessForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in get");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("in post");
		String str= " ";	
		
		
		str += " The value in text area is: " + request.getParameter("first_text") + "<br>";
		str += " " + request.getParameter("bigcars");
		str += " " + request.getParameter("selected");
		str += " " + request.getParameter("opt_audi");
		str += " " + request.getParameter("opt_VM");
			
				
		System.out.println(str);
		request.setAttribute("message", str);
		getServletContext().getRequestDispatcher("/output.jsp").forward(request, response);		
	}

}
