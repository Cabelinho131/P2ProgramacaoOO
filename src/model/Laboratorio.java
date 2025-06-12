package model;

public class Laboratorio extends LocalEvento{
    private String numeroComputadores;
    private String tipoLaboratorio;


    public Laboratorio(String nome, String quantidadePessoas, String bloco, String numeroComputadores, String tipoLaboratorio) {
        super(nome, quantidadePessoas, bloco);
        this.numeroComputadores = numeroComputadores;
        this.tipoLaboratorio = tipoLaboratorio;
    }

    public String getNumeroComputadores() {
        return numeroComputadores;
    }

    public void setNumeroComputadores(String numeroComputadores) {
        this.numeroComputadores = numeroComputadores;
    }

    public String getTipoLaboratorio() {
        return tipoLaboratorio;
    }

    public void setTipoLaboratorio(String tipoLaboratorio) {
        this.tipoLaboratorio = tipoLaboratorio;
    }
}
