public class BoxTest {
    static int width, height, depth; // 인스턴스 변수

    public static void main(String[] args) {
        int w = 5, h = 5, d = 5;

        System.out.printf("박스의 부피는 %d 입니다.", calcVolume(w, h, d));
    }

    public static int calcVolume(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
        return width * height * depth;
    }
}
