package datastructure;

import databases.ConnectDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class UseMap {

	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */


		//implementation here

		Map<String, String> carinfo = new HashMap<String, String>();
		carinfo.put("Make", "Toyoya");
		carinfo.put("Module", "Camery");
		carinfo.put("Year", "2010");

		System.out.println(carinfo.get("Make"));

		for (Map.Entry entry : carinfo.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}


//Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();

		List<String> hondaCars = new ArrayList<>();
		hondaCars.add("pilot");
		hondaCars.add("civic");

		List<String> toyotacars = new ArrayList<>();
		toyotacars.add("corola");
		toyotacars.add("camery");
		toyotacars.add("yaris");

		Map<String, List<String>> cars = new HashMap<>();
		cars.put("honda: ", hondaCars);
		cars.put("toyota:", toyotacars);

		System.out.println(cars.get("honda: "));

		for (Map.Entry entry : cars.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		//Use For Each loop  to retrieve data.
		System.out.println("             ");
		System.out.println("Each loop to retrieve data");
		for (Object str : cars.keySet()) {
			System.out.println("KeySet:" + str);
			for (String str1 : cars.get(str)) {
				System.out.println("Value: " + str1);
			}
		}

		//while loop with Iterator to retrieve data
		System.out.println("using while loop with Iterator to retrieve data");
		Iterator itr = cars.entrySet().iterator();

		Iterator iterator = cars.keySet().iterator();
		while (iterator.hasNext()) {
			Object values = iterator.next();
			for (String str1 : cars.get(values)) {
				System.out.println("Value: " + str1);
			}
		}

		//connect to database

	}
}
