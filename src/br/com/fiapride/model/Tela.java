
package br.com.fiapride.model;

public abstract class Tela implements Conectavel {

    private int resolucaoEixoX;
    private int resolucaoEixoY;
    private boolean isOn;
    private String tipoTela;

    public Tela(int resolucaoEixoX, int resolucaoEixoY, String tipoTela) {
        this.resolucaoEixoX = resolucaoEixoX;
        this.resolucaoEixoY = resolucaoEixoY;
        this.tipoTela = tipoTela;
    }

    public int getResolucaoEixoX() {
        return resolucaoEixoX;
    }

    public int getResolucaoEixoY() {
        return resolucaoEixoY;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public boolean isOn() {
        return isOn;
    }

    protected void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void ligar() {
        setOn(true);
    }

    public void desligar() {
        setOn(false);
    }

    @Override
    public String conectar() {
        return "Tela conectada!";
    }

    @Override
    public String desconectar() {
        return "Tela desconectada!";
    }

    public abstract String conectorTipo();
}
