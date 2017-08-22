package br.edu.facear.dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.facear.model.Cliente;

public class ClienteDAO extends GenericDAO{
	private PreparedStatement ps;
	private String LOGIN_SQL = "SELECT * "
							 + "FROM TBCLIENTE "
			                 + "WHERE EMAIL = ? AND SENHA = ?;";
	private String LISTAR_SQL = "SELECT * FROM TBCLIENTE;";
	
	public Cliente autenticar(String email, String senha) throws ClassNotFoundException, IOException, SQLException{
		Cliente c = null;
		//Abrir uma conexao
		openConnection();
		
		//Preparar o script
		ps = connect.prepareStatement(LOGIN_SQL);
		ps.setString(1, email);
		ps.setString(2, senha);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs != null)
			while(rs.next()){
				c = new Cliente(rs.getInt("id"), 
						rs.getString("nome"), 
						rs.getString("cpf"), 
						rs.getString("email"), 
						rs.getString("senha"));
			}
		
		
		//Fechar a conexao
		closeConnection();
		
		return c;
	}
	
	/**
	 * M�todo de inser��o de Cliente
	 */
	public void inserir(Cliente c){
		
	}
	
	/**
	 * M�todo de altera��o de Cliente
	 */
	public void alterar(Cliente c){
		
	}
	
	/**
	 * M�todo de excluir de Cliente
	 */
	public void excluir(Cliente c){
		
	}
	
	/**
	 * M�todo de listagem de todos os Cliente
	 * @throws SQLException 
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public List<Cliente> listar() throws ClassNotFoundException, IOException, SQLException{
		List<Cliente> lista = new ArrayList<Cliente>();
		// Abrir conex�o
		openConnection();
		
		// Executar o script
		ps = connect.prepareStatement(LISTAR_SQL);
		ResultSet rs = ps.executeQuery();
		
		//Analisar o retorno do script
		if(rs != null){
			while(rs.next()){
				Cliente c = new Cliente(rs.getInt("id"), 
										rs.getString("nome"),
										rs.getString("cpf"), 
										rs.getString("email"), 
										rs.getString("senha"));
				lista.add(c);
			}
		}
		
		closeConnection();
		
		return lista;
	}
}
