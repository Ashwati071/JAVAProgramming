package arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	
	public static void main(String[] args) {
	
	ArrayList list = new ArrayList();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	
	//System.out.println(list);
	
	
	//Apoart from using for loop and for each loop, we can use iterator method to read elements in an array
	Iterator it=list.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}

	
	}	

}
