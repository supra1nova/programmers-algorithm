import java.util.Arrays;

public class lv1자연수뒤집배열로만들기 {

    public static int[] solution1(long n){
        return Arrays.stream(new StringBuilder().append(n).reverse().toString().split("")).mapToInt(Integer::parseInt).toArray();
    }

    public static int[] solution2(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }

    public static int[] solution3(long n) {
        String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            cnt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Arrays.stream(solution1(12345)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(solution2(12345)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(solution3(12345)).forEach(System.out::print);
    }
}
