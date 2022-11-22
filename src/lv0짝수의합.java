import java.util.stream.IntStream;

public class lv0짝수의합 {
    public static int solution1(int n){
        int num = 1;
        int sum = 0;
        while(num < n){
            if(num % 2 == 0){
                sum += num;
            }
            num++;
        }
        return sum;
    }

    public static int solution2(int n) {
        int answer = 0;
        for(int i=2; i<=n; i+=2){
            answer+=i;
        }
        return answer;
    }

    public static int solution3(int n){
        return IntStream.rangeClosed(1, n).filter(i -> i % 2 == 0).sum();
    }

    public static void main(String[] args){
        System.out.println("solution1(10) = " + solution1(10));
        System.out.println("solution2(10) = " + solution2(10));
        System.out.println("solution3(10) = " + solution3(10));
    }
}
