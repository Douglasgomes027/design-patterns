package br.com.douglas.aplicacao;

import br.com.douglas.documento.Documento;

public abstract class Aplicacao {
	protected Documento doc;

		
	abstract Documento criaDocumento();

	public void novoDocumento() {
		this.doc = this.criaDocumento();
	}

	public void abrirDocumento() {
		this.doc.abrir();;
	}
}
