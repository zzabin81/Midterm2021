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

		Queue<String> letters = new LinkedList<>();
		letters.add("A");
		letters.add("B");
		letters.add("C");
		letters.add("D");

		System.out.println(letters);

		letters.add("E");
		System.out.println("letter E added : "+letters);

		System.out.println("letter peeked : "+letters.peek());

		letters.remove();
		System.out.println("letter A removed : "+letters);

		letters.poll();
		System.out.println("letter B polled : "+letters);

		//for loop
		for(String string : letters ){
			System.out.println(string);
		}

		//iterator
		Iterator iterator = letters.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
