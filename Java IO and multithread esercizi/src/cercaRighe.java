import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class cercaRighe {

	public static void main(String[] args) {
				
		File f = new File("P:\\workspace\\Java IO and multithread esercizi\\src\\Text.txt");
		File n = new File("P:\\workspace\\Java IO and multithread esercizi\\src\\newText.txt");
		
		try (BufferedReader br = new BufferedReader(new FileReader(f))){
		
			ArrayList<String> arrayRighe = new ArrayList<String>();
			String riga = " ";
		
			while (true) {
				riga = br.readLine();
				if (riga != null) {
					arrayRighe.add(riga);
				} else {
					break;
				}
			}
			
			try (FileWriter fw = new FileWriter(n, true);) {

						arrayRighe.stream()
							.filter(s -> s.contains("Le scogliere"))
						//	.forEach(s -> System.out.println(s))
							.forEach(s -> { try {fw.write(s + "\n");} 
											catch (Exception e) {e.printStackTrace();} });
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}