public class Array02 {
    public static void main(String[] args) {
        int[] num = new int[5];
        char[] chars = {'a','b','c','d','e'};
        int result = 0;

        for (int i = 0; i < 5; i++) {
            num[i] = i;
            System.out.printf("num[%d] = %d\n", i, i);
        }
        for (int j = 0; j < 5; j++)
            result = result + num[j];
        System.out.printf("num 배열의 총합은 %d\n", result);

        for (int a = 0; a < 5; a++)
            System.out.printf("chars[%d] = %c\n", a, chars[a]);

    }
}
