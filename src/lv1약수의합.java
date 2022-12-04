import java.util.stream.IntStream;

public class lv1약수의합 {

    public static int solution1(int n){
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).sum();
    }

    public static void main(String[] args) {
        System.out.println("solution1(12) = " + solution1(12));
        System.out.println("solution1(5) = " + solution1(5));
    }
}
