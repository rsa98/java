package br.com.fiap.traveller.entretenimento.servlet;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<html");
		out.println("<body>");
		out.println("testando");
		out.println("</body");
		out.println("</html");
		
	}

}
