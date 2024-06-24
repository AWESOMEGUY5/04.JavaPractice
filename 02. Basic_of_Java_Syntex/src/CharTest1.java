public class CharTest1 {
    public static void main(String[] args) {
        char ch1 = 'a';
        int num = 97;

        System.out.printf("ch의 값 : %c, 아스키코드 : %d\n", ch1, (int)ch1);
        System.out.printf("num의 값 : %d, 아스키코드 : %c\n", num, (char) num);

        System.out.printf("ch + 1의 값 : %c\n", (char) (ch1 + 1));
        System.out.printf("num + 1의 값 : %d\n", (char) num + 1);
    }
}
