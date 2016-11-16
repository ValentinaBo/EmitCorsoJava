
public class AziendaMain {

	public static void main(String[] args) {
		
		Dipendente johnny = new Dipendente("Johnny", "Cash", 25, "Milano", "FRIE846HF", 1200);
		Dipendente valentina = new Dipendente("Valentina", "Bottari", 8, "Piacenza", "FWI84FH8", 1500);
		Consulente robert = new Consulente("Robert", "Smith", 15, "Londra", "NF39TH44J");
		
		System.out.println(johnny.getNome()+ " " + johnny.getCognome()+ " " +
				johnny.getDataDiNascita()+ " " + johnny.getLuogoDiNascita()+ " " + 
				johnny.getCodiceFiscale()+ " " + johnny.getStipendioMensile() + " "+
				johnny.getStipendioTotaleRicevuto() + " " + 
				johnny.getTassePagate(valentina.getStipendioTotaleRicevuto()) + " " +
				johnny.getMalattiaRimanente() + " " + johnny.getLogTrack() + " " + 
				johnny.getUserNumber());
		
		System.out.println(valentina.getNome()+ " " + valentina.getCognome()+ " " +
				valentina.getDataDiNascita()+ " " + valentina.getLuogoDiNascita()+ " " + 
				valentina.getCodiceFiscale()+ " " + valentina.getStipendioMensile() + " " +
				valentina.getStipendioTotaleRicevuto() + " " + 
				valentina.getTassePagate(valentina.getStipendioTotaleRicevuto()) + " " +
				valentina.getMalattiaRimanente() + " " + valentina.getLogTrack() + " " + 
				valentina.getUserNumber());
		
		System.out.println(robert.getNome()+ " " + robert.getCognome()+ " " +
				robert.getDataDiNascita()+ " " + robert.getLuogoDiNascita()+ " " + 
				robert.getCodiceFiscale() + " " + robert.getLogTrack() + " " + 
				robert.getUserNumber()); 
		
		valentina.usaMalattia(2);
		valentina.logIn();
		johnny.logIn();
		valentina.logOut();
		
		System.out.println(johnny.getNome()+ " " + johnny.getCognome()+ " " +
				johnny.getDataDiNascita()+ " " + johnny.getLuogoDiNascita()+ " " + 
				johnny.getCodiceFiscale()+ " " + johnny.getStipendioMensile() + " "+
				johnny.getStipendioTotaleRicevuto() + " " + 
				johnny.getTassePagate(valentina.getStipendioTotaleRicevuto()) + " " +
				johnny.getMalattiaRimanente() + " " + johnny.getLogTrack() + " " + 
				johnny.getUserNumber());
		
		System.out.println(valentina.getNome()+ " " + valentina.getCognome()+ " " +
				valentina.getDataDiNascita()+ " " + valentina.getLuogoDiNascita()+ " " + 
				valentina.getCodiceFiscale()+ " " + valentina.getStipendioMensile() + " " +
				valentina.getStipendioTotaleRicevuto() + " " + 
				valentina.getTassePagate(valentina.getStipendioTotaleRicevuto()) + " " +
				valentina.getMalattiaRimanente() + " " + valentina.getLogTrack() + " " + 
				valentina.getUserNumber());
		
		
		System.out.println(robert.getNome()+ " " + robert.getCognome()+ " " +
				robert.getDataDiNascita()+ " " + robert.getLuogoDiNascita()+ " " + 
				robert.getCodiceFiscale() + " " + robert.getLogTrack() + " " + 
				robert.getUserNumber()); 
		
		
	}

}
