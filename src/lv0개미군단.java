import java.util.stream.IntStream;

public class lv0개미군단 {

    public static int solution1(int hp){
        int[] intArr = new int[]{5,3,1};
        int quotient = 0;
        for(int i : intArr){
            quotient += hp/i;
            hp %= i;
        }
        return quotient;
    }

    public static void main(String[] args){
        System.out.println("solution1(999) = " + solution1(999));
    }
}
