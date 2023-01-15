import java.util.Scanner;

public class PalindroneString {

	public static void main(String[] args) {
			
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String orignalString=sc.nextLine();;
		sc.close();
		
		System.out.println("orignal String	"+ orignalString);
		char arr[]=orignalString.toCharArray();
		String reverseString="";
		
		for (int i = arr.length-1; i>=0; i--) {
			
			reverseString=reverseString+arr[i];
		}
		
		if (reverseString.equalsIgnoreCase(orignalString)) {
			System.out.println("Strig is palindrone");
		}else {
			System.out.println("String is not palindrone");
		}
		
	}

}
