public class DataTypeTest {
    public static void main(String[] args) {
        byte b = 100;
        short s = 120;
        int num = 25000;

        System.out.printf("b의 값은 %d\n", b);
        System.out.printf("s의 값은 %d\n", s);
        System.out.printf("num의 값은 %d\n", num);

        System.out.printf("< 오버플로우 > \n");
        System.out.printf("b의 값은 %d\n", (byte)(b+100));
        System.out.printf("s의 값은 %d\n", (short)(s+32767));
        System.out.printf("num의 값은 %d\n", num + 2147483647);
    }
}
