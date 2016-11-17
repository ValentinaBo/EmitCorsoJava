package distributoreAutomatico;

/* 
Stato: quantità e contenuto
Azioni: bevi e riempi
Utente inserisce int per scegliere una di 5 bottiglie su cui
effettuare un azione (stampa azioni)
3 acqua, 1 coca, 1 fanta
*/

public class Bottiglia {
	private String bevanda;
	private int capienza;
	private int livello;
	
	public Bottiglia(String bevanda, int capienza, int livello){
		this.bevanda = bevanda;
		this.capienza = capienza;
		this.livello = livello;
	}
	
	public String getBevanda(){
		return bevanda;
	}
	
	public int getCapienza(){
		return capienza;
	}
	
	public int getLivello(){
		return livello;
	}
	
	public void bevi(int quantita){
		if (quantita <= livello){
			livello -= quantita;
		} else {
			System.out.println("Non ce n'è abbastanza, riprova! "
					+ "\nQuesta bottiglia contiene " + livello + ".");
		}
	}
	
	public void riempi(int quantita){
		if (quantita + livello <= capienza){
			livello += quantita;
		} else {
			System.out.println("La bottiglia non è abbastanza grande,"
					+ " riprova! \nQuesta bottiglia contiene " + livello
					+ " e la sua capienza è " + capienza + ".");
		}
	}
}
