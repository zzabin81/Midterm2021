package math;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		//implementation here...
		int i = 0;
		int num = 0;
		String primeNumbers = "";

		for (i = 1; i < 100000; i++) { //i could not print up to 1 million
			//i could not print up to 1 million my System keep runing
			int counter = 0;
			for (num = i; num >=1; num--){
				if(i%num == 0){
					counter = counter+1;
				}
			}
			if (counter == 2){
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("prime numbers are: ");
		System.out.println(primeNumbers);

	}

}



