package br.edu.facear.model;

public class Notebook {
	private int numeroPatrimonio;
	private String memoria;
	private String hd;
	private String processador;
	
	public Notebook(int numeroPatrimonio, String memoria, String hd, String processador){
		this.numeroPatrimonio = numeroPatrimonio;
		this.memoria = memoria;
		this.hd = hd;
		this.processador = processador;
	}
}
