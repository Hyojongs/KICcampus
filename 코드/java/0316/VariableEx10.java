class Variable {
	// 인스턴스 멤버 변수
	String instanceVariable;
	// 클래스 멤버 변수
	static String classVariable;

	void doFunc() {
		int localVariable = 20;
		System.out.println( localVariable );
	}
}

public class VariableEx10 {
	// 메인 메서드
	public static void main(String[] args) {
		// 지역변수
		int localVariable = 10;
		System.out.println( localVariable );

		Variable v = new Variable();
		v.instanceVariable = "10";
		System.out.println( v.instanceVariable );

		//v.classVariable = "20";
		//System.out.println( v.classVariable );

		Variable.classVariable = "30";
		System.out.println( Variable.classVariable );
	}
}
