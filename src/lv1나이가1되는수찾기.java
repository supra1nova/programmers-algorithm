import java.util.stream.IntStream;

public class lv1나이가1되는수찾기 {
    public static int solution1(int n){
        // TODO : stream은 함수비용이 적은 코드에서는 성능이 좋지 않기 때문에, 단순 반복문으로 사용하는 것은 좋지 않은 것 같습니다 라는 코멘트가 있었는데 왜? 물어봐야지
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 1).findFirst().getAsInt();
    }

    public static int solution2(int n) {
        int answer = 0;
        for (int i=2; i<n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        System.out.println("solution1(10) = " + solution1(10));
        System.out.println("solution2(12) = " + solution1(12));
    }
}
