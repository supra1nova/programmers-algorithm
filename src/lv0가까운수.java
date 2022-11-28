import java.util.Arrays;

public class lv0가까운수 {

    public static int solution1(int[] array, int n){
        return Arrays.stream(array).reduce(0, (l,r) -> l == 0 ? r : Math.abs(n - l) > Math.abs(n - r) ? r : Math.abs(n - l) < Math.abs(n - r) ? l : n - l >= n - r ? l : r);
    }

    public static int solution2(int[] array, int n){
        int answer = 0;
        Arrays.sort(array);
        for(int i = 1 ; i < array.length ; i++){
            if(Math.abs(n-array[0]) > Math.abs(n-array[i])){
                array[0] = array[i];
            }
        }
        answer = array[0];
        return answer;
    }

    public static int solution3(int[] array, int n){
        return Arrays.stream(array).reduce(0, (l, r) -> l == 0 ? r : Math.abs(n - l) >= Math.abs(n - r) ? r : l);
    }

    public static void main(String[] args) {
        System.out.println("solution1(new int[]{3, 10, 28}, 20) = " + solution1(new int[]{3, 10, 28}, 20));
        System.out.println("solution1(new int[]{10, 11, 12}, 13) = " + solution1(new int[]{10, 11, 12}, 13));
        System.out.println("solution1(new int[]{13, 13, 11}, 12) = " + solution1(new int[]{13, 13, 11}, 12));
        System.out.println("solution1(new int[]{11, 11, 11}, 11) = " + solution1(new int[]{11, 11, 11}, 11));
        System.out.println(solution1(new int[]{23, 11, 33}, 22));
        System.out.println(solution1(new int[]{22,21,18,19,23}, 20));
        System.out.println(solution1(new int[]{1, 3, 1, 4 ,1}, 2));
        System.out.println(solution1(new int[]{100, 99, 99, 100 ,99}, 100));

        System.out.println();

        System.out.println("solution3(new int[]{3, 10, 28}, 20) = " + solution3(new int[]{3, 10, 28}, 20));
        System.out.println("solution3(new int[]{10, 11, 12}, 13) = " + solution3(new int[]{10, 11, 12}, 13));
        System.out.println("solution3(new int[]{13, 13, 11}, 12) = " + solution3(new int[]{13, 13, 11}, 12));
        System.out.println("solution3(new int[]{11, 11, 11}, 11) = " + solution3(new int[]{11, 11, 11}, 11));
        System.out.println(solution3(new int[]{23, 11, 33}, 22));
        System.out.println(solution3(new int[]{22,21,18,19,23}, 20));
        System.out.println(solution3(new int[]{1, 3, 1, 4 ,1}, 2));
        System.out.println(solution3(new int[]{100, 99, 99, 100 ,99}, 100));

    }
}
