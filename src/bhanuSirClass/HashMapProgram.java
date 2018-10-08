package bhanuSirClass;

import java.util.LinkedHashMap;

/*
Q> Write a program to store following information of classroom & print the required information
 1>Information to store
    a. PC-->2
    b. Projector-->2
    c. Chair-->130
    d. marker-->4
 2>Required info
    a. how many chair
    b. does classroom has Projector
   
   */
public class HashMapProgram {
	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> classRoom = new LinkedHashMap<String,Integer>();
		classRoom.put("PC", 2);
		classRoom.put("Projector",2);
		classRoom.put("Chair", 130);
		classRoom.put("Marker", 4);
		
		System.out.println("Total PC= "+classRoom.get("PC"));
		System.out.println("Total Projector= "+classRoom.get("Projector"));
		System.out.println("Total Chair= "+classRoom.get("Chair"));
		System.out.println("Total Marker= "+classRoom.get("Marker"));
		
		System.out.println(classRoom.keySet());
		System.out.println(classRoom.values());
		
		System.out.println("Classroom has Projector or not--> "+classRoom.containsKey("Projector"));
		System.out.println("Classroom has PC or not--> "+classRoom.containsKey("PC"));
	}

}
