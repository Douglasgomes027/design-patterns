package br.com.douglas.observer;

import java.util.Observable;
import java.util.Observer;

import br.com.douglas.exibir.Exibe;
import br.com.douglas.observable.ClimaDados;

public class CondicoesAtuais implements Observer,Exibe{
	Observable observable;
	private float temp;
	private float umid;
	private float pressao;
	
	public CondicoesAtuais(Observable observable) {
		this.observable=observable;
		observable.addObserver(this);
	}
	
	public float getTemp() {
		return temp;
	}

	public float getUmid() {
		return umid;
	}

	public float getPressao() {
		return pressao;
	}

	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof ClimaDados) {
			ClimaDados climaDados = (ClimaDados) obs;
			this.temp = climaDados.getTemp();
			this.umid = climaDados.getUmid();
			this.pressao=climaDados.getPressao();
			exibir();
			}
		
	}
	
	@Override
	public void exibir() {
		System.out.println("As medidas são: ");
		System.out.println("Temperatura: "+ getTemp());
		System.out.println("Umidade: "+ getUmid());
		System.out.println("Pressao: "+ getPressao());
	}

	
	
}
