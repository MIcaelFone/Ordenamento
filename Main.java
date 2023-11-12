import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
      
        int lista[]={49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};
        //int lista[]={2,1,5,3,1};
        System.out.println("1-BubbleSort:");
        System.out.println("2-InsectationSort:");
        System.out.println("3-QuickSort:");
        System.out.println("4-Escolha uma opção:");
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        switch (opcao){
            case 1:

                break;
            case 2:
                InsectationSort insectationSort = new InsectationSort();
                insectationSort.ordenarInsectationSort(lista);
                break;
            case 3:
                QuickSort quickSort = new QuickSort();
                quickSort.Sort(lista, 0, lista.length-1);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }



      


}
