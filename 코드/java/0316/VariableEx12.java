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
		//System.out.println( instanceVariable );
		System.out.println( classVariable );
	}
}

public class VariableEx12 {
	public static void main(String[] args) {
		/*
		Variable v1 = new Variable();
		Variable v2 = new Variable();

		v1.instanceVariable = "10";
		v2.instanceVariable = "20";

		Variable.classVariable = "30";

		v1.doFunc1();
		v2.doFunc1();
		*/

		Variable.classVariable = "30";
		Variable.doFunc2();
	}
}
