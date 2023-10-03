package arrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLists {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		// Add
		list.add(13);
		list.add(23);
		list.add(24);
		list.add(90);
		list.add(45);
		
		System.out.println(list);
		
		//Search | get
	    int getList = list.get(2);
	    int getList2 = list.get(1);
	    
	    System.out.println(getList + " " + getList2);
	    
	    // Delete
	    
	    list.remove(3);
	    System.out.println(list);
	    
	    // add element in between
	    list.add(1, 78);
	    System.out.println(list);
	    
	    // set element | modify element at index
	    list.set(3, 87);
	    System.out.println(list);
	    
	    //count size of arrayList
	    int size = list.size();
	    System.out.println("Size of the List :" + size);
	    
	    // Print elements of arrayList
	    for(int i = 0; i < list.size(); i++) {
	    	System.out.print(list.get(i) + " ");
	    }
	    System.out.println();
	    
	    
	    
	    // Sort the Array list.
	    Collections.sort(list);
	    System.out.println(list);
	    
	}

}
