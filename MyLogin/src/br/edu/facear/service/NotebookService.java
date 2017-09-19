package br.edu.facear.service;

import java.util.List;

import br.edu.facear.dao.NotebookDAO;
import br.edu.facear.model.Notebook;

public class NotebookService {
	private NotebookDAO dao;
	
	public NotebookService(){
		dao = new NotebookDAO();
	}
	
	public void inserirNotebook(int numeroPatrimonio, String memoria, String hd, String processador){
		Notebook note = new Notebook(numeroPatrimonio, memoria, hd, processador);
		dao.inserir(note);
	}
	
	public List<Notebook> listarNotebooks(){
		return dao.listar();
	}
	
	public void alterarNotebook(int numeroPatrimonio, String memoria, String hd, String processador){
		Notebook note = new Notebook(numeroPatrimonio, memoria, hd, processador);
		dao.atualizar(note);
	}
	
	public void excluirNotebook(int numeroPatrimonio, String memoria, String hd, String processador){
		Notebook note = new Notebook(numeroPatrimonio, memoria, hd, processador);
		dao.excluir(note);
	}	
}
