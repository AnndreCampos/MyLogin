package br.edu.facear.dao;

import java.util.List;

import br.edu.facear.model.Notebook;

public class NotebookDAO {
	private String SELECT_SQL = "SELECT * FROM TBNOTE;";
	private String INSERT_SQL = "INSERT INTO TBNOTE VALUES(?, ?, ?, ?);";
	private String UPDATE_SQL = "UPDATE TBNOTE SET MEMORIA = ? WHERE NUMERO_PATRIMONIO = ?;";
	private String DELETE_SQL = "DELETE TBNOTE WHERE NUMERO_PATRIMONIO = ?;";
	
	public void inserir(Notebook note){
		
	}
	
	public List<Notebook> listar(){
		return null;
	}
	
	public void atualizar(Notebook note){
		
	}
	
	public void excluir(Notebook note){
		
	}
}
