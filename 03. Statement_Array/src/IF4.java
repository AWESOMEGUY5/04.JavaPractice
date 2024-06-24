public class IF4 {
    public static void main(String[] args) {
        int a = 4, b = 5, c = 0;

        if (a > b) {
            System.out.println("a는 b보다 큽니다.");
            System.out.printf("a의 값은 %d", a);
        } else if (b > 0) {
            System.out.println("b는 0보다 큽니다.");
            System.out.printf("b의 값은 %d", b);
        } else {
            System.out.println("모든 조건식이 거짓입니다.");
        }
    }
}
