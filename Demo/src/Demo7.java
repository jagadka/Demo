import java.util.Arrays;

public class Demo7 {

	public static void main(String[] args) {

		int[] array = {0, -1,  2 ,0,  4 ,8,  0 };
		int[] output = new int[array.length]; 
		
		int count = 0;
		for(int i = 0; i < array.length; i ++) {
			
			if(array[i] == 0) {
				output[count] = array[i];
				count = count + 1;
				
			}
			
		}
		
		for(int i = 0; i < array.length; i ++) {
			
			if(array[i] != 0) {
				output[count] = array[i];
				count = count + 1;
				
			}
			
			
		}
		
		
		System.out.println(Arrays.toString(output));
		
		
	}

}
