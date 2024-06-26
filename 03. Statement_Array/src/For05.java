public class For05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                if (i == 3)
                    break;
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
