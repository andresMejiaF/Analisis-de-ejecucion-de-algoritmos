package Proyecto;

import java.time.LocalDateTime;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Metodos meto=new Metodos();
	       
		  int arr[]=meto.lista();
		  LinkedList<Integer> listaNumeros=meto.lista2();
		  LocalDateTime locaDate , locaDate2;
		  double nanosegundo, nanosegundo2, tiempo;
		  
		 
		 Integer opcion=0;
		 
		 do {
	
			 opcion= Integer.parseInt(JOptionPane.showInputDialog("Menu de opciones : \n"
			 		+ "1) Metodo Burbuja: " + "\n"+
					 "2) Burbuja doble direccion:" +"\n"
			 		+"3) Seleccion: " + "\n"+
					 "4) insercion:" + "\n"
				   + "5) Recursive insertion Sort: " + "\n"+
					 "6) ShellSort:" +"\n"
			 		+"7) BucketSort: " + "\n"+
					 "8) MergeSort:"  + "\n" +
					 "9) QuickSort:" +"\n"
				 	+"10) StoogeSort: " + "\n"+
					 "11) HeapSort:" + "\n"
				    + "12) Bitonic Sort: " + "\n"+
					"13) Gnome Sort:" +"\n"
				 	+"14) Binary insertion Sort: " + "\n"+
					"15) Strand Sort:" + "\n"+
				 	"0) SALIR"
			 		));

		        switch (opcion){
		            case 1:

		            	System.out.println("burbuja:  "+meto.burbuja(arr));
		                    break;

		            case 2:
		            	 System.out.println("shakerSort:  "+meto.shakerSort(arr));
		                    break;

		            case 3:
		            	System.out.println("seleccion:  "+meto.seleccion(arr));
		                    break;


		            case 4:
		            	 System.out.println("insercion:  "+meto.insercion(arr));
		                    break;


		             case 5:
		            	 
		            	 locaDate = LocalDateTime.now();
		            	 nanosegundo = locaDate.getNano();
		            	 
		            	meto.insertionSortRecursive(arr, arr.length);
		            	
		            	  locaDate2 = LocalDateTime.now();
		        		  nanosegundo2 = locaDate2.getNano();
		        		  tiempo = nanosegundo2-nanosegundo;
		        		 System.out.println("insertionSortRecursive:  "+ tiempo);
		                    break;
		                    
		             case 6:

		            	 System.out.println("shellSort:  "+meto.shellSort(arr));
		                    break;
		             case 7:
		            	 
		            //stem.out.println("bucketSort:  "+meto.bucketSort(arr2, (arr2.length)));
		            	 JOptionPane.showMessageDialog(null, "Este metodo suelta desbordamiento sin razon, probablemente por lo del vector"); 
		                    break;
		             case 8:
		            	 
		            	 locaDate = LocalDateTime.now();
		            	 nanosegundo = locaDate.getNano();
			            	 
			            	meto.sort(arr, 0, arr.length-1);
			            	
			           	  locaDate2 = LocalDateTime.now();
		        		  nanosegundo2 = locaDate2.getNano();
		        		  tiempo = nanosegundo2-nanosegundo;
			        		 System.out.println("mergeSort:  "+ tiempo);

		                    break;
		             case 9:
		             
		            	 locaDate = LocalDateTime.now();
		            	 nanosegundo = locaDate.getNano();
		            	 
		            	meto.quickSort(arr, 0, arr.length -1);
		            	
		           	  locaDate2 = LocalDateTime.now();
	        		  nanosegundo2 = locaDate2.getNano();
	        		  tiempo = nanosegundo2-nanosegundo;
		        		 System.out.println("quickSort:  "+ tiempo);
		             
		                    break;
		             case 10:
		            	 
		        		 locaDate = LocalDateTime.now();
		            	 nanosegundo = locaDate.getNano();
			            	 
			            	meto.stoogesort(arr, 0, arr.length-1);
			            	
			            	  locaDate2 = LocalDateTime.now();
			        		  nanosegundo2 = locaDate2.getNano();
			        		  tiempo = nanosegundo2-nanosegundo;
			        		 System.out.println("stoogesort:  "+ tiempo);

		                    break;
		             case 11:

		            	 locaDate = LocalDateTime.now();
		            	 nanosegundo = locaDate.getNano();
			            	 
			            	meto.sort(arr);
			            	
			            	  locaDate2 = LocalDateTime.now();
			        		  nanosegundo2 = locaDate2.getNano();
			        		  tiempo = nanosegundo2-nanosegundo;
			        		 System.out.println("HeapSort:  "+ tiempo);
		                    break;
		             case 12:

		            	 locaDate = LocalDateTime.now();
		            	 nanosegundo = locaDate.getNano();
			            	 
			            	meto.sort2(arr, arr.length, 1);
			            	
			            	  locaDate2 = LocalDateTime.now();
			        		  nanosegundo2 = locaDate2.getNano();
			        		  tiempo = nanosegundo2-nanosegundo;
			        		 System.out.println("BitonicSort:  "+ tiempo);
		                    break;
		             case 13:

		            	 locaDate = LocalDateTime.now();
		            	 nanosegundo = locaDate.getNano();
			            	 
			            	meto.gnomeSort(arr, arr.length);
			            	
			            	  locaDate2 = LocalDateTime.now();
			        		  nanosegundo2 = locaDate2.getNano();
			        		  tiempo = nanosegundo2-nanosegundo;
			        		 System.out.println("gnomeSort:  "+ tiempo);
		                    break;
		             case 14:
		            	 locaDate = LocalDateTime.now();
		            	 nanosegundo = locaDate.getNano();
			            	 
			            	meto.sort3(arr);
			            	
			            	  locaDate2 = LocalDateTime.now();
			        		  nanosegundo2 = locaDate2.getNano();
			        		  tiempo = nanosegundo2-nanosegundo;
			        		 System.out.println("binary insertion sort:  "+ tiempo);

		                    break;
		             case 15:
		            	 locaDate = LocalDateTime.now();
		            	 nanosegundo = locaDate.getNano();
			            	 
			            	meto.strandSort(listaNumeros);
			            	
			            	  locaDate2 = LocalDateTime.now();
			        		  nanosegundo2 = locaDate2.getNano();
			        		  tiempo = nanosegundo2-nanosegundo;
			        		 System.out.println("strandSort:  "+ tiempo);

		                    break;
		            case 0:
		            		
		            	JOptionPane.showMessageDialog(null, "Gracias!");
		                    break;        

		        }

		        } while (opcion!=0);    
		 
	}

}
