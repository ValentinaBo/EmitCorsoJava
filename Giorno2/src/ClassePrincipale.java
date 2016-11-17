
public class ClassePrincipale {
	
	public static void main(String[] args){
		int[] eta = new int[3];
		eta[0] = 1;
		eta[1] = 2;
		eta[2] = 3;
		
		for (int i = 0; i < eta.length; i++)
			System.out.println(eta[i]);
		
		eta[2] = 56;
		System.out.println(eta[2]);
	}

}
