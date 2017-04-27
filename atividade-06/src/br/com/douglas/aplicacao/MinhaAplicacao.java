package br.com.douglas.aplicacao;

import br.com.douglas.documento.Documento;
import br.com.douglas.documento.MeuDocumento;

public class MinhaAplicacao extends Aplicacao {

	@Override
	public Documento criaDocumento() {
		
		return new MeuDocumento();
	}

}
