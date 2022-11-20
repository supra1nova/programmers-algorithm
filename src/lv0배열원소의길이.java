import java.util.Arrays;
import java.util.stream.Stream;

public class lv0배열원소의길이 {
    public static int[] solution1(String[] strlist){
        int[] answer = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    public static int[] solution2(String[] strlist){
        return Stream.of(strlist).map(i -> i.length()).mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution3(String[] strlist){
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
    public static void main(String[] args){
        Arrays.stream(solution1(new String[]{"We", "are", "the", "world!"})).forEach(i -> System.out.print(i + " "));
        System.out.println();
        Arrays.stream(solution2(new String[]{"We", "are", "the", "world!"})).forEach(i -> System.out.print(i + " "));
        System.out.println();
        Arrays.stream(solution3(new String[]{"We", "are", "the", "world!"})).forEach(i -> System.out.print(i + " "));
    }
}
