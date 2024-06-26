public class Break02 {
    public static void main(String[] args) {
        final int BASE = 32;
        float celsius;

        for(int fahrenheit = 0; fahrenheit <= 100; fahrenheit+=10){
            celsius = (fahrenheit - BASE) * 5.0f/ 9.0f;
            if (fahrenheit == 50)
                break;
            System.out.printf("섭씨 : %.2f\t 화씨 : %d\n", celsius, fahrenheit);
        }
    }
}
