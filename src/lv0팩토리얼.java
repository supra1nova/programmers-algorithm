public class lv0팩토리얼 {

    public static int solution1(int n){
        int result = 1;
        int answer = 0;
        for(int i = 1 ; i <= 10; i++){
            if(result * i > n){
                break;
            }
            result *= i;
            answer = i;
        }
        return answer;
    }

    public static int solution2(int n) {
        int fac = 1;
        int i = 0;
        while(true){
            if(fac <= n){
                fac *= i + 1;
                i++;
            }else break;
        }
        return i-1;
    }

    public static void main(String[] args){
        System.out.println("solution1(3628800) = " + solution1(3628800));
        System.out.println("solution1(7) = " + solution1(7));

        System.out.println("solution2(3628800) = " + solution2(3628800));
        System.out.println("solution2(7) = " + solution2(7));
    }
}
