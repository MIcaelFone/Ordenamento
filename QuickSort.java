import java.util.Arrays;

public class QuickSort {

    public int partition(int lista[], int inicio, int fim) {
        int pivot = lista[fim];
        int i = (inicio - 1);

        for (int j = inicio; j < fim; j++) {
            if (lista[j] <= pivot) {
                i++;
                // Troca lista[i] e lista[j]
                int temp = lista[i];
                lista[i] = lista[j];
                lista[j] = temp;

                System.out.println("Troca de posição: " + temp + " da posição " + i +
                        " com o " + lista[j] + " da posição " + j + ". Pivo: " + pivot);
                System.out.println("Lista antes da troca: " + Arrays.toString(lista));
                System.out.println("Lista após a troca: " + Arrays.toString(lista));
                System.out.println("---------------------------------------------------------------------------------------------------------");
            }
        }

        // Troca lista[i+1] e lista[high] (ou pivot)
        int temp = lista[i + 1];
        lista[i + 1] = lista[fim];
        lista[fim] = temp;

        System.out.println("Troca de posição: " + temp + " da posição " + (i + 1) +
                " com o " + pivot + " da posição " + fim + ". Pivo: " + pivot);
        System.out.println("Lista antes da troca: " + Arrays.toString(lista));
        System.out.println("Lista após a troca: " + Arrays.toString(lista));
        System.out.println("---------------------------------------------------------------------------------------------------------");

        return i + 1;
    }

    public void sort(int lista[], int inicio, int fim) {
        if (inicio < fim) {
            int pi = partition(lista, inicio, fim);

            // Recursivamente ordena elementos antes
            // da partição e depois da partição
            sort(lista, inicio, pi - 1);
            sort(lista, pi + 1, fim);
        }
    }
}
