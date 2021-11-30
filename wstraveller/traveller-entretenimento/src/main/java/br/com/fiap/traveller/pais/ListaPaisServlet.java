package br.com.fiap.traveller.pais;

import java.io.IOException;
import java.util.List;

public class ListaPaisServlet {

}
@WebServlet("/listaPais")
public class ListaPaisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		Banco banco = new Banco();
		
		List<Pais> listaPais =  banco.getPais();
		
		request.setAttribute("pais", listaPais);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaPais.jsp");
		
		rd.forward(request, response);
		
	}

}