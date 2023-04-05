public class VariableEx04 {
	public static void main(String[] args) {
		// char		- 문자(한자)		- ''
		// String	- 문자열(여러자)	= ""

		char c1 = 'a';
		char c2 = 'b';

		System.out.println( c1 );

		// ascii - 영문자, 숫자, 특수기호
		char c3 = 97 + 1;
		System.out.println( c3 );

		// 유니코드 - 다국어
		char c4 = '\uc790';
		System.out.println( c4 );

		// 특수문자
		// \n 엔터, \t 탭
		char e1 = 'a';
		char e2 = '\t';
		char e3 = 'b';

		System.out.print( e1 );
		System.out.print( e2 );
		System.out.print( e3 );

	}
}
