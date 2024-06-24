public class LogicalTest {
    public static void main(String[] args) {
        int a = 0, b = 10, c = 0;

        System.out.println((a != 0) && ((c = b) > 20)); // 단축 계산
        System.out.println("c : " + c);
        System.out.println((a != 0) & ((c = b) > 20));
        System.out.println("c : " + c);

        c = 0;
        System.out.println((a == 0) || ((a = b) > 20));
        System.out.println("c : " + c);

        System.out.println((a == 0) | ((a = b) > 20));
        System.out.println("c : " + c);
    }
}
