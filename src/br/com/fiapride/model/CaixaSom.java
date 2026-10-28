
package br.com.fiapride.model;

public class CaixaSom implements Conectavel {

    @Override
    public String conectar() {
        return "Caixa de som conectada via Bluetooth.";
    }

    @Override
    public String desconectar() {
        return "Caixa de som desconectada.";
    }
}
