class Address {
	String hakbun;
	String name;
	String phone;

	Address( String hakbun, String name, String phone ) {
		this.hakbun = hakbun;
		this.name = name;
		this.phone = phone;
	}
}

public class ArrayEx08 {
	public static void main(String[] args) {
		String[][] addressArr
			= new String[][] {	
				{ "1001", "홍길동" , "001-111-1111" },
				{ "1002", "박문수" , "001-222-2222" },
				{ "1003", "이몽룡" , "001-333-3333" }
			};

		// for
		for( int i=0 ; i<addressArr.length ; i++ ) {
			System.out.print( addressArr[i][0] + "\t" );
			System.out.print( addressArr[i][1] + "\t" );
			System.out.print( addressArr[i][2] + "\n" );
		}

		/*
		Address address1  = new Address("1001", "홍길동" , "001-111-1111");
		Address address2  = new Address("1002", "박문수" , "001-222-2222");
		Address address3  = new Address("1003", "이몽룡" , "001-333-3333");
 		*/

		Address[] addressArr2 = new Address[3];
		addressArr2[0] = new Address("1001", "홍길동" , "001-111-1111");
		addressArr2[1] = new Address("1002", "박문수" , "001-222-2222");
		addressArr2[2] = new Address("1003", "이몽룡" , "001-333-3333");

		// for
		for( Address address : addressArr2 ) {
			System.out.print( address.hakbun + "\t" );
			System.out.print( address.name + "\t" );
			System.out.print( address.phone + "\n" );
		}


	}
}
