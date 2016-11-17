
public class Spettacolo {
	
	private String nomeSpettacolo;
	private Ticket[] ticketArray;
	private int soldTickets = 0;
	private int posto = 1;
	private int data;
	private String compagniaTeatrale;
	
	public Spettacolo (String nomeSpettacolo, String compagniaTeatrale, int data){
		this.nomeSpettacolo = nomeSpettacolo;
		this.compagniaTeatrale = compagniaTeatrale;
		this.data = data;
		ticketArray = new Ticket[5];
	}
	
	public String getNomeSpettacolo(){
		return nomeSpettacolo;
	}
	
	public Ticket[] getTicketArray(){
		return ticketArray;
	}
	
	public Ticket getTicket(int n){
		return ticketArray[n];
	}
	
	public int getSoldTickets(){
		return soldTickets;
	}
	
	public int getPosto(){
		return posto;
	}
	
	public int getData(){
		return data;
	}
	
	public String getCompagniaTeatrale(){
		return compagniaTeatrale;
	}
	
	public Ticket createTicket(Spettacolo nomeSpettacolo, String nomeSpettatore, 
			float costo, int posto, int data){
		
		Ticket newTicket = new Ticket(nomeSpettacolo, nomeSpettatore, costo, posto, data);
		
		ticketArray[soldTickets] = newTicket;
		soldTickets++;
		this.posto++;
		
		return newTicket;
	}
	
}
