package model;

import java.util.ArrayList;
import java.util.List;

public class AlunosParticipantes {
    private String nome;
    private String cpf;
    private String curso;
    private String email;
    private List<Palestra> palestras;

    public AlunosParticipantes(String nome, String cpf, String curso, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.curso = curso;
        this.email = email;
        this.palestras = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return cpf;
    }

    public String getCurso() {
        return curso;
    }

    public String getEmail() {
        return email;
    }

    public void adicionarPalestra(Palestra palestra) {
        this.palestras.add(palestra);
    }

    public List<Palestra> getPalestras() {
        return palestras;
    }
}