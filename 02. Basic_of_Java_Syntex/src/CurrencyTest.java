public class CurrencyTest {
    public static void main(String[] args) {
        int won = 500_000, rate = 1_320;
        float dollar;

        dollar = won / rate;
        System.out.printf("%d 원에 대한 달러는 %.2f 달러\n", won, dollar);  // 소숫점 버림으로 인한 원본 손실

        dollar = (float) won / (float) rate;
        System.out.printf("%d 원에 대한 달러는 %.2f 달러\n", won, dollar);

        won = (int) dollar * rate;
        System.out.printf("%.2f 달러에 대한 원은 %d 원\n", dollar, won);    //  소숫점 버림으로 인한 원본 손실

        won = (int) (dollar * rate);
        System.out.printf("%.2f 달러에 대한 원은 %d 원\n", dollar, won);
    }
}
