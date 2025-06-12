package model;

public  class Evento {
    private String nome;
    private String data;
    private String horaDuracao;
    private String orcamento;


    public Evento(String horaDuracao, String data, String nome, String orcamento) {
        this.horaDuracao = horaDuracao;
        this.data = data;
        this.nome = nome;
        this.orcamento = orcamento;
    }

    public String getOrcamento() {
        return orcamento;
    }
    public void setOrcamento(String orcamento) {
        this.orcamento = orcamento;
    }
    public String getHoraDuracao() {
        return horaDuracao;
    }

    public void setHoraDuracao(String horaDuracao) {
        this.horaDuracao = horaDuracao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
