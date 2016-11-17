
public class Botteghino extends ImpiegatoTeatro{
	int stipendio = 1200;
	
	public Botteghino(String nomeImpiegato, String cognomeImpiegato){
		super(nomeImpiegato, cognomeImpiegato);
	}
	
	public int getStipendio(){
		return stipendio;
	}
	
	public boolean sellTicket(Spettacolo spettacolo){
		if (spettacolo.getSoldTickets() >= 5){
			return false;
		} else {
			return true;
		} 
	}
	
	
}
