import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class lv0저주의숫자3 {
    public static int solution1(int n){
        List<Integer> intList = new ArrayList<>();
        IntStream.rangeClosed(1, 500).forEach(i -> {if(i % 3 != 0 && !String.valueOf(i).contains("3")) {intList.add(i);}});
        return intList.get(n - 1);
    }

    public static int solution2(int n) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer++;
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("solution1(15) = " + solution1(15));
        System.out.println("solution2(40) = " + solution2(40));
    }
}
