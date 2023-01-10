package sevenchapter;

import java.util.Random;

class Sutdadeck{
	SutdaCard[] deck;
	Random rand;
	public Sutdadeck(){
		deck = new SutdaCard[20];
		for(int i = 0; i < deck.length; i++) {
			if(i < 10)	
			deck[i] = new SutdaCard(i+1, false);
			else if(i >= 10) {
				deck[i] = new SutdaCard(i-9, i == 10 || i == 12 || i == 17);

			}
		}
	}
	
	public void showDeck() {
		for(int i = 0; i < deck.length; i++) {
			deck[i].showCard();
		}
	}
	
	public void shuffle() {
		rand = new Random();
		SutdaCard temp = null; 
		for(int i = 0; i < deck.length; i++) {
				int index = rand.nextInt(deck.length);
				temp = deck[i];
				deck[i] = deck[index];
				deck[index] = temp;
		}
	}
	
	public SutdaCard pick(){
		rand = new Random();
		return pick(rand.nextInt(deck.length));
	}
	
	public SutdaCard pick(int index) {
		if(index < 20)
		return deck[index];
		return null;
	}
}

class SutdaCard{
	int month;
	boolean isKwang;
	
	public SutdaCard(){
		month = 0;
		isKwang = true;
	}
	public SutdaCard(int num, boolean isKwang) {
		month = num;
		this.isKwang = isKwang;
	}
	
	public void setisKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}
	
	public boolean getisKwang() {
		return isKwang;
	}
	
	public void showCard() {
		if(isKwang)
		System.out.println(month + "±¤");
		else
		System.out.println(month);
	}
}

public class exercise7_1_2 {
	public static void main(String[] args) {
		Sutdadeck deck = new Sutdadeck();
		System.out.println("showDeck");
		deck.showDeck();
		System.out.println("pick");
		deck.pick().showCard();
		System.out.println("pick index");
		deck.pick(19).showCard();
		System.out.println("shuffle");
		deck.shuffle();
		System.out.println("after showDeck");
		deck.showDeck();
	}
	
}
