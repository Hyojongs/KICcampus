class Constructor {
	String data1;
	String data2;

	Constructor() {
		//this.data1 = "10";
		//this.data2 = "20";
		//System.out.println( "data1 : " + this.data1 );
		//System.out.println( "data2 : " + this.data2 );
		//System.out.println( "시작" );
		this( "10", "20" );
		// 생성자는 메서드처럼 호출 불가능
		//Constructor( "10", "20" );
	}

	Constructor(String data1) {
		//this.data1 = data1;
		//this.data2 = "20";
		//System.out.println( "data1 : " + this.data1 );
		//System.out.println( "data2 : " + this.data2 );
		this( data1, "20" );
	}

	Constructor(String data1, String data2) {
		this.data1 = data1;
		this.data2 = data2;
		System.out.println( "data1 : " + this.data1 );
		System.out.println( "data2 : " + this.data2 );
	}

}
public class ConstructorEx03 {
	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor("10");
		Constructor c3 = new Constructor("10", "20");
	}
}
