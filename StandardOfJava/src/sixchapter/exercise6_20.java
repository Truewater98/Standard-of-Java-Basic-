package sixchapter;

public class exercise6_20 {
	public int max(int[] arr) {
		int max = 0;
		if(arr.length == 0 || arr == null) {
			return -999999;
		}else {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] > max) {
					max = arr[i];
				}			
		}
		return max;
		}
	}
	
	public static void main(String[] args) {
		exercise6_20 a = new exercise6_20();
		int[] b = {1,2,3,4,5,6,100,15,30,1};
		System.out.println(a.max(b));
		
	}
}
