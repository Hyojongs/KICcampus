public class ex01 {
    public static void main(String[] args) {
        // 자동형변환
        short s1 = 10;
        int i1 = s1;
        System.out.println(i1); // 10

        float f1 = 0.4f;
        double d1 = f1;
        System.out.println(d1); // 0.4000000059604645

        char c1 = 'A';
        int i2 = c1;
        System.out.println(i2); // 97

        // 명시적형변환

        int i3 = 30;
        short s2 = (short) i3; // 메모리 할당크기가 더 작기에 명시적형변환 해야함
        System.out.println(s2); // 30

        char c2 = 'A';
        int i4 = c2 + 3;
        System.out.println((char) i4);

    }
}
