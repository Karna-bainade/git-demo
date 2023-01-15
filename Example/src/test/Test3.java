package test;


class Test3 { 
	private String name; 

	Test3(String name){ 
		this.name = name; 
	} public static void main(String[] args){ 

		Test3 person = new Test3("John"); 
		transform(person); 
		System.out.println(person.name); 

		// what will be printed here and why? 
	} 
	static void transform(Test3 p){ 		
		p = new Test3("Michael"); } 
}
