public class Switch01 {
    public static void main(String[] args) {
        int num = 2;
        String name = "한장수";

        switch (num) {
            case 1:
                System.out.printf("num 의 값은 %d", num);
                break;
            case 2:
                System.out.printf("num 의 값은 %d\n", num);
                break;
            case 3:
                System.out.printf("num 의 값은 %d\n", num);
                break;
            default:
                System.out.print("일치하는 값이 없습니다.\n");

        }

        switch (name) {
            case "한정수":
                System.out.printf("이름은 %s\n", name);
                break;
            case "한장수":
                System.out.printf("이름은 %s\n", name);
                break;
            default:
                System.out.print("일치하는 값이 없습니다.\n");
        }
    }
}
