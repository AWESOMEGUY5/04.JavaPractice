public class For03 {
    public static void main(String[] args) {
        final int BASE = 32;
        float celsius;

        for (int fahrenheit = 0; fahrenheit <= 100; fahrenheit += 10) {
            celsius = (fahrenheit - BASE) * 5.0f / 9.0f;
            System.out.printf("화씨 : %d \t 섭씨 : %.2f\n", fahrenheit, celsius);
        }
    }
}
