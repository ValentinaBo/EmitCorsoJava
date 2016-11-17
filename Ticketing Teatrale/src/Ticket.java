
public class Ticket {
	private Spettacolo spettacolo;
	private String nomeSpettatore;
	private float costo;
	private int posto;
	private int data;
	private int numeroSerie;
	private static int nextNumeroSerie = 101;
	
	public Ticket (Spettacolo spettacolo, String nomeSpettatore, float costo, int posto, 
					int data){
		this.spettacolo = spettacolo;
		this.nomeSpettatore = nomeSpettatore;
		this.costo = costo;
		this.posto = posto;
		this.data = data;
		numeroSerie = nextNumeroSerie++;
	}
	
	public Spettacolo getNomeSpettacolo(){
		return spettacolo;
	}

	public int getNumero(){
		return numeroSerie;
	}
	
	public String getNomeSpettatore(){
		return nomeSpettatore;
	}
	
	public float getCosto(){
		return costo;
	}
	
	public int getPosto(){
		return posto;
	}
	
	public int getData(){
		return data;
	}
	
	/*public Ticket findTicket(int num){
		if (num == numeroSerie;){
			return this.Ticket;
		}
		
	}
	*/
}
