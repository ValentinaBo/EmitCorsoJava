import java.util.ArrayList;
import java.util.Scanner;

public class ControlloLampadina {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int grandezzaScatola = 100;
		
		ArrayList <Lampadina> scatola = new ArrayList<Lampadina>();  //Lampadina[grandezzaScatola];
	
		int n;
		
		
		//Quante lampadine?
		do {
			System.out.println("Quante lampadine vuoi?");
			n = in.nextInt();
		} while (n > grandezzaScatola);

		
		for (int i = 0; i < n; i++){
			scatola.add(new Lampadina(false));
		}
		
		
		for (Lampadina tmp:scatola){
			if (tmp.getState() == true){
				System.out.println(scatola.indexOf(tmp) +1 + " è accesa");
			} else {
				System.out.println(scatola.indexOf(tmp) +1 + " è spenta");
			}
		}
	/*	
		for (int i = 0; i < scatola.size(); i++){
			if (scatola[i].getState() == true){
				System.out.println((i+1)+" è accesa");
			} else {
				System.out.println((i+1)+" è spenta");
			}
		}
		
		/*
		//Inizializza lampadine
		for (int i = 0; i < n; i++){
			scatola[i] = new Lampadina(false);
		}
	
		//Mostra stato lampadine
		for (int j = 0; j < n; j++){
			if (scatola[j].getState() == true){
				System.out.println((j + 1) + " è accesa");
			} else {
				System.out.println((j + 1) + " è spenta");
			}
			
		}
	*/
	
		do {
			//Sceglie la lampadina
			System.out.println("Quale lampadina vuoi usare? "
				+ "Scegline una da 1 a " + n);
			
			int lampNum = in.nextInt();
			in.nextLine();
			
			Lampadina currentLamp = scatola.get(lampNum -1);
			
			//Acende o spegne la lampadina scelta
			System.out.println("Se vuoi accenderla premi A, "
					+ "se vuoi spegnerla premi S.");
			
			String scelta = in.nextLine();
			if (scelta.equals("A") == true){
				currentLamp.turnOn();

			} else if (scelta.equals("S") == true){
				currentLamp.turnOff();
			} else {
				break;
			}
			
			//mostra stato lampadine
			for (Lampadina tmp:scatola){
				if (tmp.getState() == true){
					System.out.println((scatola.indexOf(tmp) + 1) + " è accesa");
				} else {
					System.out.println((scatola.indexOf(tmp) + 1) + " è spenta");
				}
				
			}
			
			System.out.println("Vuoi continuare? Y/N");
			
			if (in.nextLine().equals("Y") == true){
				continue;
			}
				break;
			
		} while (true);
		
		
		//mostra stato lampadine
		for (Lampadina tmp:scatola){
			if (tmp.getState() == true){
				System.out.println(scatola.indexOf(tmp) +1 + " è accesa");
			} else {
				System.out.println(scatola.indexOf(tmp) +1 + " è spenta");
			}
			
		}
	
		
		in.close();
	
	}

}

