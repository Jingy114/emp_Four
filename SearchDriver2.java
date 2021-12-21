public class SearchDriver2 {

	public static double mean(long[] a) {
		long sum = 0;
		for (int i = 0; i < a.length; i ++) {
			sum += a[i];
		}
		return ((double) sum) / a.length;
	}

	public static int binSearch(Comparable[] a, Comparable target) {
		return BinSearch.binSearch(a, target);
	}

	public static int linSearch(Comparable[] a, Comparable target) {
		return LinSearch.linSearch(a, target);
	}

  public static void run(Comparable[] arr){
	// Populate array in ascending order
	for (int i = 0; i < arr.length; i ++) {
		arr[i] = i * 2;
	}

	// Temporary Variables
	long sTime = 0;
	long eTime = 0;
	int foundIndex = 0;

	// Test average time to Binary Search
	sTime = System.currentTimeMillis();
	for (int i = 0; i < arr.length; i ++) {
		//sTime = System.currentTimeMillis();
		foundIndex = binSearch(arr, arr[i]);
		//eTime = System.currentTimeMillis();
		//timesBin[i] = eTime - sTime;
	}
	eTime = System.currentTimeMillis();

	System.out.println(eTime - sTime);

	//System.out.println(mean(timesBin));

	// Test avg time to Linear Search
	sTime = System.currentTimeMillis();
	for (int i = 0; i < arr.length; i ++) {
		//sTime = System.currentTimeMillis();
		foundIndex = linSearch(arr, arr[i]);
		//eTime = System.currentTimeMillis();
		//timesLin[i] = eTime - sTime;
	} 
	eTime = System.currentTimeMillis();
	System.out.println(eTime - sTime);
	//System.out.println(mean(timesLin));

  }


	public static void main(String[] args){
	
	System.out.println("-----------thousand-----------");
	Comparable[] thousand = new Comparable[1000];
	run(thousand);
		
// 	Comparable[] tenT = new Comparable[10000];
// 	System.out.println(run(thousand));
		
// 	Comparable[] hundredT = new Comparable[100000];
// 	System.out.println(run(thousand));
	
// 	Comparable[] fiveHT = new Comparable[500000];
// 	System.out.println(run(thousand));
	
// 	Comparable[] mil = new Comparable[1000000];
// 	System.out.println(run(thousand));
	
// 	Comparable[] fiveM = new Comparable[5000000];
// 	System.out.println(run(thousand));
	

	}

}
