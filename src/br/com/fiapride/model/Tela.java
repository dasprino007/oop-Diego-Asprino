package br.com.fiapride.model;

public class Tela {
	// Este é para saber qual resolução ex: 1920x1080
	private int resolucaoEixoX;
	private int resolucaoEixoY;
	private boolean isOn;
	
	// tipo com lcd, touch, plasma e etc.
	private String tipoTela;
	
	// Coloquei em privado para que o usuario não possa estanciar
	public Tela(int resolucaoEixoX, int resolucaoEixoY, String tipoTela) {
		this.resolucaoEixoX = resolucaoEixoX;
		this.resolucaoEixoX = resolucaoEixoY;
		this.tipoTela = tipoTela;
	}

	public int getResolucaoEixoX() {
		return resolucaoEixoX;
	}

	public int getResolucaoEixoY() {
		return resolucaoEixoY;
	}

	public String getTipoTela() {
		return tipoTela;
	}

	public boolean isOn() {
		return isOn;
	}

	protected void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public void ligar() {		
		setOn(true);
	}
	
	public void desligar() {
		setOn(false);
	}
}
