package fivechapter;

public class exercise5_10 {
	public static void main(String[] args) {
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
			// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		String src = "abc123";
		String result = "";
			// src charAt() result ���ڿ� �� ���ڸ� ���� �ϳ��� �о ��ȯ �� �� ����
			for(int i=0; i < src.length();i++) {
				char ch = src.charAt(i);
				if('a' <= ch && ch <= 'z') {
					int index = ch - 97;
					ch = abcCode[index];
					result += String.valueOf(ch);
				}else if('0' <= ch && ch <= '9') {
					int index = ch - 48;
					ch = numCode[index];
					result += String.valueOf(ch);
				}
			}
		System.out.println("src:"+src);
		System.out.println("result:"+result);

	}
}
