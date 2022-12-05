import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class lv0잘라서배열로저장하기 {
    public static String[] solution1(String my_str, int n){
        List<String> list = new LinkedList<>();
        for(int i = 0 ; i < my_str.length(); i += n){
            list.add(my_str.substring(i, i+n > my_str.length() ? my_str.length() : i + n));
        }
        return list.toArray(new String[list.size()]);
    }

    public static String[] solution2(String my_str, int n) {
        int resultCnt = (my_str.length() + n - 1) / n;
        String[] answer = new String[resultCnt];

        for (int i = 0; i < resultCnt; i++) {
            int start = n * i;
            int end = start + n >= my_str.length()? my_str.length(): start + n;
            answer[i] = my_str.substring(start, end);
        }

        return answer;
    }

    public static void main(String[] args) {
        Arrays.stream(solution1("abc1Addfggg4556b", 6)).forEach(i -> System.out.print(i + " "));
        System.out.println();
        Arrays.stream(solution2("abc1Addfggg4556b", 6)).forEach(i -> System.out.print(i + " "));
    }
}
