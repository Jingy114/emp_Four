// Four {Fang, Kaitlin, Jing}
// APCS Pd06
// Lab_03 Driver Class

public class SearchDriver {

	public static void binSearch(Comparable[] a, Comparable target) {
		int index = BinSearch.binSearch(a, target);
		// System.out.println(index);
	}

	public static void linSearch(Comparable[] a, Comparable target) {
		int index = LinSearch.linSearch(a, target);
		// System.out.println(index);
	}


	public static void run(Comparable[] arr, int numOfRepeats){

		// Populate array in ascending order
		for (int i = 0; i < arr.length; i ++) {
			arr[i] = i * 2;
		}

		// Helper Variables
		long sTime = 0;
		long eTime = 0;
		long binTime = 0;
		long linTime = 0;

		// Test total time to Binary Search (every element for numOfRepeats times)
		sTime = System.currentTimeMillis();
		for (int i = 0; i < arr.length; i ++) {
			for (int n = 0; n < numOfRepeats; n ++) {
				binSearch(arr, arr[i]);
			}
		}
		eTime = System.currentTimeMillis();

		binTime = eTime - sTime;
		System.out.println(binTime);

		// Test total time to Linear Search (every element for numOfRepeats times)
		sTime = System.currentTimeMillis();
		for (int i = 0; i < arr.length; i ++){
			for (int n = 0; n < numOfRepeats; n ++) {
				linSearch(arr, arr[i]);
			}
		} 
		eTime = System.currentTimeMillis();

		linTime = eTime - sTime;
		System.out.println(linTime);

	}


	public static long runReturn(Comparable[] arr, int numOfRepeats){
		
		// Populate array in ascending order
		for (int i = 0; i < arr.length; i ++) {
			arr[i] = i * 2;
		}

		// Helper Variables
		long sTime = 0;
		long eTime = 0;
		long binTime = 0;
		long linTime = 0;

		// Test total time to Binary Search (every element for numOfRepeats times)
		sTime = System.currentTimeMillis();
		for (int i = 0; i < arr.length; i ++) {
			for (int n = 0; n < numOfRepeats; n ++) {
				binSearch(arr, arr[i]);
			}
		}
		eTime = System.currentTimeMillis();

		binTime = eTime - sTime;

		// Test total time to Linear Search (every element for numOfRepeats times)
		sTime = System.currentTimeMillis();
		for (int i = 0; i < arr.length; i ++){
			for (int n = 0; n < numOfRepeats; n ++) {
				linSearch(arr, arr[i]);
			}
		} 
		eTime = System.currentTimeMillis();

		linTime = eTime - sTime;

		return binTime - linTime;
	}


	public static void runNegative(Comparable[] arr, int numOfRepeats) {

		// Populate array in ascending order
		for (int i = 0; i < arr.length; i ++) {
			arr[i] = i * 2;
		}

		// Helper Variables
		long sTime = 0;
		long eTime = 0;
		long binTime = 0;
		long linTime = 0;

		// Search for an int lower than the smallest element

		// Binary Test
		sTime = System.currentTimeMillis();
		for (int n = 0; n < numOfRepeats; n ++) {
			binSearch(arr, (int) arr[0] - 100);
		}
		eTime = System.currentTimeMillis();

		binTime = eTime - sTime;

		// Linear Test
		sTime = System.currentTimeMillis();
		for (int n = 0; n < numOfRepeats; n ++) {
			linSearch(arr, (int) arr[0] - 100);
		}
		eTime = System.currentTimeMillis();

		linTime = eTime - sTime;

		// Results
		System.out.println("Low number not present: ");
		System.out.println(binTime);
		System.out.println(linTime);

		// Search for an int not present but is within min and max

		// Binary Test
		sTime = System.currentTimeMillis();
		for (int n = 0; n < numOfRepeats; n ++) {
			binSearch(arr, (int) arr[(arr.length -1) / 2] + 1);
		}
		eTime = System.currentTimeMillis();

		binTime = eTime - sTime;

		// Linear Test
		sTime = System.currentTimeMillis();
		for (int n = 0; n < numOfRepeats; n ++) {
			linSearch(arr, (int) arr[(arr.length -1) / 2] + 1);
		}
		eTime = System.currentTimeMillis();

		linTime = eTime - sTime;

		// Results
		System.out.println("Number not present: ");
		System.out.println(binTime);
		System.out.println(linTime);

		// Search for an int higher than the largest element

		// Binary Test
		sTime = System.currentTimeMillis();
		for (int n = 0; n < numOfRepeats; n ++) {
			binSearch(arr, (int) arr[arr.length -1] + 100);
		}
		eTime = System.currentTimeMillis();

		binTime = eTime - sTime;

		// Linear Test
		sTime = System.currentTimeMillis();
		for (int n = 0; n < numOfRepeats; n ++) {
			linSearch(arr, (int) arr[arr.length -1] + 100);
		}
		eTime = System.currentTimeMillis();

		linTime = eTime - sTime;

		// Results
		System.out.println("High number not present: ");
		System.out.println(binTime);
		System.out.println(linTime);

	}


	public static void main(String[] args){
	
		System.out.println("-----------array-length-----------" + "\n" + "binary search time" + "\n" + "linear search time");
			
		System.out.println("-----------one-thousand-----------");
		Comparable[] thousand = new Comparable[1000];
		run(thousand, 1);
		
		System.out.println("-----------ten-thousand-----------");
		Comparable[] tenT = new Comparable[10000];
		run(tenT, 1);
		
		System.out.println("-----------one-hundred-thousand-----------");
		Comparable[] hundredT = new Comparable[100000];
		run(hundredT, 1);
		
		System.out.println("----------five-hundred-thousand-----------");
		Comparable[] fiveHT = new Comparable[500000];
		run(fiveHT, 1);
		
		// System.out.println("-----------one-million-----------");
		// Comparable[] mil = new Comparable[1000000];
		// run(mil, 1);
		
		/* 
		// Takes too long to run 
		System.out.println("-----------two-million-----------");
		Comparable[] fiveM = new Comparable[2000000];
		run(fiveM, 1);
		*/

		System.out.println("\n============================================");
		System.out.println("Testing for the lengths of array that linear search to be more efficient on average");

		long timeDiff = 0;

		for (int i = 0; true; i = i + 1) {
			Comparable[] array = new Comparable[i];
			timeDiff = runReturn(array, 100000);
			System.out.println("Length: " + i + "--------------");
			System.out.println("Binary Time - Linear Time = " + timeDiff);
			if (timeDiff < 0) {
				break;
			}
		}

		System.out.println("\n============================================");
		System.out.println("Testing for searching for values not in an array");

		System.out.println("\n-----------ten-----------");
		Comparable[] ten = new Comparable[10];
		runNegative(ten, 100000);

		System.out.println("\n-----------one-thousand-----------");
		runNegative(thousand, 100000);
		
		System.out.println("\n-----------ten-thousand-----------");
		runNegative(tenT, 100000);

		System.out.println("\n----------one-hundred-thousand-----------");
		runNegative(hundredT, 100000);

	}

}
