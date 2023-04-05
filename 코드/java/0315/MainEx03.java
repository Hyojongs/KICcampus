class MethodEx {
	// 같은 이름 두 개의 메서드는 선언이 안됨
	// 허용 - 파라메터의 종류 / 갯수 / 순선
	// 메서드 중복정의 : overloading
	void doFunc(int a) {
		System.out.println( "doFunc(int a) 호출" );
	}

	void doFunc(String s) {
		System.out.println( "doFunc(String s) 호출" );
	}

	void doFunc(String s, int a) {
		System.out.println( "doFunc(String s, int a) 호출" );
	}

	void doFunc(int a, String s) {
		System.out.println( "doFunc(int a, String s) 호출" );
	}
}

public class MainEx03 {
	public static void main(String[] args) {
		MethodEx ex = new MethodEx();
		ex.doFunc( 10 );
		ex.doFunc( "10" );
		ex.doFunc( "10", 10 );
		ex.doFunc( 10, "10" );
	}
}
