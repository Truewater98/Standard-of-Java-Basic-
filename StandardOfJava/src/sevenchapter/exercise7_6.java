package sevenchapter;


class Outer{
		class Inner{
			int iv =100;
		}
	}
		
public class exercise7_6 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		System.out.println(inner.iv);
	}
}
