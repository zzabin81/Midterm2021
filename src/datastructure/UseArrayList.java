package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> car = new ArrayList<String>();
		car.add("Blue");
		car.add("AC");
		car.add("ABS");
		car.add("Turbo");

		System.out.println("car features = " + car);

		for (int a = 1; a < 3; a++) {
			System.out.println("features on index 1 and 2 = " + car.get(a));
		}
		//connect to db

		Iterator<String> iterator = car.iterator();
		System.out.println(iterator.next());
		System.out.println(iterator.hasNext());

		while (iterator.hasNext())
			System.out.println("from while loop = " + iterator.next());

		for (Object x : car) {
			System.out.println(x);
		}
	

	}

}
