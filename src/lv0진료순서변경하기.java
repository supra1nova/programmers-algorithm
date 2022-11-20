import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class lv0진료순서변경하기 {
    public static int[] solution1(int[] emergency){
        int[] answer = new int[emergency.length];

        List<Integer> emergencyList = new ArrayList<>();
        for(int elem : emergency){
            emergencyList.add(elem);
        }
        emergencyList.sort((o1, o2) -> o2.compareTo(o1));

        for(int i = 0; i < emergency.length; i++){
            answer[i] = emergencyList.indexOf(emergency[i])+1;
        }
        Arrays.stream(answer).forEach(j -> System.out.println(j));

        return answer;
    }

    public static int[] solution2(int[] e) {
        return Arrays.stream(e).map(i -> Arrays.stream(e).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(i) + 1).toArray();
    }
    public static void main(String[] args){
        solution1(new int[]{24, 3, 76});
        solution2(new int[]{24, 3, 76});
    }
}
