package bhanuSirClass;

public class EncapsulationDemo {
// declaration
	private int i;
// initialization

	public EncapsulationDemo(int i) {
		this.i = i;
	}
	
// utilization
	public void setValue(int j){
		i=j;
	}
	public int getValue(){
		return i;
	}

}
