
public class Collaboratore {

	private String nome;
	private String cognome;
	private int dataDiNascita;
	private String luogoDiNascita;
	private String codiceFiscale;
	private int userNumber;
	private static int nextUserNumber = 1000;
	private int logTrack = 0;
	
	public Collaboratore(String nome, String cognome, int dataDiNascita, String luogoDiNascita,
			String codiceFiscale){
		
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.luogoDiNascita = luogoDiNascita;
		this.codiceFiscale = codiceFiscale;
		userNumber = nextUserNumber;
		nextUserNumber++;
	}
		
	//comincia e finisce un progetto, 
	//conta su quanti progetti ha lavorato
	
	
	public int getUserNumber(){
		return userNumber;
	}

	public boolean logIn(){
		logTrack++;
		return true;
	}
	
	public boolean logOut(){
		return false;
	}

	public int getLogTrack(){
		return logTrack;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getCognome(){
		return cognome;
	}
	
	public int getDataDiNascita(){
		return dataDiNascita;
	}
	
	public String getLuogoDiNascita(){
		return luogoDiNascita;
	}
	
	public String getCodiceFiscale(){
		return codiceFiscale;
	}
	
}
