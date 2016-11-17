
public class CorniciConcentriche {
	public static void main(String[] args) {
		
		int n = 5;
		int width = n + n - 1;
		
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < n; j++) {
				if (j >= i) {
					System.out.print(i);
				} else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		
	}
}
