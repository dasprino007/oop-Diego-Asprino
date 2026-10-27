package br.com.fiapride.main;

import br.com.fiapride.model.Monitor;

public class TesteMonitor {

	public static void main(String[] args) {
		System.out.println("--- Teste do Meu Projeto Pessoal ---");
        // Teste da minha classe, desafio
        Monitor monitor1 = new Monitor("LG UltraGear","LG", 1920, 1080);
        
        System.out.println("Este monitor é da marca da " + monitor1.getMarca());
        
        monitor1.ligarMonitor();
        monitor1.setMarca("Samsung");
        monitor1.setModelo("Samsung Odyssey G3");
        
        System.out.println("O " + monitor1.getModelo() + " esta ligado " + monitor1.getIsOn());
	}

}
