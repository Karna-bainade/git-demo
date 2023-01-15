package test;

public class Test6 {

	public static void main(String[] args) {


		int num=153;
		if (isPrime(num)) {

			System.out.println("Num is prime");
		}else {
			System.out.println("Num is not prime");
		}

	}	

	static boolean isPrime(int n) {

		if (n==1 || n==0) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}

}
