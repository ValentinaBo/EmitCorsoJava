
public class AnnoBisestile {

	public static void main(String[] args) {
		int anno = 1600;
		
		if (anno % 100 == 0) {
			if (anno % 400 == 0){
				System.out.println("L'anno è bisestile.");
			}	else {
				System.out.println("L'anno non è bisestile.");
			}
		} else {
			if (anno % 4 == 0){
				System.out.println("L'anno è bisestile.");
			} else {
				System.out.println("L'anno non è bisestile.");
			}
		}
		
	}
}
