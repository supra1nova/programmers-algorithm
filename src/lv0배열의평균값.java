import java.util.Arrays;

public class lv0배열의평균값 {
    public static double solution1(int[] numbers){
//        return Arrays.stream(numbers).reduce((x, y) -> x + y).getAsInt()/ (double) numbers.length;
        return Arrays.stream(numbers).reduce(Integer::sum).getAsInt()/ (double) numbers.length;
    }

    public static double solution2(int[] numbers){
        return Arrays.stream(numbers).average().orElse(0);
    }

    public static void main(String[] args){
        int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] b = new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        System.out.println("solution1(a) = " + solution1(a));
        System.out.println("solution1(b) = " + solution1(b));

        System.out.println("solution1(a) = " + solution2(a));
        System.out.println("solution1(b) = " + solution2(b));
    }
}
