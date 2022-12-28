package sixchapter;

public class exercise6_18 {
	public boolean isNumber(String str) {
		if(str == null || str == "") {
			return false;
		}else {
		for(int i = 0; i < str.length(); i++) {
			char is = str.charAt(i);
			if('0' > is || is > '9') {
				return false;
			}
		}
		return true;
		}
	}
	public static void main(String[] args) {
		exercise6_18 a = new exercise6_18();
		String str = "4567487";
		if(a.isNumber(str)) System.out.println("숫자만");
		else System.out.println("다른거 섞여있음");
		
	}
}
