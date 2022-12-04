import java.util.Arrays;
import java.util.stream.IntStream;

public class lv0약수구하기 {
    public static int[] solution1(int n){
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }

    public static void main(String[] args){
        Arrays.stream(solution1(24)).forEach(i -> System.out.print(i + " "));
        System.out.println();
        Arrays.stream(solution1(29)).forEach(i -> System.out.print(i + " "));
    }
}
