package sixchapter;

class marine {
	int x = 0, y = 0;   // Marine의 위치좌표(x, y)
	int hp = 60;		// 현재 체력
	static int weapon = 6;  // 공격력
	static int armor = 0;   // 방어력
	
	public marine() {
		
	}
	
	public marine(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	static void weaponUp() {
		weapon++;
	}
	
	static void armorUp() {
		armor++;
	}
	
	void move(int x, int y) {
		this.x = x; // this.x는 인스턴스 변수, x는 지역변수
		this.y = y; // this.y는 인스턴스 변수, y는 지역변수
	}
}

public class exercise6_7 {	
}
