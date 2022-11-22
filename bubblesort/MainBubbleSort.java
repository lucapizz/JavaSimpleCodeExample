package bubblesort;

import java.util.Random;

public class MainBubbleSort {

	public static void main(String[] args) {
		bubblesort();
	}

	/**
	 * Implementazione dell'ordinamento di un vettore usando il metodo
	 * BUBBLESORT che consiste nel confrontare tutte le coppie di dati vicini
	 * e scambiarli se non sono nell'ordine richiesto ripetendo il ciclo sino
	 * a quando non viene più eseguito alcuno scambio.
	 * 
	 * @author lpizz
	 */
	public static void bubblesort() {
		int v[] = new int[7]; //preparo un vettore di lunghezza fissa
		Random r = new Random();
		
		System.out.print("*** Program start\n\nDati da ordinare: ");
		for(int ii=0; ii<v.length; ii++){ //riempio il vettore
			v[ii] = r.nextInt(100)+1; //genero numeri casuali tra 1 e 100
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
		}while(ripeti);//ripeto il ciclo fino a quando eseguo scambi

		System.out.print("\n Dati riordinati: ");

		for(int ii=0; ii<v.length; ii++){
			System.out.print(v[ii] + " ");
		}
		System.out.print("\n\n*** Program end\n");
	}

}

/*
 * Qui sotto ho riportato i messaggi generati da un'esecuzione del codice.
 * Collaudato con successo.


*** Program start

Dati da ordinare: 43 48 43 33 99 65 10 
 Dati riordinati: 10 33 43 43 48 65 99 

*** Program end


 */
