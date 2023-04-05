public class Bol01 {
    public static void main(String[] args) {
        int i1 = 7;
        int i2 = 2;
        boolean result;
        result = (i1 -= 3) > 7 && (i2 += 1) < 7;
        System.out.println(result);
        System.out.println(i1);
        System.out.println(i2);
        // result : false
        // i1 = 4
        // i2 = 2
    }
}
