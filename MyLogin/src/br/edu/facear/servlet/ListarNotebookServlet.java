package br.edu.facear.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.facear.model.Notebook;
import br.edu.facear.service.NotebookService;

/**
 * Servlet implementation class ListarNotebookServlet
 */
@WebServlet("/ListarNotebookServlet")
public class ListarNotebookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarNotebookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Instanciar service
		NotebookService service = new NotebookService();
		
		//Obter lista de notebooks
		List<Notebook> lista = service.listarNotebooks();
		
		//Colocar lista na memória
		request.setAttribute("listaNotebooks", lista);
		
		//Redirecionar
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/listarNotebooks.jsp");
		rd.forward(request, response);
	}

}
