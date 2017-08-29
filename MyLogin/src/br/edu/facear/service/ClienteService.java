package br.edu.facear.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import br.edu.facear.dao.ClienteDAO;
import br.edu.facear.model.Cliente;

public class ClienteService {
	private ClienteDAO dao;
	
	public ClienteService(){
		dao = new ClienteDAO();
	}
	
	public Cliente obterClientePorId(Integer id){
		//Inserir lógica... 
		return new Cliente(new Integer(1), "Alex", "123.321.789-09", "alex@gmail.com", "123");
	}
	
	public List<Cliente> listar() throws ClassNotFoundException, IOException, SQLException{
		return dao.listar();
	}
}
