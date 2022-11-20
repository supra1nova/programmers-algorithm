import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class lv0최댓값만들기1 {
    public static int solution1(int[] numbers){
        List<Integer> list = Arrays.stream(numbers).sorted().boxed().collect(Collectors.toList());
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).limit(2).reduce(1, (a,b) -> a * b);
    }

    /*
    위의 내용보다 더 간결하고 깔끔함.
     */
    public static int solution2(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1]*numbers[numbers.length-2];
    }

    public static void main(String[] args){
        System.out.println("solution1(new int[]{1, 2, 3, 4, 5}) = " + solution1(new int[]{1, 2, 3, 4, 5}));
        System.out.println("solution1(new int[]{0, 31, 24, 10, 1, 9}) = " + solution1(new int[]{0, 31, 24, 10, 1, 9}));

        System.out.println("solution2(new int[]{1, 2, 3, 4, 5}) = " + solution2(new int[]{1, 2, 3, 4, 5}));
        System.out.println("solution2(new int[]{0, 31, 24, 10, 1, 9}) = " + solution2(new int[]{0, 31, 24, 10, 1, 9}));
    }
}
