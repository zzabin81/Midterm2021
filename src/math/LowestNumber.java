package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		//implementation here...
		//an array
		int[] arr = {33, 67, 22, 59, 15, 44};
		//initialize with the largest possible value
		int lowest = Integer.MAX_VALUE;
		//find the lowest number of array
		int i = 0;
		    while(i<arr.length) {
			//check if the lowest number is greater than element
			if(lowest>arr[i]) {
				//update the lowest number
				lowest=arr[i];
			}
			i++;
		}
		System.out.println("The lowest number is : "+ lowest);
	}
}





