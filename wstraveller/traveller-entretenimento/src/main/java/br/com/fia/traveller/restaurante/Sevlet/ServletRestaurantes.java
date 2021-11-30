package br.com.fia.traveller.restaurante.Sevlet;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet ("/restaurantes")
public class ServletRestaurantes {
private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<html");
		out.println("<body>");
		out.println("lista Restaurantes");
		out.println("</body");
		out.println("</html");
		
}
	
}
