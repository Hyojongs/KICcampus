class Variable {
	String instanceVariable;
	static String classVariable;

	void doFunc1() {
		System.out.println( "doFunc1() 호출" );
		System.out.println( instanceVariable );
		System.out.println( classVariable );
	}

	static void doFunc2() {
		System.out.println( "doFunc2() 호출" );
	}
}

public class VariableEx11 {
	public static void main(String[] args) {
		
		Variable v1 = new Variable();
		Variable v2 = new Variable();

		v1.instanceVariable = "10";
		v2.instanceVariable = "20";

		//System.out.println( v1.instanceVariable );
		//System.out.println( v2.instanceVariable );
 		
		v1.doFunc1();
		v2.doFunc1();

		// 클래스 멤버 변수 - 공유데이터
		Variable.classVariable = "30";

		//System.out.println( Variable.classVariable );
		//System.out.println( Variable.classVariable );

		// 클래스 메서드
		Variable.doFunc2();
	} 
}
