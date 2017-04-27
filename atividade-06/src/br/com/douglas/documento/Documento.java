package br.com.douglas.documento;

public abstract class Documento {
	
	public void abrir() {
		System.out.println("Documento: Abrir documento!");
	}

	public void fechar() {
		System.out.println("Documento: Fechar documento!");
	}

	public void gravar() {
		System.out.println("Documento: Gravar documento!");
	}
}
