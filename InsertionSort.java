import java.util.Arrays;

public class InsertionSort {

    public void ordenarInsertionSort(int[] lista) {
        for (int i = 1; i < lista.length; i++) {
            int j = i;
            int elementoTemporario = lista[j];

            while (j > 0 && elementoTemporario < lista[j - 1]) {
                System.out.println("Troca de posição: " + elementoTemporario + " da posição " + j +
                        " com o " + lista[j - 1] + " da posição " + (j - 1) + ".");
                System.out.println("Lista antes da troca: " + Arrays.toString(lista));
                
                lista[j] = lista[j - 1];
                lista[j - 1] = elementoTemporario;

                System.out.println("Lista após a troca: " + Arrays.toString(lista));
                System.out.println("---------------------------------------------------------------------------------------------------------");

                j--;
            }
        }
    }
}
