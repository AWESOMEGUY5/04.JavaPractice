public class CircleTest {
    public static void main(String[] args) {
        int radius = 5;

        float PI = 3.14159f;
        float circus = 2 * PI * radius;
        float area = PI * radius * radius;
        System.out.printf("반지름이 %d인 원의 둘레 : %g, 면적 : %g\n", radius, circus, area);

        radius = 10;
        circus = 2 * PI * radius;
        area = PI * radius * radius;
        System.out.printf("반지름이 %d인 원의 둘레 : %g, 면적 : %g\n", radius, circus, area);
    }
}
