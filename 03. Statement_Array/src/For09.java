public class For09 {
    public static void main(String[] args) {
        label:
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (j==2) continue label;
                System.out.printf("j = %d\n", j);
            }
            System.out.println();
        }
    }
}
