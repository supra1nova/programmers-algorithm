public class lv0제곱수판별하기 {
    public static int solution1(int n){
        return Math.sqrt(n) - (int)Math.sqrt(n) == 0 ? 1 : 2;
    }

    public static int solution2(int n) {
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }

    public static void main(String[] args) {
        System.out.println("solution1(144) = " + solution1(144));
        System.out.println("solution2(976) = " + solution2(976));
    }
}
