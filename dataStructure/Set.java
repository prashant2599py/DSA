package dataStructure;
import java.util.HashSet;
import java.util.Iterator;


public class Set {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		
		// Insert
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		set.add(1);
		
		System.out.println(set);
		
		// Search
		if(set.contains(1)){
			System.out.println("Set contains : 1");
		}
		if(!set.contains(6)) {
			System.out.println("Set does not contain : 6");
		}
		
		System.out.println();
		
		
		// Delete
		set.remove(1);
		if(set.contains(1)) {
			System.out.println("1 is present in the set");
		}
		else {
			System.out.println("1 is beeing removed from the set");
		}
		
		System.out.println(set);
		
		
		// Size
		
		System.out.println("The size of the set is : " + set.size());
		
		// Print all Elements
		System.out.println(set);
		
		// Iterator
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
