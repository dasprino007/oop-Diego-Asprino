
package br.com.fiapride.model;

public class Impressora implements Conectavel {

    @Override
    public String conectar() {
        return "Impressora conectada via USB.";
    }

    @Override
    public String desconectar() {
        return "Impressora desconectada.";
    }
}
