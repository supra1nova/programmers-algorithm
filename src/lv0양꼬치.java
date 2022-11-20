public class lv0양꼬치 {
    public static int solution1(int n, int k){
        int bonus = n >= 10 ? n / 10 : 0;
        return 12000 * n + 2000 * (k - bonus);
    }

    public static void main(String[] args){
        System.out.println("solution1(10,3) = " + solution1(64, 6));
    }
}
