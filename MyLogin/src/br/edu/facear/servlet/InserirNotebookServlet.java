package br.edu.facear.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.facear.service.NotebookService;

/**
 * Servlet implementation class InserirNotebookServlet
 */
@WebServlet("/InserirNotebookServlet")
public class InserirNotebookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserirNotebookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String numeroPatrimonio = request.getParameter("numeroPatrimonio");
		String memoria = request.getParameter("memoria");
		String hd = request.getParameter("hd");
		String processador = request.getParameter("processador");
		
		NotebookService service = new NotebookService();
	}

}
