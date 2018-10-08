package propertyFile;
/*
 --->in order to handle 'Property file',first created a folder 'input' in this project,where create a Property file,
     with '.properties' extension
    # in property file we store the value under 'key'
    # in one row, we can store only one 'key-value' pair--> 'key' is case-sensitive and it cannot be duplicate
    # Don't give the 'value' in "" (double quote)
---> to read data:
	step-1: create object of 'Properties' class
	step-2: load the property file,using 'load()' & 'FileInputStream'
	step-3: get the property value,specifying the 'key'
*/
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class DemoProperty {
	@Test
	public static void getData() throws FileNotFoundException, IOException {
		Properties p = new Properties();//--> step:1
		p.load(new FileInputStream("./input/data.properties"));//step:2 pass path f property file as an argument f 'FileInputStream' in 'load()' 
		String v = p.getProperty("city");//step:3
		System.out.println(v);
	}

}
