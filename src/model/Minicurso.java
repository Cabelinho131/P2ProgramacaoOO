package model;

public class Minicurso extends Evento {

    private String palestrante;
    private String tema;
    private String local;

    public Minicurso(String nome, String data, String horaDuracao, String orcamento, String palestrante, String tema, String local) {
        super(horaDuracao, data, nome, orcamento);
        this.palestrante = palestrante;
        this.tema = tema;
        this.local = local;
    }

    public String getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(String palestrante) {
        this.palestrante = palestrante;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}