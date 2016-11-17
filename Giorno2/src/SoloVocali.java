import java.util.Scanner;

public class SoloVocali {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Dammi una parola! ");
		String inputWord = in.nextLine();
		
		for (int i = 0; i < inputWord.length(); i++) {
			char lettera = inputWord.charAt(i);
			switch(lettera) {
				case 'a': System.out.print(lettera);
					break;
				case 'e': System.out.print(lettera);
					break;
				case 'i': System.out.print(lettera);
					break;
				case 'o': System.out.print(lettera);
					break;
				case 'u': System.out.print(lettera);
					break;
				default: ;
			}
		}
		
		
		in.close();
	}
}
