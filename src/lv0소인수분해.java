import java.util.HashSet;
import java.util.Set;

public class lv0소인수분해 {
    public static int[] solution1(int n){
        Set<Integer> set = new HashSet<>();
        int i = 2;
        while( n > 1){
            if(n % i == 0){
                set.add(i);
                n /= i;
                i = 2;
            } else {
                i++;
            }
        }
        return set.stream().mapToInt(Integer::intValue).sorted().toArray();
    }

    public static void main(String[] args) {
        solution1(12);
        solution1(17);
        solution1(420);
        solution1(1000);
    }
}
