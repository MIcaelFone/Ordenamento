import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int lista[] = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};
        
        System.out.println("Array original: " + Arrays.toString(lista));
        System.out.println("1-BubbleSort:");
        System.out.println("2-InsertionSort:");
        System.out.println("3-QuickSort:");
        System.out.println("Escolha uma opção:");
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                BubbleSort bubbleSort = new BubbleSort();
                bubbleSort.ordenarBubbleSort(lista);
                break;
            case 2:
                InsertionSort insertionSort = new InsertionSort();
                insertionSort.ordenarInsertionSort(lista);
                break;
            case 3:
                QuickSort quickSort = new QuickSort();
                quickSort.Ordenamento(lista, 0, lista.length - 1);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        // Imprime o array final, independente da opção escolhida
        System.out.println("Array ordenado: " + Arrays.toString(lista));
    }
}
