import java.util.stream.LongStream;

public class lv1두정수사이의합 {
    public static long solution1(int a, int b){
        return LongStream.rangeClosed(a < b ? a : b, a < b ? b : a).sum();
    }

    // 등차수열을 이용한 함수
    // TODO: 등차수열에 대해 찾아보자
    public static long solution2(int a, int b) {
        return solution2SumAtoB(Math.min(a, b), Math.max(b, a));
    }
    private static long solution2SumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }

    public static void main(String[] args) {
        System.out.println("solution1(3, 5) = " + solution1(3, 5));
        System.out.println("solution1(3, 5) = " + solution1(5, 3));
    }
}
