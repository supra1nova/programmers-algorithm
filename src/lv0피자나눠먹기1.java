public class lv0피자나눠먹기1 {
    public static int solution1(int n){
        return n % 7 > 0 ? n / 7 + 1 : n/7;
    }
    public static void main(String[] args){
        System.out.println("solution1(15) = " + solution1(15));
    }
}
