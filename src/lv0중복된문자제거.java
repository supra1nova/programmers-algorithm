import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class lv0중복된문자제거 {

    public static String solution1(String my_string){
        Set<String> set = new LinkedHashSet<>();
        Arrays.stream(my_string.split("")).forEach(i -> set.add(i));
        return set.stream().collect(Collectors.joining());
    }

    public static String solution2(String my_string) {
        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));

        return String.join("", set);
    }

    public static String solution3(String my_string) {
        return my_string.chars()
                .mapToObj(Character::toString)
                .distinct()
                .collect(Collectors.joining());
    }

    public static void main(String[] args){
        System.out.println("solution1(\"people\") = " + solution1("people"));
        System.out.println("solution1(\"We are the world\") = " + solution1("We are the world"));

        System.out.println("solution2(\"people\") = " + solution2("people"));
        System.out.println("solution2(\"We are the world\") = " + solution2("We are the world"));

        System.out.println("solution3(\"people\") = " + solution3("people"));
        System.out.println("solution3(\"We are the world\") = " + solution3("We are the world"));
    }
}
