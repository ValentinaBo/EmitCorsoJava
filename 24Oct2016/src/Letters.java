
public class Letters {
	private char c;
	
	public Letters (char letter){
		c = letter;
	}
	
	public boolean isVowel(){
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
				c == 'A' ||c == 'E' ||c == 'I' ||c == 'O' ||c == 'U') {
			return true;
		}
		return false;
	}
}

