package br.edu.facear.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.facear.model.Cliente;
import br.edu.facear.service.ClienteService;

/**
 * Servlet implementation class ObterClienteServlet
 */
@WebServlet("/ObterClienteServlet")
public class ObterClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ObterClienteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Passo 1 - Obter parametro id pela URL
		String id = request.getParameter("id");
		
		String nextPage = "/listarClientes.jsp";
		
		//Passo 2 - Converter id para Integer
		if(id != null){
			Integer x = new Integer(Integer.parseInt(id));
			
			//Passo 3 - Inserir lógica para chamar service
			ClienteService service = new ClienteService();
			Cliente c = service.obterClientePorId(x);
			
			request.setAttribute("cliente", c);
			nextPage = "/detalhesCliente.jsp";
		}
		//Passo 4 - Redirecionar para detalhesCliente.jsp
		RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
		rd.forward(request, response);
	}

}
