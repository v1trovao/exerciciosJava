package Benum.test;

import Benum.dominio.InstrumentoMusical;

/*
* Modifique o enum InstrumentoMusical para incluir um metodo abstrato tocar(),
* que retorna uma string diferente para cada instrumento.
* Exemplo de saída:
* - O Violão faz som de dedilhado
* - O Piano toca teclas
* - A Bateria faz batidas
* Depois, crie um main que percorre o enum e exibe a saída de tocar().

📌 Dica: Defina tocar() como um metodo abstrato e sobrescreva ele para cada valor do enum.


* */
public class IntrumentoMusicalTest03 {
    public static void main(String[] args) {
        System.out.println("Tocando instrumentos..");
        for (InstrumentoMusical instrumento : InstrumentoMusical.values()) {
            instrumento.tocar();
        }
    }
}
