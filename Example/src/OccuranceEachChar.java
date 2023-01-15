import java.util.Scanner;

public class OccuranceEachChar {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] arr=str.toCharArray();
	
		int i,len;
		
		int counter[]= new int[256];
		len=arr.length;
		
		for (i = 0; i <len; i++) {
			counter[(int)str.charAt(i)]++;
			
		}
		
		for (i = 0; i < 256; i++) {
			if (counter[i]!=0) {
				System.out.println((char)i+"   "+counter[i]);
			}
		}	
	}
}
