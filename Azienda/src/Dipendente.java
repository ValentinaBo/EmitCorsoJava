
public class Dipendente extends Collaboratore {
	
	private int stipendioMensile;
	private int stipendioTotaleRicevuto = 0;
	private int malattiaTotale = 180;
	private int malattiaRimanente = 180;
	
	public Dipendente (String nome, String cognome, int dataDiNascita, String luogoDiNascita,
			String codiceFiscale, int stipendioMensile){
		super(nome, cognome, dataDiNascita, luogoDiNascita, codiceFiscale);
		this.stipendioMensile = stipendioMensile;
	}
	
	//controllo accessi altri
	//vacanze
	
	public void usaMalattia(int giorni){
		malattiaRimanente -= giorni;
	}
	
	public int getMalattiaRimanente(){
		return malattiaRimanente;
	}
	
	public int getMalattiaTotale(){
		return malattiaTotale;
	}
	
	public int getTassePagate(int n){
		return n * 30 / 100;
	}
	
	public void riceviStipendio(){
		//TO DO ogni mese
		stipendioTotaleRicevuto += stipendioMensile;
	}
	
	public int getStipendioTotaleRicevuto(){
		return stipendioTotaleRicevuto;
	}
	
	public int getStipendioMensile(){
		return stipendioMensile;
	} 
	

	

	
	
}
