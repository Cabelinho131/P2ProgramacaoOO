package model;

public class Auditorio extends LocalEvento {

    private boolean temSom;
    private boolean temTraducaoSimultane;



    public Auditorio(String nome, String quantidadePessoas, String bloco, boolean temSom, boolean temTraducaoSimultane) {
        super(nome, quantidadePessoas, bloco);
        this.temSom = temSom;
        this.temTraducaoSimultane = temTraducaoSimultane;
    }

    public boolean isTemSom() {
        return temSom;
    }

    public void setTemSom(boolean temSom) {
        this.temSom = temSom;
    }

    public boolean isTemTraducaoSimultane() {
        return temTraducaoSimultane;
    }

    public void setTemTraducaoSimultane(boolean temTraducaoSimultane) {
        this.temTraducaoSimultane = temTraducaoSimultane;
    }
}
