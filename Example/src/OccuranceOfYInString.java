
public class OccuranceOfYInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str="today is a great day";
		char[] arr=str.toCharArray();
		
		int counter[]=new int[256];
		for (int i = 0; i < arr.length; i++) {
			
			counter[(int)str.charAt(i)]++;
		}
		
		for (int i = 0; i <256; i++) {
			
			if (counter[i]!=0) {
				
				if ((char)i=='y') {
					System.out.println((char)i+"   "+counter[i]);
				}
				
			}
		}
		
	}

}
