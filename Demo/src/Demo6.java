import java.util.Arrays;

public class Demo6 {

	public static void main(String[] args) {
		
		String [][]  strArray= new String[3][3];
		String []  outputArray= new String[9];
		String []  outputSortedArray= new String[9];
		
		strArray[0][0] = "1";
		strArray[0][1] = "5";
		strArray[0][2] = "2";
		
		strArray[1][0] = "2";
		strArray[1][1] = "7";
		strArray[1][2] = "4";
		
		strArray[2][0] = "3";
		strArray[2][1] = "8";
		strArray[2][2] = "6";
		
		System.out.println(strArray);
		
		int count = 0;
		
		for(int i = 0; i < strArray.length; i ++) {
			
			for(int j = 0; j < strArray[i].length; j ++ ) {
				
				outputArray[count] = strArray[i][j];
				count = count + 1;
				
				
			}
			
			
		}
		
		System.out.println(Arrays.toString(outputArray));
		/*
		 * Arrays.sort(outputArray); System.out.println(Arrays.toString(outputArray));
		 */
		
		int minNum = 0;
		
		for(int i = 0; i < outputArray.length; i ++) {
			
			for(int j = i + 1; j < outputArray.length; j ++ ) {
				
				if(Integer.valueOf(outputArray[j]) < Integer.valueOf(outputArray[i])) {
					
					minNum = Integer.valueOf(outputArray[j]);
					outputArray[j] = outputArray[i];
					outputArray[i] = String.valueOf(minNum);
					
				}
				
			}
			
			
		}
		
		System.out.println(Arrays.toString(outputArray));

	}

}
