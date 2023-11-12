import java.util.ArrayList;
import java.util.Arrays;


public class InsectationSort {

    public void ordenarInsectationSort(int [] lista){
        for (int i =1; i < lista.length; i++){
            int j = i;
            while(j > 0 && lista[j]< lista[j-1]){
                int elemento_temporario = lista[j];
                lista[j] = lista[j-1];
                lista[j-1] = elemento_temporario;
                System.out.println("Ordenanmento:"+Arrays.toString(lista));

                j--;

            }

        }
    }
}
