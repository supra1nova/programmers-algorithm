import java.util.Arrays;

public class lv0삼각형의완성조건1 {
    public static int solution1(int[] sides){
        int max = Arrays.stream(sides).max().getAsInt();
        int total = Arrays.stream(sides).sum();
        return total - max > max ? 1 : 2;
    }

    public static int solution2(int[] sides) {
        Arrays.sort(sides);
        return sides[2] >= sides[0]+sides[1] ? 2 : 1;
    }
    public static void main(String[] args){
        System.out.println("solution1(new int[]{2,3,3}) = " + solution1(new int[]{2, 2, 4}));
        System.out.println("solution2(new int[]{2,3,3}) = " + solution2(new int[]{2, 2, 4}));
    }
}
