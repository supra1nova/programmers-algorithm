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

    public static void main(String[] args){
        System.out.println("solution1(10) = " + solution1(10));
        System.out.println("solution2(10) = " + solution2(10));
    }
}
