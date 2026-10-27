package br.com.fiapride.model;

public class Computador {
	private String hostname;
	private boolean isOn;
	private String cpu;
	private String Gpu;

	public Computador(String hostname,String cpu, String gpu) {
		setHostname(hostname);
		setOn(false);
		setCpu(cpu);
		setGpu(gpu);
	}
	
	public void exibirSpecs() { 
		System.out.println("----- Computador ------");
		System.out.println("Hostname: " + getHostname());
		System.out.println("cpu: " + getCpu());
		System.out.println("gpu: " + getGpu());
	}
	
	public void ligarComputador() {
		if(isOn()) {
			System.err.println("Este computador ja esta ligado");
			return;
		}
		
		System.out.println(hostname + " ligou!!!");
		setOn(true);
	}
	
	public void desligarComputador() {
		if(!isOn()) {
			System.err.println("Este computador ja esta desligado");
			return;
		}
		
		System.out.println(hostname + " desligou!!!");
		setOn(false);
	}
	
	public String getHostname() {		
		return hostname;
	}

	public void setHostname(String hostname) {
		if(hostname.isBlank() || hostname.isEmpty()) {
			System.err.println("Hostname não deve ser nulo");
			return;
		}
		
		this.hostname = hostname;
	}

	public boolean isOn() {
		return isOn;
	}

	private void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public String getCpu() {
		return cpu;
	}

	private void setCpu(String cpu) {
		if(cpu.isBlank() || cpu.isEmpty()) {
			System.err.println("cpu não deve ser nulo");
			return;
		}
		this.cpu = cpu;
	}

	public String getGpu() {
		return Gpu;
	}

	private void setGpu(String gpu) {
		if(gpu.isBlank() || gpu.isEmpty()) {
			System.err.println("gpu não deve ser nulo");
			return;
		}
		
		Gpu = gpu;
	}
}
