import java.util.Arrays;


public class InsertionSort {

    public void ordenarInsertionSort(int [] lista){
        
        for (int i =1; i < lista.length; i++){
            
            int j = i; // posição do elemento a ser inserido
            while(j > 0 && lista[j]< lista[j-1]){ // enquanto o elemento a ser inserido for menor que o elemento anterior e não for o primeiro elemento da lista
                int elementoTemporario = lista[j];
                int elementoAnterior = lista[j-1];
                System.out.println( "Troca de posição:" +elementoTemporario + " da posição "+j+" com o "+elementoAnterior+" da posição "+(j-1)+".");
                System.out.println("Lista antes da troca:"+Arrays.toString(lista));
                lista[j] = lista[j-1];
                lista[j-1] =elementoTemporario;
                System.out.println("Lista após a troca:"+Arrays.toString(lista));
                System.out.println("---------------------------------------------------------------------------------------------------------");

                j--; // decrementa a posição do elemento a ser inserido

            }

        }
    }
}
