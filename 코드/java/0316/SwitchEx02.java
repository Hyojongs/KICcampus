public class SwitchEx02 {
	public static void main(String[] args) {
		int jumsu = 76;
		
		switch( jumsu / 10 ) {
			case 9 :
				System.out.println( "A 학점" );
				break;
			case 8 :
				System.out.println( "B 학점" );
				break;
			case 7 :
				System.out.println( "C 학점" );
				break;
			case 6 :
				System.out.println( "D 학점" );
				break;
			default :           
				System.out.println( "F 학점" );
				break;
		}

	}
}
