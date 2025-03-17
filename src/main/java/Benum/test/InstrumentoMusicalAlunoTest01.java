package Benum.test;

import Benum.dominio.Aluno;
import Benum.dominio.InstrumentoMusical;

import java.util.Scanner;

/*
* Create a class Aluno with the following attributes:
* - nome (String)
* - instrumento (enum InstrumentoMusical, from last exercise)
* Add a method showInfo() that print the student data.
* In main, create students and print they information.

📌 Tip: The class constructor must get an InstrumentoMusical parameter.
* */
public class InstrumentoMusicalAlunoTest01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno[] alunos = new Aluno[10];
        int total = alunos.length;

        // Alunos
        Aluno alunoTest = new Aluno("Fulano", InstrumentoMusical.SANFONA);
        Aluno alunoTest02 = new Aluno("Nobara", InstrumentoMusical.GUITARRA);
        Aluno alunoTest03 = new Aluno("Ski", InstrumentoMusical.PIANO);

        alunos[0] = alunoTest;
        alunos[1] = alunoTest02;
        alunos[2] = alunoTest03;

        // Inicio e entrada
        System.out.println("Vagas: " + (total - 3));
        System.out.println("Informe o nome do aluno:");
        String nome = sc.nextLine();

        System.out.println("Informe o instrumento desejado");
        InstrumentoMusical.imprime();
        String opcao = sc.nextLine();
        Aluno aluno1;

        switch (opcao) {
            case "1" -> aluno1 = new Aluno(nome, InstrumentoMusical.SANFONA);
            case "2" -> aluno1 = new Aluno(nome, InstrumentoMusical.PIANO);
            case "3" -> aluno1 = new Aluno(nome, InstrumentoMusical.GUITARRA);
            case "4" -> aluno1 = new Aluno(nome, InstrumentoMusical.BATERIA);
            default -> {
                System.out.println("Instrument not found, sorry");
                return;
            }
        }

        // Saída, imprimindo dados
        System.out.println("Aluno cadastrado: ");
        aluno1.showInfo();
        alunos[3] = aluno1;

        System.out.println("---- Alunos ----");
        for (Aluno aluno : alunos) {
            try {
                aluno.showInfo();
            } catch (Exception e) {
                return;
            }
        }
    }
}
