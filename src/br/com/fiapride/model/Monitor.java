package br.com.fiapride.model;

public class Monitor extends Tela {
	// Este atributo é para saber qual é sua marca  ex: lg, samsung e etc.
	private String marca;
	// Este é para saber o modelo especifico do monitor
	private String modelo;
	
	private Computador porta1;
	
	public Monitor(String modelo, String marca, int resolucaoEixoX, int resolucaoEixoY, String tipoTela,Computador porta1) {
		super(resolucaoEixoX, resolucaoEixoY, tipoTela);
		setOn(false);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setPorta1(porta1);
	}
	
	@Override
	public void ligar() {
		if(isOn()) {
			System.err.println("Este monitor ja esta ligado");
			return;
		}
		
		System.out.println(this.modelo + " ligou!!!");
		if (!this.porta1.isOn()) {
			System.out.println("Não a nenhum computador ligado");
		}
		setOn(true);
	}
	
	@Override
	public void desligar() {
		if(!isOn()) {
			System.err.println("Este monitor ja esta desligado");
			return;
		}
		
		if (porta1 != null && !porta1.isOn()) {
			System.out.println("O computador ainda esta ligado!!!!!");
		}
		
		System.out.println(this.modelo + " desligou!!!");
		setOn(false);
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
	
	@Override
	public String conectorTipo() {
		return "DISPLAY-PORT";
	}
}
