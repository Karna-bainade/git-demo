import java.util.Scanner;

public class PalindroneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		
		int orignalNum=num;
		System.out.println(orignalNum);
		
		int reversNum=0, reminder;
		
		while (num!=0) {
			reminder=num%10;
			reversNum=reversNum * 10+reminder;
			num =num/10;
			
		}
		
		System.out.println("reverse Number   "+reversNum);
		
		if (orignalNum==reversNum) {
			System.out.println("number is palindrone");
		}else {
			System.out.println("Number not palindrone");
		}
	
	}

}
