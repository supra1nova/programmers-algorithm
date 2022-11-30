import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class lv0인덱스바꾸기 {
    public static String solution1(String my_string, int num1, int num2){
        String[] strArr = my_string.split("");
        strArr[num1] = my_string.split("")[num2];
        strArr[num2] = my_string.split("")[num1];
        return Arrays.stream(strArr).collect(Collectors.joining());
    }

    public static String solution2(String my_string, int num1, int num2){
        return IntStream.range(0, my_string.split("").length).mapToObj(i -> i == num1 ? my_string.split("")[num2] : i == num2 ? my_string.split("")[num1] : my_string.split("")[i]).collect(Collectors.joining());
    }

    public static String solution3(String myString, int num1, int num2) {
        List<String> list = Arrays.stream(myString.split("")).collect(Collectors.toList());

        Collections.swap(list, num1, num2);
        return String.join("", list);
    }

    public static String solution4(String my_string, int num1, int num2) {
        char[] ch = my_string.toCharArray();
        ch[num1] = my_string.charAt(num2);
        ch[num2] = my_string.charAt(num1);
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        System.out.println("solution1(\"hello\", 1, 2) = " + solution1("hello", 1, 2));
        System.out.println("solution2(\"hello\", 1, 2) = " + solution2("hello", 1, 2));
        System.out.println("solution3(\"hello\", 1, 2) = " + solution3("hello", 1, 2));
        System.out.println("solution4(\"hello\", 1, 2) = " + solution4("hello", 1, 2));
    }
}
