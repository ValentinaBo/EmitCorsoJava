import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class editorTestoMain {

	public static void main(String[] args) {
		Reader sys = new InputStreamReader(System.in);
		try (BufferedReader in = new BufferedReader(sys)){
			
		//chiede nome file
		System.out.println("Come vuoi chiamare il tuo file?");
		String nomeFile = in.readLine();
		System.out.println(nomeFile);
		
		File f = new File(nomeFile + ".txt");
		
		if (f.exists()) {
			System.out.println("Il file esiste già.");
		} else {
			System.out.println("Scrivi sul file.");
	
			//scrive
			try (FileWriter fw = new FileWriter(f, true)){
				String input;
				do {
					input = in.readLine();
						
					if (input != null && !input.equals("esci")){
						fw.write(input + "\n");
					}
				} while (!input.equals("esci"));
			}
		}
				
		System.out.println("Finito di Scrivere. \nVuoi rileggere? Y/N");
		String ans = in.readLine();
		if (ans.equals("N")){
			System.out.println("Ok ciao!");
		} else {
			//legge
			try (BufferedReader br = new BufferedReader(new FileReader(f))){
				String riga;
				do {
					riga = br.readLine();
					System.out.println(riga);
				} while (riga != null);
			}
		}
	
		
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("File non leggibile.");
			e.printStackTrace();
		}
	}
}
