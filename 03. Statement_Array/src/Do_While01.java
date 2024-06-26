public class Do_While01 {
    public static void main(String[] args) {
        int a = 0, sum = 0;

        do {
            sum += a;
            System.out.printf("sum : %d\n", sum);
            a++;
        } while (a < 5);

    }
}
