
class Util {
    int viewMaxNumber( int value1, int value2, int value3 ) {
        int value = 0;

        if( value1 >= value2 && value1 >= value3 ) {
            value = value1;
        } else if( value2 >= value3 && value2 >= value1 ) {
            value = value2;
        } else if( value3 >= value1 && value3 >= value2 ) {
            value = value3;
        }
        return value;
    }

	int doCalculator(int num1, String oper, int num2) {
		int result = 0;

		switch( oper ) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "x":
			result = num1 * num2;
			break;
		}
		System.out.println( num1 + " " + oper + " " + num2 
		+ " = " + result );
		
		return result;

	}
}

public class MainEx02 {
	public static void main(String[] args) {
		Util util = new Util();
		int result = util.viewMaxNumber( 20, 10, 30 );
		System.out.println( "최고값 : " + result );
	}
}
