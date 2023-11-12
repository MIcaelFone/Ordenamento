import java.util.Arrays;

// Java program for implementation of QuickOrdenamento
public class QuickSort{
    
    public int Particionamento(int lista[], int inicio, int fim)
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

            }
        }

       
        int temp = lista[i+1]; // item do menor elemento a ser trocado
        System.out.println("Troca de posição:" + temp + " da posição "+(i+1)+" com o "+pivo+" da posição "+fim+".Pivo:"+pivo); 
        System.out.println("Lista antes da troca:"+Arrays.toString(lista));
        lista[i+1] = lista[fim]; // troca o item do menor elemento a ser trocado com o item do pivo
        lista[fim] = temp; // troca o item do menor elemento a ser trocado com o item do pivo
        System.out.println("Lista ápos a troca:"+Arrays.toString(lista));
        System.out.println("---------------------------------------------------------------------------------------------------------");
        
        

        return i+1; // retorna o index do menor elemento a ser trocado
    }


    /* The main function that implements QuickOrdenamento()
    arr[] --> Array to be Ordenamentoed,
    low --> Starting index,
    high --> Ending index */
   public void Ordenamento(int lista[], int inicio, int fim)
    {
        if (inicio< fim) 
        
        {
			 
            int pi = Particionamento(lista,inicio, fim);

            
            Ordenamento(lista, inicio, pi-1);
            Ordenamento(lista, pi+1, fim);
        }
    }

    /* A utility function to print array of size n */


    // Driver program

}
/*This code is contributed by Rajat Mishra */
