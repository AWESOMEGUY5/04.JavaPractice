public class VarTest3 {
    public static void main(String[] args) {
        String name = "한장수", address = "경기도 양평군";
        boolean isBoolean = true;

        address = "서울특별시 구로구";
        System.out.println(name + "의 실제 주소는 " + address + "입니다.\n");
        System.out.println("isBoolean의 값은 " + isBoolean + "입니다.");

        isBoolean = false;
        System.out.println("isBoolean의 값은 " + isBoolean + "입니다.");
    }
}
