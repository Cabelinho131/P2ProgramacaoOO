package control;
import model.AlunosParticipantes;
import model.Organizador;
import model.Palestrante;
import model.PessoaResponsavel;
import model.Evento;
import model.Palestra;
import model.Auditorio;
import model.Sala;
import model.Instrutor;
import model.Organizador;
import model.Laboratorio;
import model.LocalEvento;
import model.Minicurso;
import model.Seminario;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    private List<AlunosParticipantes> alunos = new ArrayList<>();



    public static void main(String[] args) {



        Evento evento1 = new Evento("Semana de Tecnologia", "Uma semana dedicada à tecnologia", "01/10/2023", "10000 reais");
        System.out.println("Evento: " + evento1.getNome() + "data" + evento1.getData() + " - Duração: " + evento1.getHoraDuracao() + " - Orçamento: " + evento1.getOrcamento());
        Evento evento2 = new Evento("Semana de Python", "Uma semana dedicada à tecnologia", "01/10/2024", "5000 reais");
        System.out.println("Evento: " + evento1.getNome() + "data" + evento1.getData() + " - Duração: " + evento1.getHoraDuracao() + " - Orçamento: " + evento2.getOrcamento());


        Auditorio auditorio1 = new Auditorio("Auditório Principal", "200 pessoas", "1 andar", true, true);
        System.out.println("Auditório: " + auditorio1.getNome() + " - Capacidade: " + auditorio1.getQuantidadePessoas() + " - Localização: " + auditorio1.getLocalPredio());
        Auditorio auditorio2 = new Auditorio("Auditório 2", "50 pessoas", "terreo", true, true);
        System.out.println("Auditório: " + auditorio2.getNome() + " - Capacidade: " + auditorio2.getQuantidadePessoas() + " - Localização: " + auditorio2.getLocalPredio());


        Sala sala1 = new Sala("Sala de Reuniões", "30 pessoas", "2 andar", 302, true);
        System.out.println("Sala: " + sala1.getNome() + " - Capacidade: " + sala1.getQuantidadePessoas() + " - Localização: " + sala1.getLocalPredio() + " - Número: " + sala1.getNumeroSala());
        Sala sala2 = new Sala("Sala Tech1", "40 pessoas", "2 andar", 301, false);
        System.out.println("Sala: " + sala2.getNome() + " - Capacidade: " + sala2.getQuantidadePessoas() + " - Localização: " + sala2.getLocalPredio() + " - Número: " + sala2.getNumeroSala());


        Organizador organizador1 = new Organizador("Maria", "maria@email.com", "coordenador");
        System.out.println("Organizador: " + organizador1.getNome() + " - Função: " + organizador1.getFuncaoAdministrativa());
        Organizador organizador2 = new Organizador("Amanda", "amanda@email.com", "Professora");
        System.out.println("Organizador: " + organizador2.getNome() + " - Função: " + organizador2.getFuncaoAdministrativa());

        AlunosParticipantes aluno1 = new AlunosParticipantes("João", "12022932", "ADS", "joaodev07@outlook.com");
        System.out.println("Aluno: " + aluno1.getNome() + " - Curso: " + aluno1.getCurso() + " - Email: " + aluno1.getEmail());
        AlunosParticipantes aluno2 = new AlunosParticipantes("Ana", "1202959693", "Engenharia", "anadev@gmail.com");
        System.out.println("Aluno: " + aluno2.getNome() + " - Curso: " + aluno2.getCurso() + " - Email: " + aluno2.getEmail());


        Palestrante palestrante1 = new Palestrante("Carlos", "Carlosdev@gmail.com");
        System.out.println("Palestrante: " + palestrante1.getNome() + " - Email: " + palestrante1.getEmail());
        Palestrante palestrante2 = new Palestrante("Fernanda", "fernadadev@gmail.com");
        System.out.println("Palestrante: " + palestrante2.getNome() + " - Email: " + palestrante2.getEmail());


        PessoaResponsavel responsavel1 = new PessoaResponsavel("Roberto", "robdev@gmail.com");
        System.out.println("Responsável: " + responsavel1.getNome() + " - Email: " + responsavel1.getEmail());
        PessoaResponsavel responsavel2 = new PessoaResponsavel("Roberto Carlos", "RobCarlosdv@gmail.com");
        System.out.println("Responsável: " + responsavel2.getNome() + " - Email: " + responsavel2.getEmail());


        Instrutor instrutor1 = new Instrutor("Lucas", "lc07@gmail.com", "Desenvolvedor Full Stack", "Desenvolvimento de Software");
        System.out.println("Instrutor: " + instrutor1.getNome() + " - Email: " + instrutor1.getEmail() + " - Área de atuação: " + instrutor1.getAreaEspecializacao() + " - Especialização: " + instrutor1.getFormacao());
        Instrutor instrutor2 = new Instrutor("Lucas", "lc07@gmail.com", "Desenvolvedor Full Stack", "Desenvolvimento de Software");
        System.out.println("Instrutor: " + instrutor2.getNome() + " - Email: " + instrutor2.getEmail() + " - Área de atuação: " + instrutor2.getAreaEspecializacao() + " - Especialização: " + instrutor2.getFormacao());


        Laboratorio laboratorio1 = new Laboratorio("Laboratório de Informática", "30 pessoas", "3 andar", "40 pessoas", "Computação");
        System.out.println("Laboratório: " + laboratorio1.getNome() + " - Capacidade: " + laboratorio1.getQuantidadePessoas() + " - Localização: " + laboratorio1.getLocalPredio() + " - Numero de computadores: " + laboratorio1.getNumeroComputadores());



        Seminario seminario1 = new Seminario(
                "Seminário de Tecnologia",
                "01/10/2023",
                "2h",
                "10000 reais",
                "Carlos",
                "Python para iniciantes",
                "Auditório Principal"
        );

        System.out.println("Seminário: " + seminario1.getNome()
                + " - Data: " + seminario1.getData()
                + " - Duração: " + seminario1.getHoraDuracao()
                + " - Orçamento: " + seminario1.getOrcamento()
                + " - Palestrante: " + seminario1.getPalestrante()
                + " - Tema: " + seminario1.getTema()
                + " - Local: " + seminario1.getLocal());



        Minicurso minicurso1 = new Minicurso(
                "Seminário de Tecnologia",
                "01/10/2023",
                "2h",
                "10000 reais",
                "Carlos",
                "Python para iniciantes",
                "Auditório Principal"
        );

        System.out.println("Minicurso python: " + seminario1.getNome()
                + " - Data: " + seminario1.getData()
                + " - Duração: " + seminario1.getHoraDuracao()
                + " - Orçamento: " + seminario1.getOrcamento()
                + " - Palestrante: " + seminario1.getPalestrante()
                + " - Tema: " + seminario1.getTema()
                + " - Local: " + seminario1.getLocal());


        Minicurso minicurso2 = new Minicurso(
                "Minicurso de Tecnologia",
                "01/10/2025",
                "2h",
                "10000 reais",
                "Joao",
                "Java para iniciantes",
                "Auditório Principal"
        );

        System.out.println("Minicurso Java: " + seminario1.getNome()
                + " - Data: " + minicurso1.getData()
                + " - Duração: " + minicurso1.getHoraDuracao()
                + " - Orçamento: " + minicurso1.getOrcamento()
                + " - Palestrante: " + minicurso1.getPalestrante()
                + " - Tema: " + minicurso1.getTema()
                + " - Local: " + minicurso1.getLocal());




        LocalEvento localevento1 = new LocalEvento("Auditório Principal", "200 pessoas", "1 andar");
        System.out.println("Local do Evento: " + localevento1.getNome() + " - Capacidade: " + localevento1.getQuantidadePessoas() + " - Localização: " + localevento1.getLocalPredio());
        LocalEvento localevento2 = new LocalEvento("Auditório 2", "50 pessoas", "terreo");
        System.out.println("Local do Evento: " + localevento2.getNome() + " - Capacidade: " + localevento2.getQuantidadePessoas() + " - Localização: " + localevento2.getLocalPredio());


    }



}


