package sixchapter;

class marine {
	int x = 0, y = 0;   // Marine�� ��ġ��ǥ(x, y)
	int hp = 60;		// ���� ü��
	static int weapon = 6;  // ���ݷ�
	static int armor = 0;   // ����
	
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
		this.x = x; // this.x�� �ν��Ͻ� ����, x�� ��������
		this.y = y; // this.y�� �ν��Ͻ� ����, y�� ��������
	}
}

public class exercise6_7 {	
}
