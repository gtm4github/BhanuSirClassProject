package bhanuSirClass;

public class EncapsulationMainMethod {
	public static void main(String[] args) {
		EncapsulationDemo demo = new EncapsulationDemo(0);
		demo.setValue(10);
		int j=demo.getValue();
		System.out.println(j);
/*      
  
        demo.i=10;//error--> writing
        int j=demo.i;//error--> reading
*/	}

}
