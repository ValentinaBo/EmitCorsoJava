
public class Mascherina extends ImpiegatoTeatro {
	 int stipendio = 900;
	 
	 public Mascherina(String nomeImpiegato, String cognomeImpiegato){
		 super(nomeImpiegato, cognomeImpiegato);
	 }
	 
	 public int getStipendio(){
		 return stipendio;
	 }
	 
	 public boolean canEnter(Spettacolo spettacolo){
		 if (spettacolo.getSoldTickets() >= 3){
			 return true;
		 } else {
			 return false;
		 }
	 }
}
