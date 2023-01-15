import java.util.Scanner;

public class CountDigitFromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.close();
		
		int count=0;
		
		for(; a!=0; a/=10) {
			count++;
		}
		System.out.println(count);
		
		

	}
}
