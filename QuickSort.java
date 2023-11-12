import java.util.Arrays;

public class QuickSort {

    private int Particionamento(int lista[], int inicio, int fim) {
        int pivo = lista[fim];
        int i = (inicio - 1);

        for (int j = inicio; j < fim; j++) {
            if (lista[j] <= pivo) {
                i++;
                // Troca lista[i] e lista[j]
                int temp = lista[i];
                lista[i] = lista[j];
                lista[j] = temp;

                System.out.println("Troca de posição: " + temp + " da posição " + i +
                        " com o " + lista[j] + " da posição " + j + ". Pivo: " + pivo);
                System.out.println("Lista antes da troca: " + Arrays.toString(lista));
                System.out.println("Lista após a troca: " + Arrays.toString(lista));
                System.out.println("---------------------------------------------------------------------------------------------------------");
            }
        }

        int temp = lista[i + 1];
        System.out.println("Troca de posição: " + temp + " da posição " + (i + 1) +
                " com o " + pivo + " da posição " + fim + ". Pivo: " + pivo);
        System.out.println("Lista antes da troca: " + Arrays.toString(lista));
        System.out.println("Lista após a troca: " + Arrays.toString(lista));
        System.out.println("---------------------------------------------------------------------------------------------------------");

        return i + 1;
    }

    public void Ordenamento(int lista[], int inicio, int fim) {
        if (inicio < fim) {
            int indiciePivo = Particionamento(lista, inicio, fim);

            Ordenamento(lista, inicio, indiciePivo - 1);
            Ordenamento(lista, indiciePivo + 1, fim);
        }
    }
}
