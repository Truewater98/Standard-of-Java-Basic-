package sixchapter;

public class exercise6_4and6 {
	public static void main (String[] args) {
		Mypoint mp = new Mypoint(1, 2, 1, 2);
		mp.setPoint1(1, 1);
		mp.setPoint2(2, 2);
		System.out.println(mp.getDistance());
	}
}
class Mypoint{
	private int x = 0;
	private int y = 0;
	private int x1 = 0;
	private int y1 = 0;
	
	public Mypoint(int x, int x1, int y, int y1) {
		this.x = x;
		this.x1 = x1;
		this.y = y;
		this.y1 = y1;
	}
	
	public void setPoint1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setPoint2(int x, int y) {
		x1 = x;
		y1 = y;
		
	}
	// (x,y) (x1,y1) . 두 점 와 간의 거리를 구한다
    public double getDistance() {
    	double result = Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
    	return result;
    }
}