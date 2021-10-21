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

		List<Integer> ar = new ArrayList<>();

		ar.add(4444);
		ar.add(2222);
		ar.add(9999);
		ar.add(8888);
		ar.add(2121);
		ar.add(6565);
		ar.add(9000);
		ar.add(1888);
		//Print Array List
		System.out.println("The elements of the ArrayList are: " + ar);

		//Using get method to peek the first element
		System.out.println("Arrays peek element: " + ar.get(0));

		//remove element from ArrayList
		System.out.println("Remove element at index 3: " + ar.remove(3));

		//Retrieving elements from ArrayList
		System.out.println("Re-retrieving elements from ArrayList: " + ar);

		// retrieving data Using forEach loop
		System.out.print("Re-retrieving elements from ArrayList: ");
		for (Integer in : ar) {
			System.out.print(" " + in);
		}
		System.out.println();

		//retrieving data using iterator
		System.out.print("Re-retrieving elements from ArrayList: ");
		Iterator it = ar.iterator();
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			System.out.print(" " + i);
		}

		System.out.println();

		Collections.sort(ar);
		System.out.println(ar);
		List list = new ArrayList();
		list = ar;

		//connect to db
	

	}

}
