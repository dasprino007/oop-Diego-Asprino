package br.com.fiapride.main;

import java.util.ArrayList;
import java.util.List;

import br.com.fiapride.model.*;

public class TesteMonitor {

	public static void main(String[] args) {
		System.out.println("--- Teste do Meu Projeto Pessoal ---");
        // Teste da minha classe, desafio
		List<Tela> telas = new ArrayList<>();
		Computador computador = new Computador("DESKTOP-OURO", "intel i5 10400f", "rx 9600xt");

        telas.add(new Monitor("LG UltraGear","LG", 1920, 1080, "lcd", computador));
        telas.add(new Televisao(1920, 1080, "plasma", 0));
        
        for (Tela tela : telas) {
            System.out.println("Tela: " + tela.isOn());
            tela.ligar();
            System.out.println("Tipo de entrada: " + tela.conectorTipo());
        }
       }

}
