import java.util.Arrays;

<<<<<<< HEAD
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
=======
public class QuickSort{
    
    private int Particionamento(int lista[], int inicio, int fim)
    {
        int pivo = lista[fim];//pivo
        int i = (inicio -1);// index do menor elemento a ser trocado
        for (int j = inicio; j<fim; j++)  // index do elemento atual

        {
            
            if (lista[j] <= pivo)
            {
                i++; // incrementa o index do menor elemento a ser trocado 
                
                
                int temp = lista[i]; // item do menor elemento a ser trocado
                int temp2 = lista[j]; // item do elemento atual
                System.out.println( "Troca de posição:" + temp + " da posição "+i+" com o "+temp2+" da posição "+j+".Pivo:"+pivo);
                System.out.println("Lista antes da troca:"+Arrays.toString(lista));
                lista[i] = lista[j];
                lista[j] = temp; // troca o item do menor elemento a ser trocado com o item do elemento atual
      
                System.out.println("Lista ápos a troca:"+Arrays.toString(lista));               
                System.out.println("---------------------------------------------------------------------------------------------------------");
>>>>>>> 5ebfb3e5634475f5ff914d4e8b27f3c4949a90b3

                System.out.println("Troca de posição: " + temp + " da posição " + i +
                        " com o " + lista[j] + " da posição " + j + ". Pivo: " + pivot);
                System.out.println("Lista antes da troca: " + Arrays.toString(lista));
                System.out.println("Lista após a troca: " + Arrays.toString(lista));
                System.out.println("---------------------------------------------------------------------------------------------------------");
            }
        }

<<<<<<< HEAD
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
=======
       
        int temp = lista[i+1]; // item do menor elemento a ser trocado
        System.out.println("Troca de posição:" + temp + " da posição "+(i+1)+" com o "+pivo+" da posição "+fim+".Pivo:"+pivo); 
        System.out.println("Lista antes da troca:"+Arrays.toString(lista));
        lista[i+1] = lista[fim]; // troca o item do menor elemento a ser trocado com o item do pivo
        lista[fim] = temp; // troca o item do menor elemento a ser trocado com o item do pivo
        System.out.println("Lista ápos a troca:"+Arrays.toString(lista));
        System.out.println("---------------------------------------------------------------------------------------------------------");
        
        

        return i+1; // retorna o index do menor elemento a ser trocado
>>>>>>> 5ebfb3e5634475f5ff914d4e8b27f3c4949a90b3
    }

    public void sort(int lista[], int inicio, int fim) {
        if (inicio < fim) {
            int pi = partition(lista, inicio, fim);

<<<<<<< HEAD
            // Recursivamente ordena elementos antes
            // da partição e depois da partição
            sort(lista, inicio, pi - 1);
            sort(lista, pi + 1, fim);
        }
    }
=======
   
   public void Ordenamento(int lista[], int inicio, int fim)
    {
        if (inicio< fim) 
        
        {
			 
            int indiciePivo = Particionamento(lista,inicio, fim); 

            
            Ordenamento(lista, inicio, indiciePivo-1); 
            Ordenamento(lista, indiciePivo+1, fim);
        }
    }

  
>>>>>>> 5ebfb3e5634475f5ff914d4e8b27f3c4949a90b3
}
