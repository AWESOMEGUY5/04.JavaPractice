public class Do_While02 {
    public static void main(String[] args) {
        final int BASE = 32;
        int fahrenheit = 0;
        float celsius;

        do {
            celsius = (fahrenheit - BASE) * 5.0f / 9.0f;
            System.out.printf("화씨 : %d \t 섭씨 : %.2f\n", fahrenheit, celsius);
            fahrenheit += 10;
        } while (fahrenheit < 100);
    }
}
