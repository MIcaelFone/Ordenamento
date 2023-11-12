import java.util.ArrayList;
import java.util.Arrays;


public class InsectationSort {

    public void ordenarInsectationSort(int [] lista){
        
        for (int i =1; i < lista.length; i++){ // posição do elemento a ser inserido
            
            int j = i; // posição do elemento a ser inserido
            while(j > 0 && lista[j]< lista[j-1]){ // enquanto o elemento a ser inserido for menor que o elemento anterior
                int elemento_temporario = lista[j];
                System.out.println( "Troca de posição:" + elemento_temporario + " da posição "+j+" com o "+lista[j-1]+" da posição "+(j-1)+".");
                System.out.println("Lista antes da troca:"+Arrays.toString(lista));
                lista[j] = lista[j-1];
                lista[j-1] = elemento_temporario;
                System.out.println("Lista ápos a troca:"+Arrays.toString(lista));
                System.out.println("---------------------------------------------------------------------------------------------------------");

                j--; // decrementa a posição do elemento a ser inserido

            }

        }
    }
}
