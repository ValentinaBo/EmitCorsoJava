package distributoreAutomatico;

import java.util.Scanner;

public class DistrBottiglieMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
	
		
		System.out.println("Quante bottiglie vuoi nel tuo distributore?");
		int n = in.nextInt();
		in.nextLine();
		
		Distributore.creaDistributore(n);
		
		
		in.close();
	}

}
