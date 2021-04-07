package dataStructures.Map;

import java.util.*;

public class HashCodeAndEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		pen p1 = new pen("blue", 10);
		pen p2 = new pen("blue",10);
		
//		System.out.println(p1);
//		System.out.println(p2);
		
		Set <pen> pens = new HashSet<>();
		
		pens.add(p1);
		pens.add(p2);
		
		System.out.println(pens);
		System.out.println(p1.equals(p2));
		
		System.out.println(pens.getClass()); 
		System.out.println(p1.hashCode());
	

	}
	public  static class pen  {
		
		String color;
		int price;
		
		public pen(String color , int price) {
			this.color = color;
			this.price = price;
		}
//		@Override
//		public boolean equals(Object object) {
//			pen obj = (pen)object;
//			return(this.price == obj.price && this.color.equals(obj.color));
//			
//			// default return statement of equals 
////			return (this == object);
//			
//		}
//		
//		@Override
//		public int hashCode() {
//			return(price + color.hashCode());
//		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((color == null) ? 0 : color.hashCode());
			result = prime * result + price;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			pen other = (pen) obj;
			if (color == null) {
				if (other.color != null)
					return false;
			} else if (!color.equals(other.color))
				return false;
			if (price != other.price)
				return false;
			return true;
		}
		
		
		
		
	}

}
