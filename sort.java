public class sort {
	public void insertionSort(int[] arr, int n) 
    { 
		
        if (n <= 1)                             
        {
            return; 
        }

        insertionSort( arr, n-1 );  // sort the remaining array
      
       
        int last = arr[n-1];       //last element of the array
        int j = n-2;               //correct index of last element of the array
       
        while (j >= 0 && arr[j] > last) //find the correct index 
        { 
            arr[j+1] = arr[j];     //shift section of sorted elements upwards 
            j--; 
        } 
        arr[j + 1] = last;         //set the last element at its correct index
    } 

}
