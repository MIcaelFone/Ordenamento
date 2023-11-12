import java.util.Arrays;

// Java program for implementation of QuickSort
public class QuickSort
{
    
    public int Partition(int lista[], int inicio, int fim)
    {
        int pivot = lista[fim];
        int i = (inicio -1); // index of smaller element
        int troca =-0;
        for (int j = inicio; j<fim; j++)

        {
            // If current element is smaller than or
            // equal to pivot
            if (lista[j] <= pivot)
            {
                i++;
                
                // swap arr[i] and arr[j]
                int temp = lista[i];
                int temp2 = lista[j];
                System.out.println( "Troca de posição:" + temp + " da posição "+i+" com o "+temp2+" da posição "+j+".Pivo:"+pivot);
                System.out.println("Lista antes da troca:"+Arrays.toString(lista));
                lista[i] = lista[j];
                lista[j] = temp;
                troca++;
                System.out.println("Lista ápos a troca:"+Arrays.toString(lista));               
                System.out.println("---------------------------------------------------------------------------------------------------------");

            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = lista[i+1];
        System.out.println("Troca de posição:" + temp + " da posição "+(i+1)+" com o "+pivot+" da posição "+fim+".Pivo:"+pivot); 
        System.out.println("Lista antes da troca:"+Arrays.toString(lista));
        lista[i+1] = lista[fim];
        lista[fim] = temp;
        System.out.println("Lista ápos a troca:"+Arrays.toString(lista));
        System.out.println("---------------------------------------------------------------------------------------------------------");
        
        

        return i+1;
    }


    /* The main function that implements QuickSort()
    arr[] --> Array to be sorted,
    low --> Starting index,
    high --> Ending index */
   public void Sort(int lista[], int inicio, int fim)
    {
        if (inicio< fim)
        
        {
			/* pi is partitioning index, arr[pi] is
			now at right place */
            int pi = Partition(lista,inicio, fim);

            // Recursively sort elements before
            // partition and after partition
            Sort(lista, inicio, pi-1);
            Sort(lista, pi+1, fim);
        }
    }

    /* A utility function to print array of size n */


    // Driver program

}
/*This code is contributed by Rajat Mishra */
