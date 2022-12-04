import java.util.Arrays;

public class lv1하샤드수 {
    public static boolean solution1(int x){
        return x % Integer.parseInt(Arrays.stream(String.valueOf(x).split("")).reduce((l, r) -> String.valueOf(Integer.parseInt(l) + Integer.parseInt(r))).get()) == 0;
    }

    public boolean solution2(int x) {
        return x % String.valueOf(x).chars().map(ch -> ch - '0').sum() == 0;
    }

    public static void main(String[] args) {
        System.out.println("solution1(10) = " + solution1(10));
        System.out.println("solution1(11) = " + solution1(11));
        System.out.println("solution1(12) = " + solution1(12));
        System.out.println("solution1(13) = " + solution1(13));
    }
}
