import java.util.Arrays;
import java.util.stream.Collectors;

public class lv0모음제거 {
    public static String solution1(String my_string){
        return my_string.replaceAll("[aeiou]", "");
    }
    public static void main(String[] args) {
        System.out.println("solution1(\"bus\") = " + solution1("bus"));
        System.out.println("solution1(\"nice to meet you\") = " + solution1("nice to meet you"));
    }
}
