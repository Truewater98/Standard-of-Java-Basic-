package sevenchapter;

class Product{
	int price;
	int bonuspoint;
	
	Product(){}
	
	Product(int price){
		this.price = price;
		bonuspoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	Tv(){
		//super(0);
	}
	
	public String toString() {
		return "Tv";
	}
}

public class exercise7_3 {
	Tv t = new Tv();
}
