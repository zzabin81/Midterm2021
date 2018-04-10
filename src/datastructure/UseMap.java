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


				List<String> windows = new ArrayList();
				windows.add("vista");
				windows.add("Windows 7");
				windows.add("XP");

				List<String> android = new ArrayList();
				android.add("Lollipop");
				android.add("Marshmallow");
				android.add("Nougat");

				List<String> iOS = new ArrayList();
				iOS.add("Durango");
				iOS.add("Telluride");
				iOS.add("Hoodoo");


				Map<String, List<String>> map = new HashMap<String,List<String>>();
				map.put("Microsoft", windows);
				map.put("Google", android);
				map.put("Apple", iOS);

				//for each loop
				for(Map.Entry key: map.entrySet()){
					System.out.println(key.getKey()+" "+key.getValue()+"\n");
				}

				//Iterator with for loop

				Iterator it =map.entrySet().iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}

			}

		}



