package oops;

import java.util.Scanner;
class vehicle{
	
	int wheels , doors;
	
		public void  details() {
			
			System.out.println("wheels "+"= "+wheels +" & doors "+ doors);
			
			
		}
}


public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      vehicle car = new vehicle();
      vehicle luna = new vehicle() ;
      car.doors = 5;
      car.wheels = 4;
      
		luna.doors = 0;
		luna.wheels = 2;
		
		car.details();
		luna.details();
	}

}
