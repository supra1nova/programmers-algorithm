import java.util.Arrays;

public class lv02차원으로만들기 {
    public static int[][] solution1(int[] num_list, int n){

        int list_size = num_list.length;
        int quotient = list_size % n != 0 ? list_size/n + 1 : list_size/n;
        int[][] answer = new int[quotient][n];
        for(int i = 0; i < list_size; i++){
            answer[i / n][i % n] = num_list[i];
        }
        Arrays.stream(answer).forEach(i -> Arrays.stream(i).forEach(System.out::println));
        return answer;
    }

    public static void main(String[] args){
        solution1(new int[]{1,2,3,4,5,6,7,8}, 2);
    }
}
