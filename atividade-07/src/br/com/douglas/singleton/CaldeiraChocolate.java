package br.com.douglas.singleton;

public class CaldeiraChocolate {
	private boolean vazia;
	private boolean fervida;
	private boolean drenada;
	private static CaldeiraChocolate uniqueCaldeiraChocolate;
	
	private CaldeiraChocolate() {
		vazia = true;
		fervida = false;
	}
	
	public static CaldeiraChocolate getInstance(){
		if (uniqueCaldeiraChocolate == null){
			uniqueCaldeiraChocolate = new CaldeiraChocolate();
		}
		return uniqueCaldeiraChocolate;
	}	

	public void encher() {
		if (isVazia()) {
			vazia = false;
			fervida = false;
			
			System.out.println("Preenchendo a caldeira com a mistura de chocolate e leite");
		}else{
			System.out.println("Caldeira já esta cheia");
		}
	}

	public void drenar() {
		if (!isVazia() && isFervida()) {
			vazia = true;
			System.out.println("Drenando o leite e chocolate fervidos");
		}else{
			System.out.println("Caldeira Drenada!");
		}
	}

	public void ferver() {
		if (!isVazia() && !isFervida()) {
			
			fervida = true;
			System.out.println("Fervendo...");
		}else{
			System.out.println("Caldeira Fervida");
		}
	}

	public boolean isVazia() {
		return vazia;
	}

	public boolean isFervida() {
		return fervida;
	}
	
	public boolean isDrenada(){
		return drenada;
	}
}

