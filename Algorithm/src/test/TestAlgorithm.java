package test;

public class TestAlgorithm {

	public static void main(String[] args) {
		
		int n = 4;
		
		recur3(n);
		
	}
	
	static void recur3(int n) {
		if (n > 0) {
			recur3(n - 1);
			recur3(n - 2);
			System.out.println(n);
		}
	}
	
}