public class IF08 {
    public static void main(String[] args) {
        int taxRate, landHolding = 25000, landHoldingTime = 5;
        double discount = 0;
        boolean landClass = false;


        if (landClass == true) {
            System.out.print("건물이 있는 토지\n");// 건물이 있는 토지
            if (landHolding <= 1_000)
                taxRate = 3_600;
            else if (landHolding <= 2_500)
                taxRate = 4_000;
            else
                taxRate = 6_000;
        } else {
            System.out.print("건물이 없는 토지\n"); // 건물이 없는 토지
            if (landHolding <= 1_000)
                taxRate = 1_800;
            else if (landHolding <= 2_500)
                taxRate = 2_000;
            else
                taxRate = 3_000;
        }
        double area_tax = taxRate * landHolding;
        System.out.printf("토지 면적 세액 : %.0f원\n", area_tax);
        if (landHoldingTime < 3 || landHoldingTime <= 12) {
            discount = area_tax * ((5.0 / 100.0) * (landHoldingTime - 2));
        }
        System.out.printf("연간 토지세 : %.0f원\n", area_tax - discount);
        System.out.printf("최종 토지 보유세 : %.0f원\n", area_tax - discount + area_tax * 0.3);

    }
}
