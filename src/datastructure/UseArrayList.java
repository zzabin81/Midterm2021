package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;


public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

        //implementation here
		List<Integer> ir = new ArrayList<>();
		ir.add(3333);
		ir.add(1111);
		ir.add(5555);
		ir.add(6666);
		ir.add(2121);
		ir.add(6565);
		ir.add(9090);
		ir.add(5899);
		//Print Array List
		System.out.println("The elements of the ArrayList are: " + ir);

		//Using get method to peek the first element
		System.out.println("Arrays peek element: " + ir.get(0));

		//remove element from ArrayList
		System.out.println("Remove element at index 3: " + ir.remove(3));

		//Retrieving elements from ArrayList
		System.out.println("Re-retrieving elements from ArrayList: " + ir);

		// retrieving data Using forEach loop
		System.out.print("Re-retrieving elements from ArrayList: ");
		for (Integer in : ir) {
			System.out.print(" " + in);
		}
		System.out.println();

		//retrieving data using iterator
		System.out.print("Re-retrieving elements from ArrayList: ");
		Iterator it = ir.iterator();
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			System.out.print(" " + i);
		}

		System.out.println();

		Collections.sort(ir);
		System.out.println(ir);
		List value = new ArrayList();
		value = ir;

		//connect to db
	

	}

}
