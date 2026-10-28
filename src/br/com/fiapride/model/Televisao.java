package br.com.fiapride.model;

public class Televisao extends Tela {
	// Numero do canal exemplo: 101
	private int numCanal;
	
	public Televisao(int resolucaoEixoX, int resolucaoEixoY, String tipoTela, int numCanal) {
		super(resolucaoEixoX, resolucaoEixoY, tipoTela);
		setNumCanal(numCanal);
		setOn(false);
	}

	public void mudarCanal(int numCanal) {
		if(!isOn()) {
			System.err.println("A televisão precisa estar ligada");
			return;
		}
		
		System.out.println("O canal mudou para: "+ numCanal);
		setNumCanal(numCanal);
	}
	
	public int getNumCanal() {
		return numCanal;
	}
	
	private void setNumCanal(int numCanal) {
		if(numCanal < 0) {
			System.err.println("O numero do canal não pode ser um numero negativo");
			return;
		}
		
		this.numCanal = numCanal;
	}
	
	@Override
	public void ligar() {
		if(isOn()) {
			System.err.println("A TV ja esta ligado");
			return;
		}
		
		System.out.println("A TV ligou!!!");
		setOn(true);
	}
	
	@Override
	public void desligar() {
		if(!isOn()) {
			System.err.println("A TV ja esta desligado");
			return;
		}
		
		System.out.println("A TV desligou!!!");
		setOn(false);
	}
	
	@Override
	public String conectorTipo() {
		return "HDMI";
	}
}
