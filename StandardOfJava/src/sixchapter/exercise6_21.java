package sixchapter;

public class exercise6_21 {
	public int abs(int value) {
		if(value < 0) {
			value *= -1;
		}
		return value;
	}
	
	public static void main(String[] args) {
		exercise6_21 a = new exercise6_21();
		System.out.println(a.abs(0));
		System.out.println(a.abs(1));
		System.out.println(a.abs(-214));
	}
}
