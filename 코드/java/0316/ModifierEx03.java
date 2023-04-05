class Modifier {
	private String data;

	// 메서드를 통해서 접근
	void viewData() {
		this.data = "data";
		System.out.println( data );
	}

	// getter(출력)
	public String getData() {
		return data;
	}

	// setter(입력)
	public void setData(String data) {
		this.data = data;
	}
}

public class ModifierEx03 {
	public static void main(String[] args) {
		Modifier m = new Modifier();
		//System.out.println( m.data );		
		//m.viewData();
		m.setData( "데이터" );
		System.out.println( m.getData() );
	}
}
