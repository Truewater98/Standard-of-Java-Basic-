package sevenchapter;
import java.awt.*;
import java.awt.event.*;
class Test{
	private int num = 1;
	public int getNum() {
		return this.num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
}
public class exercise7_9 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.addWindowListener(new EventHandler(){
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
	
	Test t1 = new Test() {
		public int num = 10;
		@Override
		public int getNum() {
			return this.num;
		}
	};
	System.out.println(t1.getNum());
	}
}

class EventHandler extends WindowAdapter{
	
	public void windowClosing(WindowEvent e) {
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);
	}
}
