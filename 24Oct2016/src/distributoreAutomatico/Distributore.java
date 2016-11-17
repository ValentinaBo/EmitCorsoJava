package distributoreAutomatico;

import java.util.Scanner;

public class Distributore {

	public static void creaDistributore(int nBottiglie) {
		Scanner in = new Scanner(System.in);
		
		//int nBottiglie = 5;
		
		//inizializza bottiglie e stampa info
		Bottiglia[] distributore = new Bottiglia[nBottiglie];
		for (int i = 0; i < nBottiglie; i++){
			if (i <= 2){
				distributore[i] = new Bottiglia("Acqua", 10, 10);
			} else if (i == 3){
				distributore[i] = new Bottiglia("Coca Cola", 10, 10);
			} else {
				distributore[i] = new Bottiglia("Fanta", 10, 10);
			}
			
			System.out.println
				("Bevanda " + (i + 1) + ": " + distributore[i].getBevanda() + 
					". Capienza: " + distributore[i].getCapienza() + 
					". Livello: " + distributore[i].getLivello());
		}
	
		do {
			//Fa terminare il loop o selezionare una bottiglia
			System.out.println("Quale bevanda vuoi? Inserisci il numero "
					+ "corrispondente, o premi 0 per uscire.");
			int scelta = in.nextInt();
			in.nextLine();
			
			//termina loop
			if (scelta == 0){
				break;
			
			//torna all'inizio del loop se il numero è sbagliato
			} else if (scelta < 0 || scelta > nBottiglie){
				System.out.println("Numero errato. Riprova!");
				continue;
			}
			
			//Seleziona una delle bottiglie e la mette in 
			//una variabile 
			Bottiglia bevandaScelta = distributore[scelta -1];
			
			//Chiede azione
			System.out.println("Hai scelto una bottiglia di " + 
				bevandaScelta.getBevanda() + ". \nQuesta bottiglia "
				+ "contiene " + bevandaScelta.getLivello()
				+ " e la sua capienza è " + bevandaScelta.getCapienza()
				+ ". \nCosa vuoi fare? Bere = B, Riempire = R");
			String azioneScelta = in.nextLine();

			if (azioneScelta.equals("B") == true){
				//Se la bottiglia è vuota fa ripartire il loop
				if (bevandaScelta.getLivello() == 0){
					System.out.println("Questa bottiglia è vuota. Riprova!");
					continue;
				} else { 
				//Else chiede quantità e sottrae dal livello
					System.out.println("Da 1 a " + bevandaScelta.getLivello() +
						" Quanto vuoi bere?");
					int quantita = in.nextInt();
					in.nextLine();
					bevandaScelta.bevi(quantita);
				}
				
			} else if (azioneScelta.equals("R") == true){
				
				//Se la bottiglia è già piena fa ripartire il loop
				if (bevandaScelta.getLivello() == bevandaScelta.getCapienza()){
					System.out.println("Questa bottiglia è già piena. Riprova!");
					continue;
				} else {
				//else chiede quantità e la riempie
					System.out.println("Da 1 a " + 
					(bevandaScelta.getCapienza() - bevandaScelta.getLivello()) + " Di quanto la vuoi riempire?");
					int quantita = in.nextInt();
					in.nextLine();
					bevandaScelta.riempi(quantita);
				}
			}
			
			//Mostra lo stato aggiornato delle bottiglie
			for (int i = 0; i < 5; i++){
				System.out.println("Bevanda " + (i + 1) + ": " + 
						distributore[i].getBevanda() + 
						". Capienza: " + distributore[i].getCapienza() + 
						". Livello: " + distributore[i].getLivello());
			}
			
			
			
		} while (true);
	
	//mostra lo stato finale delle bottiglie
	for (int i = 0; i < 5; i++){
		System.out.println("Bevanda " + (i + 1) + ": " + 
			distributore[i].getBevanda() + 
			". Capienza: " + distributore[i].getCapienza() + 
			". Livello: " + distributore[i].getLivello());
	}
	in.close();
	return;
	}
}
