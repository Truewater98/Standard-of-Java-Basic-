package fivechapter;

import java.util.Random;
import java.util.Scanner;

public class exercise5_6_basic {
	public static void main(String[] args) {
		String[] words = { "television", "computer", "mouse", "phone"};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray();
			// �ܾ��� ������ġ�� ��� �����ְ� ������ �ܾ ���ߴ� �����̴�.
			// �������� ���� �����ϵ��� ������ �� ���� ä��ÿ�
			for(int j = 0; j < question.length; j++) {
				Random rand = new Random();
				int random = rand.nextInt(question.length);
				char temp = question[i];
				question[i] = question[random];
				question[random] = temp;
			}
			System.out.printf("Q%d, %s�� ������ �Է��ϼ���. >",1 + i, new String(question));
			String answer = sc.nextLine();
			// trim() ���� answer�� �¿� ������ ������ �� equals�� word[i]�� ��
			if(words[i].equals(answer.trim())) {
				System.out.printf("�¾ҽ��ϴ�.%n%n");
			}
			else {
				System.out.printf("Ʋ�Ƚ��ϴ�.%n%n");
			}
		}
		
	}
}
