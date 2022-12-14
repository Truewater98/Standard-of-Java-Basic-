package fivechapter;

import java.util.Random;
import java.util.Scanner;

public class exercise5_6_basic {
	public static void main(String[] args) {
		String[] words = { "television", "computer", "mouse", "phone"};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray();
			// 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다.
			// 실행결과와 같이 동작하도록 예제의 빈 곳을 채우시오
			for(int j = 0; j < question.length; j++) {
				Random rand = new Random();
				int random = rand.nextInt(question.length);
				char temp = question[i];
				question[i] = question[random];
				question[random] = temp;
			}
			System.out.printf("Q%d, %s의 정답을 입력하세요. >",1 + i, new String(question));
			String answer = sc.nextLine();
			// trim() 으로 answer의 좌우 공백을 제거한 후 equals로 word[i]와 비교
			if(words[i].equals(answer.trim())) {
				System.out.printf("맞았습니다.%n%n");
			}
			else {
				System.out.printf("틀렸습니다.%n%n");
			}
		}
		
	}
}
