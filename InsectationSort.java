import java.util.ArrayList;
import java.util.Arrays;


public class InsectationSort {

    public void ordenarInsectationSort(int [] lista){
        for (int i =1; i < lista.length; i++){
            int j = i;
            while(j > 0 && lista[j]< lista[j-1]){
                int elemento_temporario = lista[j];
                System.out.println( "Troca de posição:" + elemento_temporario + " da posição "+j+" com o "+lista[j-1]+" da posição "+(j-1)+".");
                System.out.println("Lista antes da troca:"+Arrays.toString(lista));
                lista[j] = lista[j-1];
                lista[j-1] = elemento_temporario;
                System.out.println("Lista ápos a troca:"+Arrays.toString(lista));
                System.out.println("---------------------------------------------------------------------------------------------------------");

                j--;

            }

        }
    }
}
