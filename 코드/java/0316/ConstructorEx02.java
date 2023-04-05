class Constructor {
	String data1;

	// overloading
	Constructor() {
		this.data1 = "10";
		System.out.println( "data1 : " + this.data1 );
	}

	Constructor(String data1) {
		this.data1 = data1;
		System.out.println( "data1 : " + this.data1 );
	}

}
public class ConstructorEx02 {
	public static void main(String[] args) {
		Constructor c1 = new Constructor( "20" );
		Constructor c2 = new Constructor( );

	}
}
