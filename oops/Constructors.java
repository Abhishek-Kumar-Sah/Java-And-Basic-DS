package oops;
import impQuestions.*;
class animals {
	
	int legs, eyes ;
	boolean fly;

animals(boolean chk){
	
	legs = 4;
	eyes = 2;
	fly = chk;
}
animals(int legs , int eyes ,boolean fly){
	
	this.eyes = eyes;
	this.legs = legs;
	this.fly = fly;
	
}
public void details () {
	
	System.out.println("legs = "+legs);
	System.out.println("eyes = "+eyes);
	System.out.println("fly = "+fly);
}
}

public class Constructors {

	public  static void main(String[] args) {
		// TODO Auto-generated method stub
     GCD a1 = new GCD();
     a1.wishGm();
		animals cat = new animals(false);
		
		cat.details();
		
		animals crow = new animals(2,2,true);
		
		crow.details();
	}

}
