package br.com.douglas.cliente;

import br.com.douglas.grasnar.GrasnoComportamento;
import br.com.douglas.voar.VooComportamento;

public class Pato {
	private VooComportamento vooComp;
	private GrasnoComportamento grasnoComp;
	
	public void realizarVoo(){
		vooComp.voar();
		
	}
	
	public void realizarGrasno(){
		grasnoComp.grasnar();
	}
	
	public void nadar(){
		
	}
	public void exibir(){
		
	}

	public void setVooComp(VooComportamento vooComp) {
		this.vooComp = vooComp;
	}

	public void setGrasnoComp(GrasnoComportamento grasnoComp) {
		this.grasnoComp = grasnoComp;
	}
	
	
}
