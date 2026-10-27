package br.com.fiapride.main;

import br.com.fiapride.model.Monitor;
// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Veiculo;
import br.com.fiapride.model.Viagem;

public class SistemaPrincipal {

    public static void main(String[] args) {
        System.out.println("--- FIAPRIDE: Inicializando Sistema ---");
        
        // 1. Criamos os "atores" independentes primeiro        
        Passageiro ana = new Passageiro("Ana Silva", "222.222.222-22");
        Veiculo carroDoJoao = new Veiculo("ABC-1234", "Toyota Corolla");
        
        // 2. Criamos a Viagem, conectando (associando) os objetos!        
        // Passamos a variável 'ana' e a variável 'carroDoJoao' como parâmetros.
        // 	Saldo ana = 0;    
        Viagem viagemDaAna = new Viagem("Avenida Paulista, 1000", ana, carroDoJoao);
        
        // 3. Testando se os objetos conversam        
        viagemDaAna.exibirResumo();
        
        // 4. Prova da Passagem por Referência:        
        // Se a Ana colocar saldo na conta dela DEPOIS que a viagem foi criada...        
        ana.adicionarSaldo(50.0);

        // A viagem "enxerga" esse saldo novo?        
        System.out.println("Saldo da Ana consultado ATRAVÉS da Viagem: R$ " + viagemDaAna.getSolicitante().getSaldo());

       // o Java DESTRÓI aquele construtor vazio padrão. Você é obrigado a passar a placa!
    }
}