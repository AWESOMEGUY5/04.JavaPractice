public class While01 {
    public static void main(String[] args) {
        int sum = 0, a = 0;
        while (a < 5){
            sum += a;
            System.out.printf("sum : %d\n", sum);
            a++;
        }
    }
}
