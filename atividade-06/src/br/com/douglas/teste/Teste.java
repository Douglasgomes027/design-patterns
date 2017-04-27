package br.com.douglas.teste;

import br.com.douglas.aplicacao.MinhaAplicacao;
import br.com.douglas.documento.Documento;
import br.com.douglas.documento.MeuDocumento;

public class Teste {

	public static void main(String[] args) {
		 MinhaAplicacao aplicacao = new MinhaAplicacao();
		 Documento doc = aplicacao.criaDocumento();
		 MeuDocumento documento = new MeuDocumento();
		 System.out.println("Documento: " + documento.getPDF());

	}

}
