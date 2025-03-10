package Benum.test;

import Benum.dominio.DiaSemana;

public class DiaSemanaTest01 {

    public static String verificaDia(DiaSemana dia) {
        return switch (dia) {
            case SABADO, DOMINGO -> "Final de Semana";
            default -> "Dia Útil";
        };
    }

    public static void main(String[] args) {
        DiaSemana dia1 = DiaSemana.SEGUNDA;
        System.out.println(dia1);
        System.out.println(verificaDia(dia1));
        for (DiaSemana dia : DiaSemana.values()) {
            System.out.println(dia + " - " + verificaDia(dia));
        }

    }
}
