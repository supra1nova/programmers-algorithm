import java.util.Arrays;

public class lv0n의배수고르기 {

    public static int[] solution1(int n, int[] numlist){
        return Arrays.stream(numlist).filter(i -> i % n == 0).toArray();
    }
    public static void main(String[] args) {
        Arrays.stream(solution1(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})).forEach(i -> System.out.print(i + " "));
        System.out.println();
        Arrays.stream(solution1(5, new int[]{1, 9, 3, 10, 13, 5})).forEach(i -> System.out.print(i + " "));
        System.out.println();
        Arrays.stream(solution1(12, new int[]{2, 100, 120, 600, 12, 12})).forEach(i -> System.out.print(i + " "));
    }
}
