import java.util.stream.IntStream;

public class lv0합성수찾기 {
    public static int solution1(int n){
        int answer = 0;
        int count = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(i % j == 0) count++;
            }
            if(count >= 3){
                answer++;
            }
            count = 0;
        }
        return answer;
    }

    public static int solution2(int n){
        return (int)IntStream.rangeClosed(1, n).filter( i -> (int)IntStream.rangeClosed(1, i).filter(j -> i % j == 0).count() > 2 ).count();
    }

    public static void main(String[] args){
        System.out.println("solution1(10) = " + solution1(10));
        System.out.println("solution2(10) = " + solution2(10));
    }
}
