public class While02 {
    public static void main(String[] args) {
        final int BASE = 32;
        int fahrenheit = 0;
        float celsius = 0f;

        while (fahrenheit <= 100) {
            celsius = (fahrenheit - BASE) * 5.0f / 9.0f;
            System.out.printf("화씨 : %d \t 섭씨 : %.2f\n", fahrenheit, celsius);
            fahrenheit+=10;
        }
    }
}
