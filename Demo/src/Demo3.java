import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		
		/*
		 * //BufferedReader BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in)); String name = br.readLine();
		 */
        
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        
        String[] stringArray = name.split("\\s");
		
		int maxProfit = 0;
		
		for (int i = 0; i < stringArray.length; i++) {

			for (int j = i + 1; j < stringArray.length; j++) {

				if ((Integer.valueOf(stringArray[j]) > Integer.valueOf(stringArray[i]))
						&& (Integer.valueOf(stringArray[j]) - Integer.valueOf(stringArray[i]) > maxProfit)) {
					maxProfit = Integer.valueOf(stringArray[j]) - Integer.valueOf(stringArray[i]);

					System.out.println("I value:" + Integer.valueOf(stringArray[i]));
					System.out.println("j value:" + Integer.valueOf(stringArray[j]));
					System.out.println("profit value:" + maxProfit);
					System.out.println("_______________***************");
				}

			}

		}
		
		System.out.println(maxProfit);

	}

}
