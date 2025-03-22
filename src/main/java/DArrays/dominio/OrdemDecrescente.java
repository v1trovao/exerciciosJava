package DArrays.dominio;

import java.util.Arrays;
import java.util.Collections;

public class OrdemDecrescente {

    public static int ordemDesc(int num) {
        // 1 - Transforma o tipo de dado de Integer para Array de String, usando o valueOf e o split
        String[] valor = String.valueOf(num).split("");

        // 2 - Ordenar os elementos por ordem descrente, ou reverse, usando o sort e reverseOrder
        // Aqui são metodos de Arrays e Collections, importante estudar essa estrutura
        Arrays.sort(valor, Collections.reverseOrder());

        // 3 - Transformar o array em número novamente, retornando o valor final
        // 3.1 - Converte a array de string em uma única string usando join
        // 3.2 - Converte a String em inteiro, usando Integer.valueOf (tbm pode usar o parseInt(?)
        //       e retorna o valor final
        return Integer.valueOf(String.join("", valor));
    }
}
