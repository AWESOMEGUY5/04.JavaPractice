public class IF07 {
    public static void main(String[] args) {
        int score = 89, category = score / 10;
        char credit;

        if ((score >= 0) && (score <= 100)) {
            if (category == 10 || category == 9) {
                credit = 'A';
                System.out.printf("학점 : %c", credit);
            } else if (category == 8) {
                credit = 'B';
                System.out.printf("학점 : %c", credit);
            } else if (category == 7) {
                credit = 'C';
                System.out.printf("학점 : %c", credit);
            } else if (category == 6) {
                credit = 'D';
                System.out.printf("학점 : %c", credit);
            } else if (category <= 5) {
                credit = 'F';
                System.out.printf("학점 : %c", credit);
            }
        }
    }
}
