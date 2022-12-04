public class lv1정제곱근판별 {
    public static long solution1(long n){
        return Math.sqrt(n) - Math.floor(Math.sqrt(n)) != 0 ? -1 : (long) Math.pow(Math.sqrt(n) + 1, 2);
    }

    public long solution2(long n) {
        return Math.pow((int)Math.sqrt(n), 2) == n ? (long) Math.pow(Math.sqrt(n) + 1, 2) : -1;
    }

    public static void main(String[] args) {
        System.out.println("solution1(111) = " + solution1(121));
    }
}
