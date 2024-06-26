public class For07 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.printf("i = %d\n", i);
            for (int j = 0; j < 5; j++) {
                if (j == 2)
                    break;
                System.out.printf("j = %d\n", j);
            }
            System.out.println();
        }
    }
}
