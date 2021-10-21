package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */

		//implementation here

		Queue<String> queue = new LinkedList<>();
		queue.add("school");
		queue.add("academy");
		queue.add("education");
		queue.add("university");
		queue.add("campus");

		queue.remove("school");
		queue.add("college");

		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(" ");
		System.out.println("while loop method to retrieve data: ");
		Iterator itrat = queue.iterator();
		while (itrat.hasNext()) {
			String z = (String) itrat.next();
			System.out.println(z);
		}
		System.out.println(" ");
		System.out.println("for each loop method to retrieve data: ");
		for (String a : queue) {
			System.out.println(a);
		}


	}

}