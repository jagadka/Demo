import java.util.Scanner;

public class Demo2 {

		
		public static void main(String[] args) throws Exception {
			Scanner s = new Scanner(System.in);
	        String sentence = s.nextLine();
	        System.out.println(findLongestEvenWord(sentence));
		}
		
		public static String findLongestEvenWord(String sentence) {
			//write your code here
			int length = 0;
			String output = null;
			String[] stringArray = sentence.split("\\s");
			for(String str : stringArray ) {
				if(str.length()%2 ==0 && str.length() >  length) {
					length = str.length();
					output = str;
				}
				
			}
			
			return output;
		}

	
}
