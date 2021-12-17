public class SearchDriver {

	public static void main(String[] args) {

		// Testing currentTimeMillis()
		System.out.println(System.currentTimeMillis());
		System.out.println("Item 1");
		System.out.println(System.currentTimeMillis());
		for (int i = 2; i < 16; i ++) {
			System.out.println("Item " + i);
		}
		System.out.println(System.currentTimeMillis());

	}

}