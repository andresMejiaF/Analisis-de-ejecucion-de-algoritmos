package Proyecto;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Vector;

public class Metodos {

	/*
	 * 
	 * 
	 * METODOS ESTRAIDOS DE :
	 * https://www.geeksforgeeks.org/selection-sort/?ref=lbp
	 * 
	 * y presentaciones de clase
	 * 
	 * */
	
	
	/*
	 * Lista Auxiliar de numeros aleatorios de
	 * 10000 posiciones.
	 * */
	
	public  int[] lista(){
	    
	    Random r = new Random();
	    int valorDado;  
	        int[] listaNumeros =   new int[10000];
	        
	 
	       
	    for (int i = 0; i < 10000; i++)
	    {
	        valorDado = r.nextInt(10000)+1;
	              listaNumeros[i]=valorDado;
	    }
	    
	
	   
	  return listaNumeros;
	    
	}
	
	/*
	 * Lista Auxiliar de numeros aleatorios LinkedList de
	 * 10000 posiciones.
	 * */
	
	public   LinkedList<Integer> lista2(){
	    
	    Random r = new Random();
	    Integer valorDado;  
	        LinkedList<Integer> listaNumeros = new LinkedList<>();
	        
	 
	       
	    for (int i = 0; i < 10000; i++)
	    {
	        valorDado = r.nextInt(10000)+1;
	              
	              listaNumeros.add(valorDado);
	        }
	    
	
	   
	  return listaNumeros;
	    
	}
    
	
	// Java program for implementation of Bubble Sort
	/*
	 *  This code is contributed by Rajat Mishra
     */
	public double burbuja( int arreglo[] )
	{
		int temp=0;
		
	    LocalDateTime locaDate = LocalDateTime.now();
	    double seconds = locaDate.getSecond(); 
	    double nanosegundo = locaDate.getNano();
		
		for( int j = 1 ; j < arreglo.length ; j++)
		{
			for( int i = 0 ; i<arreglo.length-1 ; i++)
			{
				if ( arreglo[ i ] > arreglo[i+1] )
				{
				temp = arreglo[ i ];
				arreglo[i] = arreglo[i + 1];
				arreglo[i+1] = temp;
			
				}
			}
		}
	    LocalDateTime locaDate2 = LocalDateTime.now();
	    double seconds2 = locaDate2.getSecond();
	    double nanosegundo2 = locaDate2.getNano();
	       
	    return nanosegundo2-nanosegundo;
	}
	
	
	//shakeshort
	//This code is contributed by leonlipe
	public double shakerSort( int x[ ] )
	{
	    LocalDateTime locaDate = LocalDateTime.now();
	    double seconds = locaDate.getSecond(); 
	    double nanosegundo = locaDate.getNano();
		int aux, primero = 1, ultimo = x.length - 1, dir = x.length - 1;
		while ( ultimo >= primero )
		{
			for( int i = ultimo ; i >= primero ; i--)
			{
				if ( x [i - 1] > x[ i ] )
				{
					aux = x[i - 1];
					x[i - 1] = x[ i ];
					x[ i ] = aux;
					dir = i;
				}
				}
			primero = dir + 1;
			for( int i = primero ; i <= ultimo; i++ )
			{
				if ( x [i - 1] > x[ i ] )
				{
					aux = x[i - 1];
					x[i - 1] = x[ i ];
					x[ i ] = aux;
					dir = i;
				}
			}
			ultimo = dir - 1;
		}
	    LocalDateTime locaDate2 = LocalDateTime.now();
	    double seconds2 = locaDate2.getSecond();
	    double nanosegundo2 = locaDate2.getNano();
	       
	    return nanosegundo2-nanosegundo;
	}
	
	/*Seleccion
	 * 
	 * Extraido de presentaciones de clases
	*/
	public double seleccion (int arreglo[] )
	{
		
		   LocalDateTime locaDate = LocalDateTime.now();
		   double seconds = locaDate.getSecond(); 
		   double nanosegundo = locaDate.getNano();
		
		int i, j, k, menor;
		i = 0;
		while( i < arreglo.length - 1)
		{
			menor = arreglo [i];
			k = i;
			for( j = i+1; j < arreglo.length; j++)
			{
		
				if (arreglo [j] < menor )
				{
			
				menor = arreglo [j];
				k = j;
			
				}
		
			}
			arreglo [k] = arreglo[i];
			arreglo [i] = menor;
			i++;
		}
		
		  LocalDateTime locaDate2 = LocalDateTime.now();
		  double seconds2 = locaDate2.getSecond();
		  double nanosegundo2 = locaDate2.getNano();
		       
		    return nanosegundo2-nanosegundo;
	}
	
	
	/*insercion
	 * 
	 * Extraido de presentaciones de clases
	*/

	public double insercion( int arreglo[] )
	{
		
		LocalDateTime locaDate = LocalDateTime.now();
		double seconds = locaDate.getSecond(); 
		double nanosegundo = locaDate.getNano();
		
		int i, llave;
		for ( int j = 1 ; j < arreglo.length ; j++ )
		{
	
			llave = arreglo[ j ];
			i = j - 1;
			while( i >= 0 && arreglo[ i ] > llave )
			{
		
				arreglo[i + 1] = arreglo[ i ];
				i--;
		
			}
			arreglo[i + 1] = llave;
	
		}
		
		 LocalDateTime locaDate2 = LocalDateTime.now();
		 double seconds2 = locaDate2.getSecond();
		 double nanosegundo2 = locaDate2.getNano();
		       
		 return nanosegundo2-nanosegundo;

	}
	
	/*shellSort
	 * This code is contributed by Rajat Mishra 
	*/
	
	public double shellSort(int a[])
	{
		
		LocalDateTime locaDate = LocalDateTime.now();
		double seconds = locaDate.getSecond(); 
		double nanosegundo = locaDate.getNano();
		   
		for (int incr = a.length/2; incr>0; incr/= 2 )
		{
	
			for (int i = incr ; i < a.length ; i++ )
			{
		
				int j = i - incr;
				while (j >= 0)
				{
					if (a[j] > a[j + incr])
					{
				
						int T = a[ j ];
						a[ j ] = a[j+incr];
						a[j+incr] = T;
						j -= incr;
				
					}
					else
					{
				
						j = -1;
					
					}
				}
			}
	
		}
		
		 LocalDateTime locaDate2 = LocalDateTime.now();
		 double seconds2 = locaDate2.getSecond();
		 double nanosegundo2 = locaDate2.getNano();
		       
		 return nanosegundo2-nanosegundo;
	}
	
	
	/*insertionSortRecursive
	 * 
	 * Extraido de:
	 * https://www.geeksforgeeks.org/recursive-insertion-sort/
	*/
	
	public static void insertionSortRecursive(int arr[], int n)
	    {
	        // Base case
	        if (n <= 1)
	            return;
	      
	        // Sort first n-1 elements
	        insertionSortRecursive( arr, n-1 );
	      
	        // Insert last element at its correct position
	        // in sorted array.
	        int last = arr[n-1];
	        int j = n-2;
	      
	        /* Move elements of arr[0..i-1], that are
	          greater than key, to one position ahead
	          of their current position */
	        while (j >= 0 && arr[j] > last)
	        {
	            arr[j+1] = arr[j];
	            j--;
	        }
	        arr[j+1] = last;
	    }

	/*
	
	static double bucketSort(float arr[], int n)
    {
		
		LocalDateTime locaDate = LocalDateTime.now();
		double seconds = locaDate.getSecond(); 
		double nanosegundo = locaDate.getNano();
		
        if (n <= 0)
            return 0.0;
  
        // 1) Create n empty buckets
        @SuppressWarnings("unchecked")
        Vector<Float>[] buckets = new Vector[n];
  
        for (int i = 0; i < n; i++) {
            buckets[i] = new Vector<Float>();
        }
  
        // 2) Put array elements in different buckets
        for (int i = 0; i < n; i++) {
            float idx = arr[i] * n;
            buckets[(int)idx].add(arr[i]);
        }
  
        // 3) Sort individual buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }
  
        // 4) Concatenate all buckets into arr[]
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
        
        LocalDateTime locaDate2 = LocalDateTime.now();
		 double seconds2 = locaDate2.getSecond();
		 double nanosegundo2 = locaDate2.getNano();
		       
		 return nanosegundo2-nanosegundo;
    }
    
    */


	
	/*Mergesort
	 * 
	 * This code is contributed by Rajat Mishra
	 * Extraido de: https://www.geeksforgeeks.org/merge-sort/?ref=lbp
	 * */
	
	 void merge(int arr[], int l, int m, int r)
	    {
	        // Find sizes of two subarrays to be merged
	        int n1 = m - l + 1;
	        int n2 = r - m;
	  
	        /* Create temp arrays */
	        int L[] = new int[n1];
	        int R[] = new int[n2];
	  
	        /*Copy data to temp arrays*/
	        for (int i = 0; i < n1; ++i)
	            L[i] = arr[l + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = arr[m + 1 + j];
	  
	        /* Merge the temp arrays */
	  
	        // Initial indexes of first and second subarrays
	        int i = 0, j = 0;
	  
	        // Initial index of merged subarray array
	        int k = l;
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                arr[k] = L[i];
	                i++;
	            }
	            else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	  
	        /* Copy remaining elements of L[] if any */
	        while (i < n1) {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }
	  
	        /* Copy remaining elements of R[] if any */
	        while (j < n2) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }
	  
	    // Main function that sorts arr[l..r] using
	    // merge()
	    void sort(int arr[], int l, int r)
	    {
	        if (l < r) {
	            // Find the middle point
	            int m =l+ (r-l)/2;
	  
	            // Sort first and second halves
	            sort(arr, l, m);
	            sort(arr, m + 1, r);
	  
	            // Merge the sorted halves
	            merge(arr, l, m, r);
	        }
	    }
	  

	    
	 // A utility function to swap two elements
	    static void swap(int[] arr, int i, int j)
	    {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	      
	    /* This function takes last element as pivot, places
	       the pivot element at its correct position in sorted
	       array, and places all smaller (smaller than pivot)
	       to left of pivot and all greater elements to right
	       of pivot */
	    static int partition(int[] arr, int low, int high)
	    {
	          
	        // pivot
	        int pivot = arr[high]; 
	          
	        // Index of smaller element and
	        // indicates the right position
	        // of pivot found so far
	        int i = (low - 1); 
	      
	        for(int j = low; j <= high - 1; j++)
	        {
	              
	            // If current element is smaller 
	            // than the pivot
	            if (arr[j] < pivot) 
	            {
	                  
	                // Increment index of 
	                // smaller element
	                i++; 
	                swap(arr, i, j);
	            }
	        }
	        swap(arr, i + 1, high);
	        return (i + 1);
	    }
	      
	    
	    /*
	     * quickSort
	     * 
	     * This code is contributed by Ayush Choudhary
	     * Extraido de: https://www.geeksforgeeks.org/quick-sort/?ref=lbp
	     * 
	     * */
	    
	    
	    /* The main function that implements QuickSort
	              arr[] --> Array to be sorted,
	              low --> Starting index,
	              high --> Ending index
	     */
	    static void quickSort(int[] arr, int low, int high)
	    {
	        if (low < high) 
	        {
	              
	            // pi is partitioning index, arr[p]
	            // is now at right place 
	            int pi = partition(arr, low, high);
	      
	            // Separately sort elements before
	            // partition and after partition
	            quickSort(arr, low, pi - 1);
	            quickSort(arr, pi + 1, high);
	        }
	    }

	    
	    /*
	     * stoogesort
	     * Code Contributed by Mohit Gupta_OMG
	     * 
	     * 
	     * */
	
	    
	    static void stoogesort(int arr[], int l, int h)
	    {
	        if (l >= h)
	            return;
	  
	        // If first element is smaller
	        // than last, swap them
	        if (arr[l] > arr[h]) {
	            int t = arr[l];
	            arr[l] = arr[h];
	            arr[h] = t;
	        }
	  
	        // If there are more than 2 elements in
	        // the array
	        if (h - l + 1 > 2) {
	            int t = (h - l + 1) / 3;
	  
	            // Recursively sort first 2/3 elements
	            stoogesort(arr, l, h - t);
	  
	            // Recursively sort last 2/3 elements
	            stoogesort(arr, l + t, h);
	  
	            // Recursively sort first 2/3 elements
	            // again to confirm
	            stoogesort(arr, l, h - t);
	        }
	    }

	    /*
	     * HeapSort
	     * 
	     * Extraido de: https://www.geeksforgeeks.org/heap-sort/?ref=lbp
	     * 
	     * */
	    
	    public void sort(int arr[])
	    {
	        int N = arr.length;
	 
	        // Build heap (rearrange array)
	        for (int i = N / 2 - 1; i >= 0; i--)
	            heapify(arr, N, i);
	 
	        // One by one extract an element from heap
	        for (int i = N - 1; i > 0; i--) {
	            // Move current root to end
	            int temp = arr[0];
	            arr[0] = arr[i];
	            arr[i] = temp;
	 
	            // call max heapify on the reduced heap
	            heapify(arr, i, 0);
	        }
	    }
	 
	    // To heapify a subtree rooted with node i which is
	    // an index in arr[]. n is size of heap
	    void heapify(int arr[], int N, int i)
	    {
	        int largest = i; // Initialize largest as root
	        int l = 2 * i + 1; // left = 2*i + 1
	        int r = 2 * i + 2; // right = 2*i + 2
	 
	        // If left child is larger than root
	        if (l < N && arr[l] > arr[largest])
	            largest = l;
	 
	        // If right child is larger than largest so far
	        if (r < N && arr[r] > arr[largest])
	            largest = r;
	 
	        // If largest is not root
	        if (largest != i) {
	            int swap = arr[i];
	            arr[i] = arr[largest];
	            arr[largest] = swap;
	 
	            // Recursively heapify the affected sub-tree
	            heapify(arr, N, largest);
	        }
	    }

	    
	    /* The parameter dir indicates the sorting direction,
	       ASCENDING or DESCENDING; if (a[i] > a[j]) agrees
	       with the direction, then a[i] and a[j] are
	       interchanged. */
	    void compAndSwap(int a[], int i, int j, int dir)
	    {
	        if ( (a[i] > a[j] && dir == 1) ||
	             (a[i] < a[j] && dir == 0))
	        {
	            // Swapping elements
	            int temp = a[i];
	            a[i] = a[j];
	            a[j] = temp;
	        }
	    }
	 
	    /* It recursively sorts a bitonic sequence in ascending
	       order, if dir = 1, and in descending order otherwise
	       (means dir=0). The sequence to be sorted starts at
	       index position low, the parameter cnt is the number
	       of elements to be sorted.*/
	    void bitonicMerge(int a[], int low, int cnt, int dir)
	    {
	        if (cnt>1)
	        {
	            int k = cnt/2;
	            for (int i=low; i<low+k; i++)
	                compAndSwap(a,i, i+k, dir);
	            bitonicMerge(a,low, k, dir);
	            bitonicMerge(a,low+k, k, dir);
	        }
	    }
	 
	    /* This function first produces a bitonic sequence by
	       recursively sorting its two halves in opposite sorting
	       orders, and then  calls bitonicMerge to make them in
	       the same order */
	    void bitonicSort(int a[], int low, int cnt, int dir)
	    {
	        if (cnt>1)
	        {
	            int k = cnt/2;
	 
	            // sort in ascending order since dir here is 1
	            bitonicSort(a, low, k, 1);
	 
	            // sort in descending order since dir here is 0
	            bitonicSort(a,low+k, k, 0);
	 
	            // Will merge whole sequence in ascending order
	            // since dir=1.
	            bitonicMerge(a, low, cnt, dir);
	        }
	    }
	 
	    /*Caller of bitonicSort for sorting the entire array
	      of length N in ASCENDING order */
	    
	    /*
	     * Bitonic sort
	     * 
	     * Extraido de: https://www.geeksforgeeks.org/bitonic-sort/
	     * 
	     * */
	    void sort2(int a[], int N, int up)
	    {
	        bitonicSort(a, 0, N, up);
	    }
	    
	    
	    /*
	     * gnomeSort
	     * 
	     * Code Contributed by Mohit Gupta_OMG
	     * Extraido de: https://www.geeksforgeeks.org/gnome-sort-a-stupid-one/
	     * */
	    
	    static void gnomeSort(int arr[], int n)
	    {
	        int index = 0;
	  
	        while (index < n) {
	            if (index == 0)
	                index++;
	            if (arr[index] >= arr[index - 1])
	                index++;
	            else {
	                int temp = 0;
	                temp = arr[index];
	                arr[index] = arr[index - 1];
	                arr[index - 1] = temp;
	                index--;
	            }
	        }
	        return;
	    }
	    
	    
	    /*
	     * binary insertion sort
	     * 
	     * Code contributed by Mohit Gupta_OMG
	     * Extraido de: https://www.geeksforgeeks.org/binary-insertion-sort/
	     * */
	    
	    
	    public void sort3(int array[])
	    {
	        for (int i = 1; i < array.length; i++) 
	        {
	            int x = array[i];
	  
	            // Find location to insert
	            // using binary search
	            int j = Math.abs(
	                Arrays.binarySearch(array, 0, 
	                                    i, x) + 1);
	  
	            // Shifting array to one
	            // location right
	            System.arraycopy(array, j,
	                             array, j + 1, i - j);
	  
	            // Placing element at its 
	            // correct location
	            array[j] = x;
	        }
	    }


	    /*
	     * strandSort
	     * 
	     * ingydotnet 
	     * Extraido de: https://github.com/acmeism/RosettaCodeData/blob/master/Task/Sorting-algorithms-Strand-sort/Java/sorting-algorithms-strand-sort.java
	     * */
	    
	    
		public static <E extends Comparable<? super E>> 
		LinkedList<E> strandSort(LinkedList<E> list){
			if(list.size() <= 1) return list;

			LinkedList<E> result = new LinkedList<E>();
			while(list.size() > 0){
				LinkedList<E> sorted = new LinkedList<E>();
				sorted.add(list.removeFirst()); //same as remove() or remove(0)
				for(Iterator<E> it = list.iterator(); it.hasNext(); ){
					E elem = it.next();
					if(sorted.peekLast().compareTo(elem) <= 0){
						sorted.addLast(elem); //same as add(elem) or add(0, elem)
						it.remove();
					}
				}
				result = merge(sorted, result);
			}
			return result;
		}

		private static <E extends Comparable<? super E>>
		LinkedList<E> merge(LinkedList<E> left, LinkedList<E> right){
			LinkedList<E> result = new LinkedList<E>();
			while(!left.isEmpty() && !right.isEmpty()){
				//change the direction of this comparison to change the direction of the sort
				if(left.peek().compareTo(right.peek()) <= 0)
					result.add(left.remove());
				else
					result.add(right.remove());
			}
			result.addAll(left);
			result.addAll(right);
			return result;
		}


}
