package bubblesort;

import java.util.Random;

public class MainBubbleSort {

	public static void main(String[] args) {
		

	}

}


/**
 * Implementazione dell'ordinamento di un vettore usando il metodo BUBBLESORT.
 * 
 * @author lpizz
 *
 */
public class bubblesort {
	public static void main(String[] args) {
		String []nomi;
		
		Random r = new Random();

		int lun = r.nextInt(10) + 1;
		
		int v[] = new int[lun];
		
		for(int ii=0; ii<v.length; ii++){
			v[ii] = r.nextInt(100)+1;
			System.out.print(v[ii] + " ");
		}
		boolean ripeti;
		do {
			ripeti=false;
			for(int ii=0; ii<v.length-1; ii++){
				if(v[ii] > v[1+ii]) { //devo scambiare?
					int tmp = v[ii]; //appoggio per scambio
					v[ii] = v[ii+1];
					v[ii+1] = tmp;
					ripeti=true;
				}
			}
		}while(ripeti);//continuo a ciclare finchè ci sono scambi

		System.out.println("");

		for(int ii=0; ii<v.length; ii++){
			System.out.print(v[ii] + " ");
		}

		nomi = new String[5];
		nomi[2] = "ciao";

		System.out.print("\n"+ nomi.length +" "+ nomi[2].length() );
	}

}
