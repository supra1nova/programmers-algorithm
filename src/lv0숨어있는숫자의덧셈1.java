import java.util.Arrays;

public class lv0숨어있는숫자의덧셈1 {

    public static int solution1(String my_string){
        return Integer.parseInt(Arrays.stream(my_string.replaceAll("[A-Za-z]", "").split("")).reduce((l, r) -> String.valueOf(Integer.parseInt(l) + Integer.parseInt(r))).get());
    }

    public static int solution2(String myString) {
        return myString.chars().mapToObj(i -> (char) i).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum();
    }

    public static void main(String[] args) {
        System.out.println("solution1(\"aAb1B2cC34oOp\") = " + solution1("aAb1B2cC34oOp"));
        System.out.println("solution1(\"1a2b3c4d123\") = " + solution1("1a2b3c4d123"));

        System.out.println("solution2(\"aAb1B2cC34oOp\") = " + solution2("aAb1B2cC34oOp"));
        System.out.println("solution2(\"1a2b3c4d123\") = " + solution2("1a2b3c4d123"));
    }
}
