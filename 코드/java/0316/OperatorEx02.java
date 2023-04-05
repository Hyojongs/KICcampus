public class OperatorEx02 {
	public static void main(String[] args) {
		int i1 = 1_000_000;
		int i2 = 2_000_000;
		//오버플로우
		//int product1 = i1 * i2;
		long product1 = (long)i1 * i2;
		System.out.println( product1 );

	}
}
