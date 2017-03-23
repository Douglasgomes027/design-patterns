package br.com.douglas.cliente;

import br.com.douglas.grasnar.GrasnoComportamento;
import br.com.douglas.voar.VooComportamento;

public class PatoMandarim extends Pato{
	public PatoMandarim(VooComportamento voo, GrasnoComportamento grasno){
		setVooComp(voo);
		setGrasnoComp(grasno);
	}
	
	public void exibir(){
		System.out.println("Eu sou um Pato Mandarim!!");
	}
}
