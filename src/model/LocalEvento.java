package model;

public class LocalEvento {

    private String nome;
    private String quantidadePessoas;
    private String localPredio;



    public LocalEvento(String nome,String quantidadePessoas,String localAndarSala) {
        this.quantidadePessoas = quantidadePessoas;
        this.localPredio = localAndarSala;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(String quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public String getLocalPredio() {
        return localPredio;
    }

    public void setLocalPredio(String localPredio) {
        this.localPredio = localPredio;
    }
}
