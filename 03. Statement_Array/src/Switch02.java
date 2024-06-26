public class Switch02 {
    public static void main(String[] args) {
        int score = 89, category = score / 10;
        char credit;

        if ((score >= 0) && (score <= 100)) {
            switch (category) {
                case 10:
                    credit = 'A';
                    System.out.printf("학점 : %s", credit);
                    break;
                case 9:
                    credit = 'A';
                    System.out.printf("학점 : %c\n", credit);
                    break;
                case 8:
                    credit = 'B';
                    System.out.printf("학점 : %c\n", credit);
                    break;
                case 7:
                    credit = 'C';
                    System.out.printf("학점 : %c\n", credit);
                    break;
                case 6:
                    credit = 'D';
                    System.out.printf("학점 : %c\n", credit);
                    break;
                default:
                    credit = 'F';
                    System.out.printf("학점 : %c\n", credit);
            }
            System.out.printf("시험 점수 : %d, 학점 : %c\n", score, credit);
        } else
            System.out.print("시험점수가 잘못 입력되었습니다.");
    }
}
