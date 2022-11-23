import java.util.ArrayList;
import java.util.List;

public class lv0공던지기 {

    public static int solution1(int[] numbers, int k){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < k/(numbers.length/2) + 1; i++){
            for(int num : numbers){
                list.add(num);
            }
        }
        List<Integer> sortedList = new ArrayList<>();
        for(int i = 0 ; i < list.size(); i++){
            if(i % 2 != 1){
                sortedList.add(list.get(i));
            }
        }
        return sortedList.get(k-1);
    }

    public static int solution2(int[] numbers, int k) {
        return (k-1)*2 % numbers.length+1;
    }

    public static int solution3(int[] numbers, int k) {
        int answer = 0;
        answer = numbers[((1 + ((k-1)*2))%numbers.length) - 1];
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("solution1(new int[]{1, 2, 3, 4}, 2) = " + solution1(new int[]{1, 2, 3, 4}, 2));
        System.out.println("solution1(new int[]{1, 2, 3, 4, 5, 6}, 5) = " + solution1(new int[]{1, 2, 3, 4, 5, 6}, 5));
        System.out.println("solution1(new int[]{1, 2, 3, 4, 5, 6, 7}, 7) = " + solution1(new int[]{1, 2, 3, 4, 5, 6, 7}, 7));

        System.out.println("solution2(new int[]{1, 2, 3, 4}, 2) = " + solution2(new int[]{1, 2, 3, 4}, 2));
        System.out.println("solution2(new int[]{1, 2, 3, 4, 5, 6}, 5) = " + solution2(new int[]{1, 2, 3, 4, 5, 6}, 5));
        System.out.println("solution2(new int[]{1, 2, 3, 4, 5, 6, 7}, 7) = " + solution2(new int[]{1, 2, 3, 4, 5, 6, 7}, 7));

        System.out.println("solution3(new int[]{1, 2, 3, 4}, 2) = " + solution3(new int[]{1, 2, 3, 4}, 2));
        System.out.println("solution3(new int[]{1, 2, 3, 4, 5, 6}, 5) = " + solution3(new int[]{1, 2, 3, 4, 5, 6}, 5));
        System.out.println("solution3(new int[]{1, 2, 3, 4, 5, 6, 7}, 7) = " + solution3(new int[]{1, 2, 3, 4, 5, 6, 7}, 7));
    }
}
