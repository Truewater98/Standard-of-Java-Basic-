package sixchapter;

import java.util.Random;

public class exercise6_17 {
	public int[] shuffle(int[] arr) {
		Random rand = new Random();
		for(int i = 0; i < arr.length; i++) {
			int j = rand.nextInt(arr.length);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;			
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		exercise6_17 b = new exercise6_17();
		b.shuffle(a);
		for(int i =0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	}
}
