import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lv0배열회전시키기 {

    public static int[] solution1(int[] numbers, String direction){
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        switch (direction){
            case "right":
                int backNum = list.get(list.size()-1);
                list.remove(list.size()-1);
                list.add(0, backNum);
                break;
            case "left":
                int frontNum = list.get(0);
                list.remove(0);
                list.add(list.size(), frontNum);
                break;
        }
        System.out.println(list);
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static int[] solution2(int[] numbers, String direction){
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        if(direction.equals("right")){
            int backNum = list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(0, backNum);
        } else{
            int frontNum = list.get(0);
            list.remove(0);
            list.add(list.size(), frontNum);
        }
        System.out.println(list);
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static int[] solution3(int[] numbers, String direction) {
        // left 일 경우
        if (direction.equals("left")) {
            // 마지막 값
            int firstValue = numbers[0];
            for (int i = 0; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[numbers.length - 1] = firstValue;
        }
        // right 일 경우
        else {
            int lastValue = numbers[numbers.length - 1];
            for (int i = numbers.length - 1; i > 0; i--) {
                numbers[i] = numbers[i - 1];
            }
            numbers[0] = lastValue;
        }
        System.out.println("Arrays.stream(numbers).boxed().collect(Collectors.toList()) = " + Arrays.stream(numbers).boxed().collect(Collectors.toList()));
        return numbers;
    }

    public static void main(String[] args) {
        solution1(new int[]{1, 2, 3}, "right");
        solution1(new int[]{1, 2, 3}, "left");

        solution2(new int[]{1, 2, 3}, "right");
        solution2(new int[]{1, 2, 3}, "left");

        solution3(new int[]{1, 2, 3}, "right");
        solution3(new int[]{1, 2, 3}, "left");
    }
}
