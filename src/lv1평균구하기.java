import java.util.Arrays;

public class lv1평균구하기 {
    public static double solution1(int[] arr){
        return Arrays.stream(arr).average().getAsDouble();
    }
    public static void main(String[] args) {
        System.out.println("solution1(new int[]{1,2,3,4}) = " + solution1(new int[]{1, 2, 3, 4}));
        System.out.println("solution1(new int[]{5,5}) = " + solution1(new int[]{5,5}));
    }
}
