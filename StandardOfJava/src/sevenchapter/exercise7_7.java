package sevenchapter;
	class Outer1{
		static class Inner{
			int iv = 200;
		}
	}
public class exercise7_7 {
	public static void main(String[] args) {
		Outer1.Inner inner = new Outer1.Inner();
		System.out.println(inner.iv);
	}
}
