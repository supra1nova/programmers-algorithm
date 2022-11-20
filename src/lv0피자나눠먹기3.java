public class lv0피자나눠먹기3 {
    public static int solution1(int slice, int n){
        return n%slice != 0 ? n/slice + 1 : n/slice;
    }

    public static void main(String[] args){
        System.out.println("solution1(7, 10) = " + solution1(7, 10));
        System.out.println("solution1(4, 12) = " + solution1(4, 12));
    }
}
