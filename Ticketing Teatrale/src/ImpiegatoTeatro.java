
public class ImpiegatoTeatro {

	private String nomeImpiegato;
	private String cognomeImpiegato;
	private int stipendio = 1000;
	
	public ImpiegatoTeatro(String nomeImpiegato, String cognomeImpiegato){
		this.nomeImpiegato = nomeImpiegato;
		this.cognomeImpiegato = cognomeImpiegato;
	}
	
	public String getNomeImpiegato(){
		return nomeImpiegato;
	}
	
	public String getCognomeImpiegato(){
		return cognomeImpiegato;
	}
	
	public int getStipendio(){
		return stipendio;
	}
}
