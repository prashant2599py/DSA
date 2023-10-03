package dataStructure;
import java.util.HashMap;
import java.util.Map;


public class Hashing {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
		
		// Insert
		map.put(12, "Govind");
		map.put(45, "Pranjal");
		map.put(34, "Ankita");
		map.put(42, "Sabir");
		
		map.put(34, "Prashant");  // In this case the new values for key 34 is Prashant.
		
		System.out.println(map);
		
		// Search
		if(map.containsKey(34)) {
			System.out.println("Exists key 34");
		}else {
			System.out.println("34 key does not exist");
		}
		
		//Exists or not
		System.out.println(map.get(45));    // key exists
		System.out.println(map.get(62));  /// key does not exists returns null
		
		
		// Iterator
		// similar to for-each loop
		 // int arr[] = {1,2,3,4,5};
		// for(int val : arr)
		// Map.Entry<Integer, String> e = map.entrySet()
		
		for(Map.Entry<Integer, String> e: map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		

	}

}
