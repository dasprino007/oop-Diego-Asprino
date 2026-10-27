package br.com.fiapride.main;

import br.com.fiapride.model.Monitor;
// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
        Passageiro passageiro1 = new Passageiro();
        passageiro1.nome = "Ana Silva";
        passageiro1.saldo = 50.0;

        // Criando o segundo passageiro (Objeto 2)
        Passageiro passageiro2 = new Passageiro();
        passageiro2.nome = "Carlos Souza";
        passageiro2.saldo = 12.50;

        // Exibindo os dados no Console
        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);
        
        // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
        // Não porque passageiro 2 apenas compartilham a mesma tipo/Classe com tudo nenhum dos atributos são compartilhados
        
        System.out.println();
        System.out.println("-- Desafio --");
        
        // Teste da minha classe, desafio
        Monitor monitor1 = new Monitor();
        
        monitor1.isOn = true;
        monitor1.marca = "LG";
        monitor1.resolucao = "1920x1080";
        
        Monitor monitor2 = new Monitor();
        
        monitor2.isOn = false;
        monitor2.marca = "Samsung";
        monitor2.resolucao = "2560x1440";
        
        System.out.println("Este monitor é da marca da " + monitor1.marca);
        System.out.println("Este monitor é da marca da " + monitor2.marca);
    }
}