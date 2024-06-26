public class IF06 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 15;

        if (num1 % 2 == 0)
            if (num1 % 5 == 0)
                System.out.printf("%d은 2의 배수이고 5의 배수이다.\n", num1);
            else
                System.out.printf("%d는 2의 배수이나 5의 배수는 아니다.", num1);
        else
            System.out.printf("%d는 2의 배수가 아니다.", num1);

        if (num2 % 2 == 0 && num1 % 5 == 0)
            System.out.printf("%d은 2의 배수이고 5의 배수이다.\n", num2);
        else if (num2 % 2 != 0 && num2 % 5 == 0)
            System.out.printf("%d는 2의 배수가 아니나 5의 배수이다.", num2);
        else if (num2 % 2 == 0 && num2 % 5 != 0)
            System.out.printf("%d는 2의 배수이나 5의 배수는 아니다.", num2);
        else
            System.out.printf("%d는 2의 배수가 아니고 5의 배수도 아니다.", num2);

    }
}
