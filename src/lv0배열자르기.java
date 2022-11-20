import java.util.Arrays;
import java.util.stream.Collectors;

public class lv0배열자르기 {
    public static int[] solution1(int[] numbers, int num1, int num2) {
        return Arrays.stream(numbers).boxed().collect(Collectors.toList()).subList(num1, num2+1).stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }

    public static void main(String[] args){
        Arrays.stream(solution1(new int[]{1, 2, 3, 4, 5}, 1, 3)).forEach(i -> System.out.println(i));
        Arrays.stream(solution2(new int[]{1, 2, 3, 4, 5}, 1, 3)).forEach(i -> System.out.println(i));
    }
}
