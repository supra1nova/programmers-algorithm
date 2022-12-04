import java.util.Arrays;

public class lv0자릿수더하기 {
    public static int solution1(int n){
        return Arrays.stream(String.valueOf(n).split("")).map(Integer::parseInt).reduce((l, r) -> l + r).get();
    }

    public static int solution2(int n) {
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }

    public static void main(String[] args) {
        System.out.println("solution1(1234) = " + solution1(1234));
        System.out.println("solution2(930211) = " + solution2(930211));
    }
}
