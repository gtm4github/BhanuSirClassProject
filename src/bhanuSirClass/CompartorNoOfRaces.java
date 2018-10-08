package bhanuSirClass;

import java.util.Comparator;

public class CompartorNoOfRaces implements Comparator<ComparatorHorse> {

	@Override
	public int compare(ComparatorHorse h1, ComparatorHorse h2) {
		
		//return -(h1.noOfRaces-h2.noOfRaces);
		//return h1.noOfRaces-h2.noOfRaces;//Asscending
		//return (int) (h1.cost-h2.cost);// sorting for double
		return -(int) (h1.cost-h2.cost);
	}
   
}
