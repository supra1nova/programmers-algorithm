import java.math.BigInteger;
import java.util.Arrays;

public class lv0구슬을나누는경우의수 {
    public static BigInteger solution1(int balls, int share){
        BigInteger[] ballsArr = new BigInteger[balls];
        BigInteger[] shareArr = new BigInteger[share];
        BigInteger[] gapArr = balls-share > 0 ? new BigInteger[balls-share] : new BigInteger[1];
        for(int i = 0 ; i < balls; i++){
            ballsArr[i] = BigInteger.valueOf(i+1);
        }
        for(int i = 0; i < share; i++){
            shareArr[i] = BigInteger.valueOf(i+1);
        }
        for(int i = 0; i < gapArr.length; i++){
            gapArr[i] = BigInteger.valueOf(i+1);
        }
        return Arrays.stream(ballsArr).reduce((l, r) -> l.multiply(r)).get().divide((Arrays.stream(gapArr).reduce((l, r) -> l.multiply(r)).get()).multiply(Arrays.stream(shareArr).reduce((l, r) -> l.multiply(r)).get()));
    }

    public static long solution2(int balls, int share) {
        share = Math.min(balls - share, share);

        if (share == 0)
            return 1;

        long result = solution2(balls - 1, share - 1);
        result *= balls;
        result /= share;

        return result;
    }
    public static void main(String[] args){
        System.out.println("solution1(3,2) = " + solution1(3, 2));
        System.out.println("solution1(5,3) = " + solution1(5, 3));
        System.out.println("solution1(3,3) = " + solution1(3, 3));
        System.out.println("solution1(10,5) = " + solution1(10, 5));
        System.out.println("solution1(20,10) = " + solution1(20, 10));
        System.out.println("solution1(30,15) = " + solution1(30, 15));

        System.out.println("solution2(30,15) = " + solution2(30, 15));
    }
}
