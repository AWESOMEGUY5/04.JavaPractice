import static java.lang.Math.pow;

public class IF05 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 1;

        double result = (pow(b, 2) - 4 * a * c);

        if (result > 0)
            System.out.print("방정식은 두 실근을 가집니다.");
        else if (result == 0)
            System.out.print("방정식은 중근을 가집니다.");
        else if(result < 0)
            System.out.print("방정식은 두 허근을 가집니다.");
    }
}
