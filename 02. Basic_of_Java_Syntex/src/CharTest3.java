public class CharTest3 {
    public static void main(String[] args) {
        char ch1 = 'H', ch2 = 'e', ch3 = 'l', ch4 = ch3, ch5 = 'o';
        System.out.println((ch1) + "" + (ch2) + "" + (ch3) + "" + (ch4) + "" + (ch5) + "");
        System.out.println((ch1) + "\n" + (ch2) + "\n" + (ch3) + "\n" + (ch4) + "\n" + (ch5));
        System.out.println((ch1) + "\t" + (ch2) + "\t" + (ch3) + "\t" + (ch4) + "\t" + (ch5));
        System.out.println((ch1) + "\r" + (ch2) + "\r" + (ch3) + "\r" + (ch4) + "\r" + (ch5));
        System.out.println((ch1) + "\\" + (ch2) + "\\" + (ch3) + "\\" + (ch4) + "\\" + (ch5));
        System.out.println("\'" + (ch1) + "" + (ch2) + "" + (ch3) + "" + (ch4) + "" + (ch5)+"\'");
        System.out.println("\"" + (ch1) + "" + (ch2) + "" + (ch3) + "" + (ch4) + "" + (ch5) + "\"");
    }
}
