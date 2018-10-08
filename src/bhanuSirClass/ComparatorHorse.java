package bhanuSirClass;

import java.util.ArrayList;
import java.util.Collections;

//Comparator Eg used for  Custom Sorting
public class ComparatorHorse  {
	String name;
	int noOfRaces;
	double cost;
	public ComparatorHorse(String name, int noOfRaces, double cost) {
		super();
		this.name = name;
		this.noOfRaces = noOfRaces;
		this.cost = cost;
	}
	@Override
	public String toString() {//--------------> overriding toString to get the containt 
		return "Horse [name=" + name + ", noOfRaces=" + noOfRaces + ", cost=" + cost + "]\n";
	}
	
  public static void main(String[] args) {
	ArrayList<ComparatorHorse> a=new ArrayList<ComparatorHorse>();
	a.add(new ComparatorHorse("A", 10, 500.2));
	a.add(new ComparatorHorse("Z", 100, 1500.2));
	a.add(new ComparatorHorse("M", 200, 2500.2));
	System.out.println("Before Sorting "   + a);
	Collections.sort(a, new CompartorNoOfRaces());
	System.out.println("----");
	System.out.println("after Sorting "  + a);
	
}
}
