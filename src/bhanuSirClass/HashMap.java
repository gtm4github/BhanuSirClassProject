package bhanuSirClass;

import java.util.LinkedHashMap;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class HashMap {

	public static void main(String[] args) {
		LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
		
		map.put("City", "Banglore");
		map.put("Name", "Bhanu");
		map.put("Eid", "A1");
		map.put("Name", "Prakash");
		System.out.println(map.get("Name"));
		
		System.out.println(map.get("name"));//key is case sensitive
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.containsKey("Name"));//either 'true' or 'false' ---->used to check whether element is there or not
		System.out.println(map.containsKey("Area"));
		
		/*NOTE: in Hashmap values are stored under 'Key' insteadof index
		      'Key' is Case-sensitive and it can't be duplicate
		       LinkedHashMap will preserve insertion order but hashMap doesnot preserve insertion order
*/	}

}
