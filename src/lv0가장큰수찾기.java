import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lv0가장큰수찾기 {
    public static int[] solution1(int[] array){
        int[] answer = new int[2];
        for(int i = 0; i < array.length; i++){
            if(array[i] > answer[0]){
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }

    public static int[] solution2(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        int max = list.stream().max(Integer::compareTo).orElse(0);
        int index = list.indexOf(max);
        return new int[] {max, index};
    }

    public static void main(String[] args) {
        Arrays.stream(solution1(new int[]{1, 8, 3})).forEach(i -> System.out.print(i + " "));
        System.out.println();
        Arrays.stream(solution1(new int[]{9, 10, 11, 8})).forEach(i -> System.out.print(i + " "));

        System.out.println();

        Arrays.stream(solution2(new int[]{1, 8, 3})).forEach(i -> System.out.print(i + " "));
        System.out.println();
        Arrays.stream(solution2(new int[]{9, 10, 11, 8})).forEach(i -> System.out.print(i + " "));
    }
}
