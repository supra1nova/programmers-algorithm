import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class lv0배열뒤집기 {
    public static int[] solution1(int[] numList){
        int[] reArray = new int[numList.length];
        int j = 0;
        for(int i = numList.length-1; i >= 0; i--){
            reArray[j] = numList[i];
            j++;
        }
        return reArray;
    }

    public static int[] solution2(int[] numList){
        List<Integer> list = Arrays.stream(numList).boxed().collect(Collectors.toList());

        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution3(int[] num_list) {
        Stack stack = new Stack();
        for(int num : num_list){
            stack.push(num);
        }
        return stack.stream().mapToInt(i -> Integer.parseInt((String)i)).toArray();
    }

    public static int[] solution4(int[] num_list){
        int[] newArr = new int[num_list.length];
        for(int i = num_list.length - 1; i >= 0; i--){
            newArr[num_list.length - 1 - i] = num_list[i];
        }
        return newArr;
    }

    public static void main(String[] args){
        Arrays.stream(solution1(new int[]{1, 2, 3, 4, 5})).forEach(i -> System.out.println(i));
        Arrays.stream(solution2(new int[]{1, 2, 3, 4, 5})).forEach(i -> System.out.println(i));
    }
}
