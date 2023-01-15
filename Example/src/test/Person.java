package test;


import java.util.ArrayList;
import java.util.List;


public class Person{

	public static void main(String args[]) {
		
		List<String> list=new ArrayList<String>();
		list.add("Monday");
		list.add("Tuesday");
		list.add("Wednesday");
		list.add("Thursday");
		list.add("Friday");
		list.add("Saturday");
		list.add("Sunday");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

