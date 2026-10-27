package br.com.fiapride.model;

public class Monitor {
	// Este atributo é para saber se esta ligado
	private boolean isOn;
	// Este atributo é para saber qual é sua marca  ex: lg, samsung e etc.
	private String marca;
	// Este é para saber qual resolução ex: 1920x1080
	private int resolucaoEixoX;
	private int resolucaoEixoY;
	// Este é para saber o modelo especifico do monitor
	private String modelo;
	
	private Computador porta1;
	
	public Monitor(String modelo, String marca, int resolucaoEixoX, int resolucaoEixoY, Computador porta1) {
		setIsOn(false);
		this.setMarca(marca);
		this.setResolucaoEixoX(resolucaoEixoX);
		this.setResolucaoEixoY(resolucaoEixoY);
		this.setModelo(modelo);
		this.setPorta1(porta1);
	}
	
	public void ligarMonitor() {
		if(getIsOn()) {
			System.err.println("Este monitor ja esta ligado");
			return;
		}
		
		System.out.println(this.modelo + " ligou!!!");
		if (!this.porta1.isOn()) {
			System.out.println("Não a nenhum computador ligado");
		}
		setIsOn(true);
	}
	
	public void desligarMonitor() {
		if(!getIsOn()) {
			System.err.println("Este monitor ja esta desligado");
			return;
		}
		
		if (porta1 != null && !porta1.isOn()) {
			System.out.println("O computador ainda esta ligado!!!!!");
		}
		
		System.out.println(this.modelo + " desligou!!!");
		setIsOn(false);
	}
	
	private void setIsOn(boolean isOn) {
		this.isOn = isOn;
	}
	
	public boolean getIsOn() {
		return this.isOn;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if(marca.isBlank() || marca.isEmpty()) {
			System.err.println("A marca não pode ser nulo!!!");
			return;
		}
		
		this.marca = marca;
	}

	public int getResolucaoEixoX() {
		return resolucaoEixoX;
	}

	private void setResolucaoEixoX(int resolucaoEixoX) {
		int menorResolucaoX = 640;
		
		if(resolucaoEixoX < 0) {
			System.err.println("Resolução do eixo X não pode ser menor que 0");
			return;
		}else if(resolucaoEixoX < menorResolucaoX) {
			System.err.println("Resolução do eixo X não pode ser menor que " + menorResolucaoX);
			return;
		}
		
		this.resolucaoEixoX = resolucaoEixoX;
	}

	public int getResolucaoEixoY() {
		return resolucaoEixoY;
	}

	private void setResolucaoEixoY(int resolucaoEixoY) {
		int menorResolucaoY = 480;
		
		if(resolucaoEixoY < 0) {
			System.err.println("Resolução do eixo Y não pode ser menor que 0");
			return;
		}else if(resolucaoEixoY < menorResolucaoY) {
			System.err.println("Resolução do eixo Y não pode ser menor que " + menorResolucaoY);
			return;
		}
		
		this.resolucaoEixoY = resolucaoEixoY;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if(modelo.isBlank() || modelo.isEmpty()) {
			System.err.println("O modelo não pode ser nulo!!!");
			return;
		}
		
		this.modelo = modelo;
	}

	public Computador getPorta1() {
		return porta1;
	}

	private void setPorta1(Computador porta1) {
		this.porta1 = porta1;
	}
	
	public void conectarPorta1(Computador porta) {
		if(getPorta1() != null) {
			System.err.println("A porta 1 ja esta conectada!!!");
			return;
		}
		
		System.out.println("Porta 1 conectada com computador "+ porta.getHostname());
		setPorta1(porta);
	}
	
	public void desconectarPorta1() {
		if(getPorta1() == null) {
			System.err.println("A porta 1 ja esta aberta!!!");
			return;
		}
		
		System.out.println("Porta 1 desconectada");
		setPorta1(null);
	}
}
