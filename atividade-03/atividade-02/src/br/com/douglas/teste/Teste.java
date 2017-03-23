package br.com.douglas.teste;

import br.com.douglas.cliente.PatoMandarim;
import br.com.douglas.cliente.PatoSelvagem;
import br.com.douglas.grasnar.Grasno;
import br.com.douglas.grasnar.Rangido;
import br.com.douglas.voar.VooComAsas;
import br.com.douglas.voar.VooNao;

public class Teste {

	public static void main(String[] args) {
		VooComAsas va = new VooComAsas();
		Grasno g = new Grasno();
		PatoSelvagem ps = new PatoSelvagem(va, g);
		ps.exibir();
		ps.realizarGrasno();
		ps.realizarVoo();
		
		VooNao vn = new VooNao();
		Rangido r = new Rangido();
		PatoMandarim pm = new PatoMandarim(vn, r);
		pm.exibir();
		pm.realizarGrasno();
		pm.realizarVoo();

	}

}
