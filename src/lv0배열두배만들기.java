import java.util.Arrays;

public class lv0배열두배만들기 {
    public static int[] solution1(int[] numbers) {
        int[] answer = numbers;
        int sequence = 0;
        while(sequence < answer.length){
            answer[sequence] = answer[sequence] * 2;
            sequence++;
        }
        return answer;
    }

    public static int[] solution2(int[] numbers) {
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }

    public static int[] solution3(int[] numbers){
        int[] answer = new int[numbers.length];
        for(int i = 0 ; i < numbers.length; i++){
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        int[] b = solution1(a);
        for(int c : b){
            System.out.println(c);
        }

        b = solution2(a);
        Arrays.stream(b).forEach(System.out::println);

        Arrays.stream(solution3(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})).forEach(i -> System.out.print(i + " "));
    }
}
