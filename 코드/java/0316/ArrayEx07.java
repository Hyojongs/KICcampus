class Book {
	String title;
	String author;
	int price;

	Book( String title, String author, int price ) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
}

public class ArrayEx07 {
	public static void main(String[] args) {
		// 기본 자료형 배열
		int[] intArr = new int[3];
		intArr[0] = 10;		
		intArr[1] = 20;
		intArr[2] = 30;

		System.out.println( intArr[0] );
		System.out.println( intArr[1] );
		System.out.println( intArr[2] );

		// 참조 자료형 배열
		Book[] bookArr = new Book[3];

		Book book1 = new Book("Java", "홍길동", 1000);
		Book book2 = new Book("JSP", "박문수", 2000);
		Book book3 = new Book("Spring", "이몽룡", 3000);

		bookArr[0] = book1;
		bookArr[1] = book2;
		bookArr[2] = book3;

		System.out.println( bookArr[0].title );
		System.out.println( bookArr[0].author );
		System.out.println( bookArr[0].price );

		// 참조값
		System.out.println( bookArr[0] );
		System.out.println( book1 );

		// for
		for( int i=0 ; i<bookArr.length ; i++ ) {
			System.out.print( bookArr[i].title + "\t" );
			System.out.print( bookArr[i].author + "\t" );
			System.out.print( bookArr[i].price + "\n" );
		}

		// 향상된 for
		for( Book book : bookArr ) {
			System.out.print( book.title + "\t" );
			System.out.print( book.author + "\t" );
			System.out.print( book.price + "\n" );
		}
	}
}
