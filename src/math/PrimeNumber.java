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
		int k = 0;
		int num = 0;
		String primeNumbers = "";

		for (k = 1; k < 100000; k++) { //k could not print up to 1 million
			//k could not print up to 1 million my System keep runing
			int value = 0;
			for (num = k; num >=1; num--){
				if(k%num == 0){
					value = value+1;
				}
			}
			if (value == 2){
				primeNumbers = primeNumbers + k + " ";
			}
		}
		System.out.println("prime numbers are: ");
		System.out.println(primeNumbers);

	}

}



