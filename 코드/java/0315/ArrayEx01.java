public class ArrayEx01 {
	public static void main(String[] args) {
		// 배열의 선언
		int[] arr;
		//int arr[];
		// 배열의 생성
		arr = new int[5];
		// int[] arr = new int[5];

		// 배열의 초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		// 배열의 사용
		System.out.println( arr[0] );
		// 메모리 주소 <- 참조값
		System.out.println( arr );

	}
}
