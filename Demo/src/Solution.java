import java.util.Arrays;

class Solution {
	
	
	public static void main(String[] argh) {
		String line = "1,5,7,4;3,7,2";
		char[] inputArray= line.toCharArray();
	      char[] input1 = new char[inputArray.length];
	      int input1Counter = 0;
	      char[] input2  = new char[inputArray.length];
	      int input2Counter = 0;
	      
	      boolean semicolanFound = false;
	      
	       int[] oddArray;
	      
	      int[] evenArray;
	      
	      for(int i = 0; i < inputArray.length; i ++ ){
	        
	        if(!(Character.toString(inputArray[i]).equals( ","))
	           && !(Character.toString(inputArray[i]).contains(";"))){
	             
	             if(inputArray[i] % 2 == 0){
	               
	               input2[input2Counter] = inputArray[i];          
	               input2Counter = input2Counter + 1;
	               
	             }
	             else{
	               input1[input1Counter] = inputArray[i];          
	               input1Counter = input1Counter + 1;
	             }
	           
	          
	        }else if((Character.toString(inputArray[i]).contains(";"))){
	             
	           }
	        
	        
	        
	      }
	      
	      
	       Arrays.sort(input1);
	      Arrays.sort(input2);
	      
	      
	      System.out.println(Arrays.toString(input1) + "," + Arrays.toString(input2));
		

	}
}