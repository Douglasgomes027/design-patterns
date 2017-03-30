package br.com.douglas.observable;

import java.util.Observable;
import java.util.Observer;

public class ClimaDados extends Observable {
	private float temp;
	private float umid;
	private float pressao;

	public ClimaDados() {
		// TODO Auto-generated constructor stub
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

	public void medidasAlteradas() {
		setChanged();
		notifyObservers();
	}

	@Override
	public synchronized void addObserver(Observer o) {
		// TODO Auto-generated method stub
		super.addObserver(o);
	}

	@Override
	public void notifyObservers(Object arg) {
		// TODO Auto-generated method stub
		super.notifyObservers(arg);
	}

	@Override
	protected synchronized void setChanged() {
		// TODO Auto-generated method stub
		super.setChanged();
	}

	public void setMedidas(float temp, float umid, float pressao) {
		this.temp = temp;
		this.umid = umid;
		this.pressao = pressao;
	}

}
