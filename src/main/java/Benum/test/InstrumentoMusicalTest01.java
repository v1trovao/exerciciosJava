package Benum.test;

import java.util.Scanner;
import Benum.dominio.InstrumentoMusical;

/*
* Create an enum called InstrumentoMusical that represents instruments,
* like VIOLAO, PIANO, GUITARRA e BATERIA.
* After this, create a program that gets a input string and check
* if the instrument exists in the enum.

📌 Tip: Use valueOf to convert String to Enum
*  and treat exceptions if the value doesn't exist.
*
* */
public class InstrumentoMusicalTest01 {

    public static void verificaInstrumento(String input) {

        // Metodo que retorna enum em array
        InstrumentoMusical[] instrumentos = InstrumentoMusical.values();
        for (InstrumentoMusical instrumento : instrumentos) {
            if (input.equalsIgnoreCase(instrumento.toString())) {
                System.out.println(instrumento);
                return;
            }
        }
        System.out.println("Instrument not found, sorry");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // verificaInstrumento(input);

        // Resolução do chat
        try {
            InstrumentoMusical instrumento = InstrumentoMusical.valueOf(input);
            System.out.println(instrumento);
        } catch (IllegalArgumentException e) {
            System.out.println("Instrument not found, sorry");
        }
    }
}
