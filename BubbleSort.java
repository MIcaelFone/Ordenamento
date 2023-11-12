import java.util.Arrays;

public class BubbleSort {

    public void ordenarBubbleSort(int[] lista) {
        int n = lista.length;
        boolean troca;

        for (int i = 0; i < n - 1; i++) {
            troca = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    // Troca os elementos se estiverem na ordem errada
                    int elementoAtual = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = elementoAtual;
                    troca = true;

                    System.out.println("Troca de posição: " + elementoAtual + " com " + lista[j + 1]);
                    System.out.println("Lista antes da troca: " + Arrays.toString(lista));
                    System.out.println("Lista após a troca: " + Arrays.toString(lista));
                    System.out.println("---------------------------------------------------------------------------------------------------------");
                }
            }

            // Se não houver trocas durante uma iteração, o array está ordenado
            if (!troca) {
                break;
            }
        }
    }
}
