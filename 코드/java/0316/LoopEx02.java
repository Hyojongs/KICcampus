public class LoopEx02 {
	public static void main(String[] args) {
		for( int i=0 ; i<=9 ; i++ ) {
			for( int j=65 ; j<=65+i ; j++ ) {
				System.out.print( (char)j );
			}
			System.out.println();
		}
	}
}
