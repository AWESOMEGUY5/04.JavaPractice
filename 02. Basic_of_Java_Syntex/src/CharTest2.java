public class CharTest2 {
    public static void main(String[] args) {
        char ch1 = 'h', ch2 = 'e', ch3 = 'l', ch4 = ch3, ch5 = 'o';
        // 각각 104 101 108 108 111
        System.out.println(ch1 + ch2 + ch3 + ch4 + ch5);
        System.out.println((ch1) + "" + (ch2) + "" + (ch3) + "" + (ch4) + "" + (ch5));

        System.out.println((char) (ch1 - 32) + "" +
                (char) (ch2 - 32) + "" +
                (char) (ch3 - 32) + "" +
                (char) (ch4 - 32) + "" +
                (char) (ch5 - 32));
    }
}
