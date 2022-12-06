import java.util.Arrays;

public class lv0최댓값만들기2 {
    public static int solution1(int[] numbers){
        Arrays.sort(numbers);
        int negFirstMin = 0;
        int negSecondMin = 0;
        if(Arrays.stream(numbers).filter(i -> i < 0).count() >= 2) {
            negFirstMin = numbers[0];
            negSecondMin = numbers[1];
        }
        int firstMax = numbers[numbers.length - 1];
        int secondMax = numbers[numbers.length - 2];
        return firstMax * secondMax < 0 ? firstMax * secondMax : Math.max(firstMax * secondMax, negFirstMin * negSecondMin);
    }

    public static int solution2(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1] * numbers[numbers.length-2] < numbers[0] * numbers[1] ? numbers[0] * numbers[1] : numbers[numbers.length-1] * numbers[numbers.length-2];
    }

    public static int solution3(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
    }

    public static void main(String[] args){
        System.out.println("solution1(new int[]{1, 2, -3, 4, -5}) = " + solution1(new int[]{1, 2, -3, 4, -5}));
        System.out.println("solution2(new int[]{0, -31, 24, 10, 1, 9}) = " + solution2(new int[]{0, -31, 24, 10, 1, 9}));
        System.out.println("solution3(new int[]{10, 20, 30, 5, 5, 20, 5}) = " + solution3(new int[]{10, 20, 30, 5, 5, 20, 5}));
    }
}
