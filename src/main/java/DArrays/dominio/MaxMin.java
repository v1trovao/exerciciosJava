package DArrays.dominio;

// Fazer duas funções max e min, que recebe uma lista de inteiros
// como entrada, e retorna o maior ou menor número na lista.
// Cada função retorna um único número
// Opcional: Considerar arrays vazias e com apenas único elemento

public class MaxMin {

    public int max(int[] numbers) {

        // Verifica se array está vazia
        if (numbers == null || numbers.length == 0)
            return 0;

        // Considera o primeiro elemento como maior
        int max = numbers[0];

        // Percorre a lista a partir do segundo elemento
        for (int i = 1; i < numbers.length; i++) {

            // Compara cada número da lista com o maior
            if (numbers[i] > max) {
                max = numbers[i]; // Altera se houver número maior que o atual
            }
        }

        // Retorna o número que foi o maior da lista
        return max;
    }

    // Mesmo procedimento para achar o menor da lista
    public int min(int[] numbers) {

        if (numbers == null || numbers.length == 0)
            return 0;

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }
}
