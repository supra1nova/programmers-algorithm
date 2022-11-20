import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class lv0최빈값구하기 {
    public static int solution1(int[] array){
        // 배열 내에서 최대값을 구한 뒤 1을 더해 인덱스를 생성한다.
        int[] index = new int[Arrays.stream(array).max().getAsInt()+1];
        // 배열에서 인덱스와 일치하는 숫자가 나오면 값을 증가시켜, 빈도를 기록한다.
        for(int j = 0; j < array.length; j++){
            index[array[j]]++;
        }
        // 인덱스 내에서 최대값을 구해 maxRepeatNum으로 지정한다(최빈값 - 최대 빈도값)
        int maxRepeatNum = Arrays.stream(index).max().getAsInt();

        int count = 0;
        // 만약 인덱스에 있는 숫자가 maxRepeatNum과 일치하다면 count값을 증가 시킨다.
        for(int num : index){
            if(num == maxRepeatNum) count++;
        }
        // count값이 1이 아니면 최대값이 반복되는 것이므로 -1을 반환하고, 1이면 해당하는 index의 인덱스 값을 리턴한다.
        return Arrays.stream(index).boxed().collect(Collectors.toList()).indexOf(maxRepeatNum);
    }

    public static int solution2(int[] array){
        int answer = 0;
        // 배열 내에서 최대값을 구한 뒤 1을 더해 인덱스를 생성한다.
        int[] index = new int[Arrays.stream(array).max().getAsInt()+1];
        // 배열에서 인덱스와 일치하는 숫자가 나오면 값을 증가시켜, 빈도를 기록한다.
        for(int j = 0; j < array.length; j++){
            index[array[j]]++;
        }
        // 인덱스 내에서 최대값을 구해 maxRepeatNum으로 지정한다(최빈값 - 최대 빈도값)
        int maxRepeatNum = Arrays.stream(index).max().getAsInt();

        int count = 0;
        // 만약 인덱스에 있는 숫자가 maxRepeatNum과 일치하다면 count값을 증가 시킨다.
        for(int num : index){
            if(num == maxRepeatNum) count++;
        }
        // count값이 1이 아니면 최대값이 반복되는 것이므로 -1을 반환하고, 1이면 해당하는 index의 인덱스 값을 리턴한다.
        if(count != 1){
            answer = -1;
        } else{
            for(int i = 0; i < index.length; i++){
                if(index[i] == maxRepeatNum) {
                    answer = i;
                    break;
                }
            }
        }
        return answer;
    }

    public static int solution3(int[] array) {
        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }


    public static void main(String[] args){
        System.out.println("solution1(new int[]{1,2,3,4,5,1,2,3,4,1,2,3,6}) = " + solution1(new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 1, 2, 3, 6}));
        System.out.println("solution1(new int[]{1,2,3,3,3,4}) = " + solution1(new int[]{1, 2, 3, 3, 3, 4}));
    }
}
