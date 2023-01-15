import java.util.ArrayList;
import java.util.Scanner;

import org.testng.internal.junit.ArrayAsserts;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		sc.close();
		
		char[] str1=str.toCharArray();
		
		for(int i=0;i<str1.length;i++ ) {
			
			int j;
			for(j=0;j<i;j++) {
				
				if(str1[i]==str1[j]) {
					
					break;
				}
			}
			
			if (j==i) {
			//	str1[index++]=str1[j];
				System.out.print(str1[j]);
			}	
		}
	}

}
