public class ArrayEx04 {
	public static void main(String[] args) {
		int[] intArr1 = new int[] { 10, 20, 30 };
		int[] intArr2 = { 10, 20, 30 };

		String[] strArr = { "aaa", "bbb", "ccc" };

 		for( int i=0 ; i<intArr2.length ; i++ ) {
			System.out.println( intArr2[i] );
		}
		
		for( int i=0 ; i<strArr.length ; i++ ) {
			System.out.println( strArr[i] );
		}

		// 향상된 for : for each
		for( int data : intArr1 ) {
			System.out.println( data );
		}

		for( String data : strArr ) {
			System.out.println( data );
		}

	}
}
