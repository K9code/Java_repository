package hashMap;

import java.util.*;

public class HashMapPractice {

	public static void hashPractice() {
		
		HashMap<String, String> m = new HashMap<String, String>();
		
		m.put("Mother", "Bitch");
		m.put("Father", "Hero");
		
		System.out.println(m.get("Father"));
		
	}
	
	public static void main(String[] args) {
		
		hashPractice();

	}

}
