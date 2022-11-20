import java.util.Arrays;
import java.util.stream.Collectors;

public class lv0배열의유사도 {
    public static int solution1(String[] s1, String[] s2){
        int answer = 0;
        for(int i = 0 ; i < s1.length; i++){
            for(int j = 0; j < s2.length; j++){
                if(s2[j].equals(s1[i])) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }

    public static int solution2(String[] s1, String[] s2) {
        return (int) Arrays.stream(s1).map(s -> Arrays.stream(s2).collect(Collectors.toList()).contains(s)).filter(b -> b).count();
    }
    public static void main(String[] args){
        System.out.println("solution1(new String[]{\"a\", \"b\", \"c\"}, new String[]{\"com\", \"b\", \"d\", \"p\", \"c\"}) = " + solution1(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"}));
        System.out.println("solution2(new String[]{\"a\", \"b\", \"c\"}, new String[]{\"com\", \"b\", \"d\", \"p\", \"c\"}) = " + solution2(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"}));
    }
}
