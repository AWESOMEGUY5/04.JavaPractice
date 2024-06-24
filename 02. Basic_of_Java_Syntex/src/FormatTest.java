public class FormatTest {
    public static void main(String[] args) {
        String sValue = "한장수";
        int nValue = 534;
        long lValue = 543L;
        float fValue = 6.5E5f;
        double dValue = 3.14159265358979E10d;
        System.out.println("< String 형 >");
        System.out.printf("%s 입니다.\n", sValue);

        System.out.println("< int 형 >");
        System.out.printf("%d\n", nValue);
        System.out.printf("%5d\n", nValue);
        System.out.printf("%05d\n", nValue);

        System.out.println("< long 형 >");
        System.out.printf("%d\n", lValue);
        System.out.printf("%5d\n", lValue);
        System.out.printf("%05d\n", lValue);

        System.out.println("< float 형 >");
        System.out.printf("%f\n", fValue);
        System.out.printf("%5.5f\n", fValue);
        System.out.printf("%05.05f\n", fValue);

        System.out.println("< double 형 >");
        System.out.printf("%f\n", dValue);
        System.out.printf("%5.5f\n", dValue);
        System.out.printf("%05.05f\n", dValue);
    }
}
