package bhanuSirClass;
/*// COMPARABLE
 # an interface
 # default sorting*/


import java.util.ArrayList;
import java.util.Collections;

public class ComparableMobile implements Comparable<ComparableMobile>{
	String color;
	double price;
	String brand;
	
	public ComparableMobile(String color, double price, String brand) {
		super();
		this.color = color;
		this.price = price;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Mobile [color=" + color + ", price=" + price + ", brand=" + brand + "]\n";
	}
	public static void main(String[] args) {
		ArrayList<ComparableMobile> a=new ArrayList<ComparableMobile>();
		a.add(new ComparableMobile("Red",20.2 , "Apple"));
		a.add(new ComparableMobile("Blue",40.2 , "Samsung"));
		a.add(new ComparableMobile("White",10.2 , "Nokia"));
		Collections.sort(a);
		System.out.println(a);
		
		
				
	}
	@Override
	public int compareTo(ComparableMobile m) {
		//return this.brand.compareTo(m.brand);--------> ascending sort(String )
	 
		//return -this.brand.compareTo(m.brand); //--------> descending sort
		//return this.color.compareTo(m.color);
		
		//return (int) -(this.price-m.price);//-------> for DOUBLE type--> descending sort
		return (int) (this.price-m.price);//-------> for DOUBLE type--> ascending sort
		
	}
	
	

}
