import java.util.Arrays;
import java.util.stream.Collectors;

public class lv0대문자와소문자 {

    public static String solution1(String my_string){
        return Arrays.stream(my_string.split("")).map(i -> i.matches("[A-Z]") ? i.toLowerCase() : i.toUpperCase()).collect(Collectors.joining());
    }

    public static String solution2(String my_string){
        String answer = "";
        for(String str : my_string.split("")){
            answer += str.matches("[A-Z]") ? str.toLowerCase() : str.toUpperCase();
        }
        return answer;
    }

    public static String solution3(String myString) {
        return myString.chars().mapToObj(operand -> String.valueOf((char) (Character.isLowerCase(operand) ? Character.toUpperCase(operand) : Character.toLowerCase(operand)))).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println("solution1(\"cccCCC\") = " + solution1("cccCCC"));
        System.out.println("solution1(\"abCdEfghIJ\") = " + solution1("abCdEfghIJ"));

        System.out.println("solution2(\"cccCCC\") = " + solution2("cccCCC"));
        System.out.println("solution2(\"abCdEfghIJ\") = " + solution2("abCdEfghIJ"));

        System.out.println("solution3(\"cccCCC\") = " + solution3("cccCCC"));
        System.out.println("solution3(\"abCdEfghIJ\") = " + solution3("abCdEfghIJ"));
    }
}
