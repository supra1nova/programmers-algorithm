import java.util.Arrays;

public class lv0삼각형의완성조건2 {
    public static int solution1(int[] sides){
        int max = Arrays.stream(sides).max().getAsInt();
        int min = Arrays.stream(sides).min().getAsInt();
        return (max + min) - (max - min) - 1;
    }

    public static void main(String[] args) {
        System.out.println("solution1(new int[]{1,2}) = " + solution1(new int[]{1, 2}));
    }
}
