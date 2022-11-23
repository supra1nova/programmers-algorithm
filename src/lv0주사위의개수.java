import java.util.Arrays;

public class lv0주사위의개수 {

    public static int solution1(int[] box, int n){
        return Arrays.stream(box).map(i -> i / n).reduce((l, r) -> l*r).getAsInt();
    }

    public static int solution2(int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }

    public static void main(String[] args) {
        System.out.println("solution1(new int[]{2,2,2}, 2) = " + solution1(new int[]{2, 2, 2}, 2));
        System.out.println("solution1(new int[]{10, 8, 6}, 3) = " + solution1(new int[]{10, 8, 6}, 3));

        System.out.println("solution2(new int[]{2,2,2}, 2) = " + solution2(new int[]{2, 2, 2}, 2));
        System.out.println("solution2(new int[]{10, 8, 6}, 3) = " + solution2(new int[]{10, 8, 6}, 3));
    }
}
