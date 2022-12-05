import java.util.Arrays;
import java.util.stream.Collectors;

public class lv0문자열정렬하기2 {
    public static String solution1(String my_string){
        return Arrays.stream(my_string.toLowerCase().split("")).sorted().collect(Collectors.joining());
    }

    public static String solution2(String my_string) {
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static void main(String[] args) {
        System.out.println("solution1(\"Bcad\") = " + solution1("Bcad"));
        System.out.println("solution1(\"heLLo\") = " + solution1("heLLo"));
        System.out.println("solution1(\"Python\") = " + solution1("Python"));

        System.out.println("solution2(\"Bcad\") = " + solution2("Bcad"));
        System.out.println("solution2(\"heLLo\") = " + solution2("heLLo"));
        System.out.println("solution2(\"Python\") = " + solution2("Python"));
    }
}
