import java.util.Scanner;

public class TeatroMain {

	public static void main(String[] args) {

		/* Botteghino vende ticket (<=5 per ogni spettacolo)
		 * Il giorno dello spettacolo, se ci sono abbastanza spettatori, 
		 * 		la mascherina li fa entrare e fa cominciare lo spettacolo
		 */
		Scanner in = new Scanner(System.in);
		
		//Inizializza dipendenti
		Botteghino botteghino = new Botteghino("Arlecchino", "Rossi");
		Mascherina mascherina = new Mascherina("Pulcinella", "Bianchi");
				
		//Inizializza spettacoli
		Spettacolo carmen = new Spettacolo("Carmen", "Compagnia1", 23);
		Spettacolo donGiovanni = new Spettacolo("Don Giovanni", "Compagnia2", 15);
		
		//Inserisce spettacoli in array
		Spettacolo[] spettacoli= new Spettacolo[2];
		spettacoli[0] = carmen;
		spettacoli[1] = donGiovanni;


		
do {
	System.out.println("Cosa vorresti fare? \n1 = Acquista biglietti \n2 = Entra in teatro"
						+ "\nO premi 0 per uscire.");
	
	int input = in.nextInt();
	
	if (input == 0){
		break;
		
	} else if (input == 1){
	
	//ACQUISTO BIGLIETTO	
	
	do{	
		//utente sceglie spettacolo
		System.out.println("Cosa vuoi vedere stasera? ");
		for (int i = 0; i < 2; i++){
			System.out.println((i + 1) + " = " + spettacoli[i].getNomeSpettacolo());
		}
		System.out.println("O premi 0 per uscire.");
		
		int numSpettacolo = in.nextInt();
		in.nextLine();
		
		//Se 0 esce
		if (numSpettacolo == 0) {
			break;
		
		//Else vende biglietti
		} else {
			Spettacolo spettScelto = spettacoli[numSpettacolo - 1];
			if (botteghino.sellTicket(spettScelto) == false){
				System.out.println("Spiacenti, lo spettacolo è esaurito.\n");
			} else {
				System.out.println("Quanti biglietti? Ne rimangono " + 
					(5 - spettScelto.getSoldTickets()) + ".");
				int bigliettiComprati = in.nextInt();
				in.nextLine();
				if (bigliettiComprati > 5 - spettScelto.getSoldTickets()){
					System.out.println("Spiacenti, non ci sono abbastanza biglietti./n");
				} else {
					for (int i = 0; i < bigliettiComprati; i++){
						
						System.out.println("Qual'è il nome dello spettatore numero " + (i+1) + "?");
						String nome = in.nextLine();
						int currentPosto = spettScelto.getPosto();
						int data = spettScelto.getData();
						
						Ticket thisTicket = spettScelto.createTicket(spettScelto, nome, 10, currentPosto, data);
						
						System.out.println("Il suo biglietto è il numero " + thisTicket.getNumero() 
							+ " e il suo posto è il numero " + thisTicket.getPosto() + "\n");
					}
				}
			}
		}
	
		} while (true);
	
	} else if (input == 2){
	
//ENTRATA A TEATRO
	
			
	// maschera decide se dare lo spettacolo o no
	System.out.println();
	System.out.println("Benvenuti a teatro! Qual è il numero del suo biglietto?");
	int ticketSpettatore = in.nextInt();
	in.nextLine();
	
	//CERCA PER BIGLIETTO
	boolean esiste = false;
	
	for (int i = 0; i < spettacoli.length; i++){
		for (int j = 0; j < spettacoli[i].getSoldTickets(); j++){
			int currentTicket = spettacoli[i].getTicket(j).getNumero();
			
			if (currentTicket == ticketSpettatore){
				if (mascherina.canEnter(spettacoli[i])){
					
					System.out.println("Entrate, lo spettacolo " + spettacoli[i].getNomeSpettacolo() +
							" sta per cominciare!\n");
					esiste = true;
					break;
					
				} else {
					
					System.out.println("Spiacenti, lo spettacolo " + spettacoli[i].getNomeSpettacolo() +
							" è stato cancellato per mancanza"
							+ " di spettatori.\n");
					esiste = true;
					break;
				}
			}
		}
	}	
	
	if (esiste == false) {
		System.out.println("Spiacenti, questo biglietto non esiste\n");
	}
			
		
	}

} while (true);

	in.close();
	
	}
}