package test;

public class TestAlgorithm {

	public static void main(String[] args) {
		
		int[] a = {80, 400, 160, 240};
		System.out.println(gcdArray(a));
		
	}
	
	static int gcdArray(int[] a) {
		int result = 0;
		
		for (int i = 0; i < a.length - 1; i++) {
			result = gcd(a[i], a[i + 1]);
		}
		
		return result;
	}
	
	static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return gcd(y, x % y);
		}
	}
	
	
}