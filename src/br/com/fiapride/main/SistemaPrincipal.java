package br.com.fiapride.main;

import br.com.fiapride.model.Monitor;
// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
        Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
        System.out.println("Regarga passageiro 1");
        passageiro1.adicionarSaldo(50.0);

        // Criando o segundo passageiro (Objeto 2)
        Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
        System.out.println("Regarga passageiro 2");
        passageiro2.adicionarSaldo(12.5);

        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo + " | CPF: " + passageiro1.cpf);
        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo + " | CPF: " + passageiro2.cpf);
        
        System.out.println("Pagando viagem do passageiro 1");
        passageiro1.pagarViagem(20);
        System.out.println("Pagando viagem do passageiro 2");
        passageiro2.pagarViagem(20);
        
        System.out.println();
        System.out.println("-- Desafio --");
        
        // Teste da minha classe, desafio
        Monitor monitor1 = new Monitor("LG UltraGear","LG", "1920x1080");
        Monitor monitor2 = new Monitor("Samsung Odyssey G3","Samsung", "2560x1440");
        
        System.out.println("Este monitor é da marca da " + monitor1.marca);
        System.out.println("Este monitor é da marca da " + monitor2.marca);
        
        monitor1.ligarMonitor();
        monitor2.ligarMonitor();
        System.out.println("O " + monitor1.modelo + " esta ligado " + monitor1.isOn);
        System.out.println("O " + monitor2.modelo + " esta ligado " + monitor2.isOn);
        
        monitor1.desligarMonitor();
        System.out.println("O " + monitor1.modelo + " esta ligado " + monitor1.isOn);
        System.out.println("O " + monitor2.modelo + " esta ligado " + monitor2.isOn);
    }
}