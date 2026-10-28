package br.com.fiapride.main;

import br.com.fiapride.model.Computador;
import br.com.fiapride.model.Monitor;
import br.com.fiapride.model.Televisao;

public class TesteMonitor {

	public static void main(String[] args) {
		System.out.println("--- Teste do Meu Projeto Pessoal ---");
        // Teste da minha classe, desafio
		Computador computador = new Computador("DESKTOP-OURO", "intel i5 10400f", "rx 9600xt");
		Computador computador1 = new Computador("Desktop", "i3-10400f", "rtx 3050");
        Monitor monitor1 = new Monitor("LG UltraGear","LG", 1920, 1080, "lcd", computador);
        Televisao televisao = new Televisao(1920, 1080, "plasma", 0);
        
        // Isso para acontecer um erro
        // televisao.mudarCanal(100);
        televisao.ligarTelevisao();
        televisao.mudarCanal(500);
        
        System.out.println("Este monitor é da marca da " + monitor1.getMarca());
        
        monitor1.ligarMonitor();
        monitor1.setMarca("Samsung");
        monitor1.setModelo("Samsung Odyssey G3");
        monitor1.getPorta1().exibirSpecs();
        
        
       monitor1.desconectarPorta1();
       monitor1.conectarPorta1(computador1);
       monitor1.getPorta1().exibirSpecs();
       }

}
