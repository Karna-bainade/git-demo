
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N=100;
		int sum=0;
		
		for (int i = 0; i < N;i++) {
			if (isPrime(i)) {
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
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
