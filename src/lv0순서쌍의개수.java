import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class lv0순서쌍의개수 {
    public static int solution1(int n){
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = 1; i <= n ; i++){
            if(n % i == 0){
                map.put(i, n / i);
            }
        }
        return map.size();
    }

    public static int solution2(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }

    public static int solution3(int n){
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        solution1(20);
        solution2(20);
        solution3(20);
    }
}
