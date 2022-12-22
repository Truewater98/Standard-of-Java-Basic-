package sixchapter;

public class exercise6_1and2and3basic {
	public static void main(String args[]) {
		Student s = new Student("ȫ�浿",1,1,100,60,76);
		String str = s.info();
		System.out.println(str);
		System.out.println(s.getTotal());
		System.out.println(s.getAverage());
		}
}

class Student{
	private String name = "";
	private int ban = 0;
	private int no = 0;
	private int kor = 0;
	private int eng = 0;
	private int math =0;
	
	public Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public float getAverage() {
		return (int)((getTotal() / 3f + 0.05f) * 10) / 10f;
	}
	
	public String info() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math;
	}
}
