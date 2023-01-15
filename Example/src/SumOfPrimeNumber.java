import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class SumOfPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=2;
		int count=0;
		long  sum=0;
		
		while (count<1000) {

			if (isPrime(number)) {
				sum=sum+number;
			}
			count++;
		}
		System.out.println(sum);
		
	}

	public static boolean isPrime(int number) {
		
		for (int i = 2; i <= number/2; i++) {
			
			if (number%i==0) {
				return false;
			}
		}
		
		return true;
	}

}
