import java.util.Scanner;

public class Lunghezza {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Dammi delle parole o lascia vuoto e "
				+ "premi Invio per vedere il risultato.");
		int total = 0;
		
		do {
			String word = in.nextLine();
			int length = word.length();
			int firstLetter = 0;
			boolean noChar = false;
			
			/* 
			Scopre se ci sono dei caratteri nella stringa e trova 
			il primo, e scopre se la stringa è fatta di spazi.
			*/
			for (int i = 0; i < length; i++) {
				if (word.charAt(i) != int && word.charAt(i) != ' ') {
					firstLetter = i;
					break;
				} else if (i == length - 1) {
					noChar = true;
				}
			}
			
			if (length == 0) {
				break; //se non viene immesso niente e l'utente preme
				//invio il programma stampa il totale.
			} else if (noChar == true) {
				continue; //se l'utente immette una stringa fatta di
				//spazi il ciclo la salta e richiede un input.
			} else {		
				String upperWord = word.toUpperCase();
				char initial = word.charAt(firstLetter);
				char upperInitial = upperWord.charAt(firstLetter);
			
				if (initial == upperInitial) {
					total += word.length() - firstLetter;
				} //Scopre se il primo carattere è maiuscolo e se lo
				//è aggiunge il numero di lettere al totale.
			}
		} while (true);
	in.close();	
	System.out.println("Il totale delle lettere contenute "
			+ "nelle parole con la maiuscola è: " + total);
	}
}
	
