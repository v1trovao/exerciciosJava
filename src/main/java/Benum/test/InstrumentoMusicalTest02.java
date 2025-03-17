package Benum.test;

import Benum.dominio.InstrumentoMusical;

/*
* Modifique o enum InstrumentoMusical para incluir um atributo
* familia (ex: Cordas, Percussão, Teclas).
* Depois, crie um metodo para exibir todos os instrumentos e
* suas respectivas famílias.

📌 Dica: Crie um construtor e um metodo getFamilia() no enum.
* */
public class InstrumentoMusicalTest02 {

    public static void main(String[] args) {
        System.out.println("--- Instrumentos ---");
        InstrumentoMusical.imprime();
    }
}
