package model;

public class Sala extends LocalEvento{
    private int numeroSala;
    private boolean temMultimidia;

    public Sala(String nome, String quantidadePessoas, String bloco, int numeroSala, boolean temMultimidia) {
        super(nome, quantidadePessoas, bloco);
        this.numeroSala = numeroSala;
        this.temMultimidia = temMultimidia;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public boolean isTemMultimidia() {
        return temMultimidia;
    }

    public void setTemMultimidia(boolean temMultimidia) {
        this.temMultimidia = temMultimidia;
    }
}