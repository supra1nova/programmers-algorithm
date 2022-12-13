import java.util.Arrays;

public class lv0중앙값구하기 {
    public static int solution1(int[] array){
        array = Arrays.stream(array).sorted().toArray();
        return array[array.length/2];
    }

    public static int solution2(int[] array) {
        Arrays.sort(array); // Arrays.sort() 의 return 은 void 임.
        return array[array.length/2];
    }

    public static void main(String[] args){
        System.out.println("solution1(new int[]{1, 2, 7, 10, 11}) = " + solution1(new int[]{1, 2, 7, 10, 11}));
        System.out.println("solution2(new int[]{9, -1, 0}) = " + solution2(new int[]{9, -1, 0}));
    }
}
