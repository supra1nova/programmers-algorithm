import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class lv0암호해독 {
    public static String solution1(String cipher, int code){
        return IntStream.rangeClosed(1, cipher.length()).filter(i -> i%code == 0).mapToObj(j -> cipher.split("")[j-1]).collect(Collectors.joining());
    }

    public static String solution2(String cipher, int code) {
        String answer = "";
        for (int i = code; i <= cipher.length(); i = i + code) {
            answer += cipher.substring(i - 1, i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("solution1(\"dfjardstddetckdaccccdegk\", 4) = " + solution1("dfjardstddetckdaccccdegk", 4));
        System.out.println("solution1(\"pfqallllabwaoclk\", 2) = " + solution1("pfqallllabwaoclk", 2));

        System.out.println("solution2(\"dfjardstddetckdaccccdegk\", 4) = " + solution2("dfjardstddetckdaccccdegk", 4));
        System.out.println("solution2(\"pfqallllabwaoclk\", 2) = " + solution2("pfqallllabwaoclk", 2));
    }
}
