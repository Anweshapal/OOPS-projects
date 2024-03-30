

public class pizzabillgeneratorapp {

	public static void main(String[] args) {
		/*Pizzabillgenerator pizza=new Pizzabillgenerator(false);
		pizza.addtoppings();
		pizza.getbill();*/
		deluxpizza dp = new deluxpizza(true);
		dp.getbill();

	}
	private int price;
	private boolean veg;
	
	private int extracheese=100;
	private int extratoppings=150;
	private int bagpack=50;
	
	private int basepizzaprice;
	private boolean isextracheesesadded=false;
	private boolean isextratoppingsadded=false;
	private boolean istakeaway=false;
	
	
	pizzabillgeneratorapp(boolean veg){
		this.veg=veg;
		if(this.veg) {
			this.price=300;
		}
		else {
			this.price=400;
		}
		basepizzaprice=this.price;
	}
	public void addextracheese() {
		isextracheesesadded=true;
		
		this.price+=extracheese;
	}
	public void addtoppings() {
		isextratoppingsadded=true;
		
		this.price+=extratoppings;
	}
	public void takeaway() {
		istakeaway=true;
		
		this.price+=bagpack;
	}
	public void getbill() {
		String bill=" ";
		System.out.println("pizza : "+basepizzaprice);
		
		if(isextracheesesadded) {
			bill+="Extra cheese added : "+extracheese+"\n";
		}
		if(isextratoppingsadded) {
			bill+="Extra toppings added : "+extratoppings+"\n";
		}
		if(istakeaway) {
			bill+="Take away : "+bagpack+"\n";
		}
		bill+="bill : "+this.price+"\n";
		System.out.println(bill);
	
	}
	static class deluxpizza extends pizzabillgeneratorapp{

		deluxpizza(boolean veg) {
			super(veg);
			super.addextracheese();
			super.addtoppings();
		}	
	}
}
