package test;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Entrer a String");
		String str=sc.nextLine();
		sc.close();
		char[] arr=str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			
			int j;
			for ( j = 0; j < i; j++) {
				
				if (arr[i]==arr[j]) {
					
					break;
				}
			}
			
			if (i==j) {
				System.out.print(arr[j]);
			}
		}
	}
}
