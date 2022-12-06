import java.util.Arrays;

public class lv0직사각형넓이구하기 {
    public static int solution1(int[][] dots){
        int leftMin = Arrays.stream(dots).map(i -> i[0]).mapToInt(Integer::intValue).min().getAsInt();
        int leftMax = Arrays.stream(dots).map(i -> i[0]).mapToInt(Integer::intValue).max().getAsInt();
        int rightMin = Arrays.stream(dots).map(i -> i[1]).mapToInt(Integer::intValue).min().getAsInt();
        int rightMax = Arrays.stream(dots).map(i -> i[1]).mapToInt(Integer::intValue).max().getAsInt();
        return Math.abs(leftMax - leftMin) * Math.abs(rightMax - rightMin);
    }

    public static void main(String[] args) {
        System.out.println("solution1(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}}) = " + solution1(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}}));
        System.out.println("solution1(new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}}) = " + solution1(new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}}));
    }
}
