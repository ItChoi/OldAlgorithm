package test;

public class TestAlgorithm {

	public static void main(String[] args) {
		int nx = 7;
		int[] x = new int[] {22,5,11,32,120,68,70};
	
		binInsertionSort(x, nx);
		
		for (int test : x) {
			System.out.println("����: " + test);
		}
		
	}
	
	static void binInsertionSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			int key = a[i];
			int si = 0;
			int li = n - 1;
			int mi;
			int ci;
			
			
			
		}
		
	}
	
}