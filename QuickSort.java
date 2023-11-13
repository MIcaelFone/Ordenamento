import java.util.Arrays;

public class QuickSort {

    private int Particionamento(int lista[], int inicio, int fim) {
        int pivo = lista[fim];
        int i = (inicio - 1);  // index do menor elemento a ser trocado
        
        for (int j = inicio; j < fim; j++) { 

            if (lista[j] <= pivo) {
                i++; // incrementa o index do menor elemento a ser trocado
 
                int temp = lista[i];
                int temp2 = lista[j];
                System.out.println( "Troca de posição:" + temp + " da posição "+i+" com o "+temp2+" da posição "+j+".Pivo:"+pivo);
                System.out.println("Lista antes da troca:"+Arrays.toString(lista));
                lista[i] = lista[j];
                lista[j] = temp; // troca o item do menor elemento a ser trocado com o item do elemento atual
      
                System.out.println("Lista após a troca:"+Arrays.toString(lista));               
                System.out.println("---------------------------------------------------------------------------------------------------------");
            }
        }
        int temp = lista[i+1]; // guarda o item do menor elemento a ser trocado
        System.out.println("Troca de posição:" + temp + " da posição "+(i+1)+" com o "+pivo+" da posição "+fim+".Pivo:"+pivo); 
        System.out.println("Lista antes da troca:"+Arrays.toString(lista));
        lista[i+1] = lista[fim]; // troca o item do menor elemento a ser trocado com o item do pivo
        lista[fim] = temp; // troca o item do menor elemento a ser trocado com o item do pivo
        System.out.println("Lista após a troca:"+Arrays.toString(lista));
        System.out.println("---------------------------------------------------------------------------------------------------------"); 
       
        return i+1; // retorna o index do menor elemento a ser trocado
    }
          
       
    

    public void Ordenamento(int lista[], int inicio, int fim) {
        if (inicio < fim) {
            int indiciePivo = Particionamento(lista, inicio, fim);

            Ordenamento(lista, inicio, indiciePivo - 1);
            Ordenamento(lista, indiciePivo + 1, fim);
        }
    }
}
