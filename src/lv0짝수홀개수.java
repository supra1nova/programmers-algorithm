import java.util.Arrays;
import java.util.stream.IntStream;

public class lv0짝수홀개수 {
    public static int[] solution1(int[] num_list) {
        int[] answer = new int[2];
        Arrays.stream(num_list).forEach(i -> {
            if(i%2 != 0){
                answer[1] += 1;
            } else{
                answer[0] += 1;
            }
        });
        return answer;
    }

    public static int[] solution2(int[] numList) {
        return IntStream.of((int) Arrays.stream(numList).filter(i -> i % 2 == 0).count(), (int) Arrays.stream(numList).filter(i -> i % 2 == 1).count()).toArray();
    }


    public static void main(String[] args){
        Arrays.stream(solution1(new int[]{1, 2, 3, 4, 5})).forEach(i -> System.out.println(i));
        Arrays.stream(solution1(new int[]{1, 3, 5, 7})).forEach(i -> System.out.println(i));

        Arrays.stream(solution2(new int[]{1, 2, 3, 4, 5})).forEach(i -> System.out.println(i));
        Arrays.stream(solution2(new int[]{1, 3, 5, 7})).forEach(i -> System.out.println(i));
    }
}
