package br.com.douglas.teste;

import br.com.douglas.singleton.CaldeiraChocolate;

public class Teste {

	public static void main(String[] args) {

		CaldeiraChocolate caldeira = CaldeiraChocolate.getInstance();
		caldeira.encher();
		caldeira.ferver();

		CaldeiraChocolate caldeira2 = CaldeiraChocolate.getInstance();
		caldeira2.encher();
		caldeira2.drenar();
	}

}
