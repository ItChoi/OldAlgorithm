package test;

public class TestAlgorithm {
	
	public static void main(String[] args) {
		int[] a = {6, 4, 3, 2, 1, 9, 8};
		int key = 3;
		
		System.out.print("   |");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%2d", i);
		}
		System.out.println("\n---+-----------------");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("   |");
			
			for (int j = 0; j < a.length; j++) {
				if (i == j) {
					System.out.print(" ");
					for (int k = 0; k < j; k++) {
						System.out.print("  ");
					}
					System.out.println("*");
					
				}
			}
			
			System.out.print(i + "  | ");
		}
		
		
	}	
}


