public class DataConversionTest {
    public static void main(String[] args) {
        byte bVar1 = 12, bVar2 = 17;
        byte bVar3 = (byte) (bVar1 + bVar2);
        System.out.printf("bVar3 : %d\n", bVar3);

        short sVar1 = 15, sVar2 = 25;
        short sVar3 = (short) (sVar1 + sVar2);
        System.out.printf("sVar3 : %d\n", sVar3);

        int i1 = 45, i2 = 56;
        int i3 = i1 + i2;
        System.out.printf("i3 : %d\n", i3);

        double d1 = 3.141592, d2 = 1.414;
        double d3 = d1 + d2;
        System.out.printf("d3 : %f", d3);
    }
}
