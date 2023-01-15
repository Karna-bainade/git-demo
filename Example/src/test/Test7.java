package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.poi.ss.formula.functions.Count;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test7 {

	public static void main(String [] args) {

		int sum=0;
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
	
		for (int i = 0; i < num; i++) {
			
			if (isPrime(i)){
				System.out.println(i+"  No si prime");
				sum=sum+i;
			}else{
				System.out.print("Not a prime");
				
			}
		}
		System.out.println("Sum of all  "+sum);
	}
	public static boolean isPrime(int num1){

		if(num1==1 || num1==0){

			return false;
		}else{

			for(int i=2; i<num1; i++){

				if(num1%i==0){
					return false;
				}
			}
		}
		return true;
	}
}

