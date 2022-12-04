import java.util.stream.IntStream;

public class lv1자릿수더하기 {
    public static int solution1(int n){
        return IntStream.range(0, String.valueOf(n).split("").length).map(i -> Integer.parseInt(String.valueOf(n).split("")[i])).sum();
    }

    public static int solution2 (int n){
        int answer = 0;
        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("solution1(123) = " + solution1(123));
        System.out.println("solution2(987) = " + solution2(987));
    }
}
