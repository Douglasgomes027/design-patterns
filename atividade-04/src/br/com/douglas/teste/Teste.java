package br.com.douglas.teste;

import br.com.douglas.observable.ClimaDados;
import br.com.douglas.observer.CondicoesAtuais;

public class Teste {

	public static void main(String[] args) {
		ClimaDados clima = new ClimaDados();
		clima.setMedidas(10, 30, 40);
		clima.medidasAlteradas();
		
		
		CondicoesAtuais ca = new CondicoesAtuais(clima);
		ca.update(clima, ca);
		
		
		
		

	}

}
