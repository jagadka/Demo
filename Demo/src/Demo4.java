import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {

		int[] a = { 10, 6, 8, 9, 7 };

		int[] b = { 4, 1, 3, 5, 2 };

		int length = a.length + b.length;

		int[] output = new int[length];

		for (int i = 0; i < a.length; i++) {

			output[i] = a[i];
			output[a.length + i] = b[i];

		}

		// Arrays.sort(output);

		System.out.println(Arrays.toString(output));

		int min = 0;

		//int[] outputSort = new int[length];

		for (int j = 0; j < output.length; j++) {

			for (int i = j+1; i < output.length; i++) {

				if (output[i] < output[j]  ) {

					min = output[i];
					output[i]  = output[j] ;
					output[j] = min; 
				}

			}


		}
		
		System.out.println(Arrays.toString(output));

	}

}
