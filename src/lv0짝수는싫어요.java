import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class lv0짝수는싫어요 {

    public static int[] solution1(int n){
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n ; i++){
            if(i % 2 != 0){
                list.add(i);
            }
        }
        System.out.println("list = " + list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(int n){
        int[] a = IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
        Arrays.stream(a).forEach(System.out::println);
        return a;
    }

    public static int[] solution3(int n) {
        int cnt = 0;

        if(n % 2 == 0) cnt = n/2;
        else cnt = n/2 + 1;

        int[] result = new int[cnt];

        int num = 1;

        for(int i=0; i<result.length; i++){
            result[i] = num;
            num = num + 2;
        }
        System.out.println("Arrays.stream(result).boxed().collect(Collectors.toList()) = " + Arrays.stream(result).boxed().collect(Collectors.toList()));
        return result;
    }

    public static void main(String[] args){
        solution1(10);
        solution2(20);
        solution3(30);
    }
}
