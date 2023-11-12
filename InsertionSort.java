import java.util.Arrays;

public class InsertionSort {

    public void ordenarInsertionSort(int[] lista) {
        for (int i = 1; i < lista.length; i++) {
            int j = i;
            int elementoTemporario = lista[j];

            while (j > 0 && elementoTemporario < lista[j - 1]) {
                // Troca os elementos se estiverem na ordem errada
                lista[j] = lista[j - 1];
                lista[j - 1] = elementoTemporario;

                // Impressão após a troca
                System.out.println("Troca de posição: " + elementoTemporario +
                        " da posição " + j + " com o " + lista[j - 1] +
                        " da posição " + (j - 1) + ".");
                System.out.println("Lista após a troca: " + Arrays.toString(lista));
                System.out.println("---------------------------------------------------------------------------------------------------------");

                j--;
            }
        }
    }
}
