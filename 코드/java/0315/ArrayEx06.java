public class ArrayEx06 {
	public static void main(String[] args) {
		int[][][] arr =
		{
			{
				{1, 2, 3},
				{10, 20, 30}
			},
			{
				{4, 5, 6},
				{40, 50, 60}
			},
			{
				{7, 8, 9},
				{70, 80, 90}    
			}
		};
		
		// for => 향상된 for
		for( int i=0 ; i<arr.length ; i++ ) {
			for( int j=0 ; j<arr[i].length ; j++ ) {
				for( int k=0 ; k<arr[i][j].length ; k++ ) {
					System.out.println( arr[i][j][k] );
				}
			}
		}
	}
}
