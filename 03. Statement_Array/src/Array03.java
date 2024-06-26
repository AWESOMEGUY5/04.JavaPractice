public class Array03 {
    public static void main(String[] args) {
        int[] num = new int[5];
        char[] chars = new char[5];
        int result = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = i;
            System.out.printf("num[%d] = %d\n", i, i);
        }
        for (int j = 0; j < num.length; j++)
            result = result + num[j];
        System.out.printf("num 배열의 총합은 %d\n", result);

        for (int a = 0; a < chars.length; a++){
            chars[a] = (char)(97 + a);
            System.out.printf("chars[%d] = %c\n", a, chars[a]);
        }


    }
}

