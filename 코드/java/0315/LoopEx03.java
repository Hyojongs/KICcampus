public class LoopEx03 {
	public static void main(String[] args) {
		for( int i=1 ; i<=9 ; i++ ) {
			System.out.print( i + "단 : " );
			for( int j=1 ; j<=9 ; j++ ) {
				//System.out.print( i + " * " + j + " = " + (i * j) + "\t" );
				System.out.printf( "%s * %s = %s\t", i, j, (i * j) );
			}
			System.out.println();
;		}
	}
}
