import java.util.Arrays;

// Java program for implementation of QuickSort
public class QuickSort
{
    /* This function takes last element as pivot,
    places the pivot element at its correct
    position in sorted array, and places all
    smaller (smaller than pivot) to left of
    pivot and all greater elements to right
    of pivot */
    public int partition(int lista[], int inicio, int fim)
    {
        int pivot = lista[fim];
        int i = (inicio -1); // index of smaller element
        for (int j = inicio; j<fim; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (lista[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = lista[i];
                lista[i] = lista[j];
                lista[j] = temp;
                System.out.println("Particionamento:"+Arrays.toString(lista));
                
                System.out.println("Pivot:"+pivot );
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = lista[i+1];
        lista[i+1] = lista[fim];
        lista[fim] = temp;
        System.out.println("Particionamento:"+Arrays.toString(lista));
        System.out.println("Pivot:"+pivot );

        return i+1;
    }


    /* The main function that implements QuickSort()
    arr[] --> Array to be sorted,
    low --> Starting index,
    high --> Ending index */
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
			/* pi is partitioning index, arr[pi] is
			now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    /* A utility function to print array of size n */


    // Driver program

}
/*This code is contributed by Rajat Mishra */
