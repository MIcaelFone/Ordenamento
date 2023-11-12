import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD

        int lista[] = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        System.out.println("1-BubbleSort:");
        System.out.println("2-InsectationSort:");
        System.out.println("3-QuickSort:");
        System.out.println("Escolha uma opção: ");
=======
      
        int lista[]={49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};
        System.out.println("1-BubbleSort:");
        System.out.println("2-InsectationSort:");
        System.out.println("3-QuickSort:");
        System.out.println("Escolha uma opção:");
>>>>>>> 5ebfb3e5634475f5ff914d4e8b27f3c4949a90b3
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                BubbleSort bubbleSort = new BubbleSort();
                bubbleSort.ordenarBubbleSort(lista);
                break;
            case 2:
                InsertionSort insectationSort = new InsertionSort();
                insectationSort.ordenarInsertionSort(lista);
                break;
            case 3:
                QuickSort quickSort = new QuickSort();
<<<<<<< HEAD
                quickSort.sort(lista, 0, lista.length - 1);
=======
                quickSort.Ordenamento(lista, 0, lista.length-1);
>>>>>>> 5ebfb3e5634475f5ff914d4e8b27f3c4949a90b3
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        // Imprime o array final, independente da opção escolhida
        System.out.println("Array ordenado: " + Arrays.toString(lista));
    }
}
