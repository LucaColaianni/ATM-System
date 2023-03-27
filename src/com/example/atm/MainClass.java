package com.example.atm;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
	    ATM myATM = new ATM();
	    Scanner in = new Scanner(System.in);

		int atmPin = 123;
		
		// chiedo il pin
		System.out.println("Benvenuto!\nInserisci il PIN: ");
		int pin = in.nextInt();
		// se il pin è giusto faccio cose
		int scelta;
		if(atmPin == pin) {
			System.out.println("Accesso effettuato.\nDigita l'operazione che vuoi effettuare.");
			System.out.println("1. Visualizza saldo\n2. Prelievo\n3. Versamento\n4. Esci\nEffettua la tua scelta.");
			scelta = in.nextInt(); // VARIABILE SENTINELLA
			while(scelta != 4) {
				switch(scelta) {
					case 1:
						// visualizza
						System.out.println("Il saldo attuale è di: " + myATM.getBalance() + "€");

					break;
					case 2:
						myATM.prelievo();
						System.out.println("Il salsdo attuale è di: "+ myATM.getBalance());
					break;
					case 3:
						myATM.versamento();
						System.out.println("Il saldo attuale è di: "+ myATM.getBalance());

					break;
				}
				scelta = in.nextInt(); // VARIABILE SENTINELLA

			}
			System.out.println("Ritirare la carta entro 30 secondi");
			
			
		} else {
			System.out.println("Accesso rifiutato.");
			System.exit(0);
			
		}
		
	}

}

/*while(true) {
				System.out.println("1. Visualizza saldo\n2. Prelievo\n3. Versamento\n4. Esci\nEffettua la tua scelta.");
			
				// ch = scelta isnerita dalla persona
				int ch = in.nextInt();
				if(ch == 1) {
					// visualizza
					System.out.println("Il saldo attuale è di: " + myATM.getBalance() + "€");

				}else if( ch == 2) {
					//preleva
					System.out.println("Inserisci la quantità da prelevare: ");
				
					
				}else if( ch == 3) {
					//versa
					System.out.println("Inserisci la quantità da versare: ");
					double veramento = in.nextDouble();
					
				}else if( ch == 4) {
					System.out.println("Prendi la carta entro 30 secondi!");
					System.exit(0);
				}
			}*/
