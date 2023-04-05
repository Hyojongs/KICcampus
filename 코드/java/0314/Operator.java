public class Operator {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        int sum1 = i1 + i2;
        System.out.println(sum1);

        short s1 = 10;
        short s2 = 20;
        // short sum2 = s1 + s2; // error 발생
        int sum2 = s1 + s2;
        short sum3 = (short) (s1 + s2);
        System.out.println(sum2 + "\t" + sum3);

        int i3 = 1_000_000;
        long l1 = 2_000_000;
        long pro = i3 * l1;
        System.out.println(pro);

    }
}
