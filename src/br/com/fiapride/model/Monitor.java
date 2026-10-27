package br.com.fiapride.model;

public class Monitor {
	// Este atributo é para saber se esta ligado
	public boolean isOn;
	// Este atributo é para saber qual é sua marca  ex: lg, samsung e etc.
	public String marca;
	// Este é para saber qual resolução ex: 1920x1080
	public String resolucao;
	// Este é para saber o modelo especifico do monitor
	public String modelo;
	
	public Monitor(String modelo, String marca, String resolucao) {
		this.isOn = false;
		this.marca = marca;
		this.resolucao = resolucao;
		this.modelo = modelo;
	}
	
	public void ligarMonitor() {
		if(this.isOn) {
			System.err.println("Este monitor ja esta ligado");
			return;
		}
		
		System.out.println(this.modelo + " ligou!!!");
		this.isOn = true;
	}
	
	public void desligarMonitor() {
		if(!this.isOn) {
			System.err.println("Este monitor ja esta desligado");
			return;
		}
		
		System.out.println(this.modelo + " desligou!!!");
		this.isOn = false;
	}
}
