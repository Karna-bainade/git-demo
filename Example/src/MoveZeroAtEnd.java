
public class MoveZeroAtEnd{

	public static void main(String args[]) {
		
		int[] arr= {1,2,3,0,0,0,6,9,34,5};
		
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]!=0) {
				arr[count++]=arr[i];
			}
		}
		
		while(count<arr.length) {
			arr[count++]=0;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		
	}
}
