import java.util.Arrays;

public class lv0문자열정리하기1 {
    public static int[] solution1(String my_string){
        return Arrays.stream(my_string.split("")).filter(i -> i.matches("[0-9]")).sorted().mapToInt(Integer::parseInt).toArray();
    }
    public static void main(String[] args) {
        solution1("hi12392");
        solution1("p2o4i8gj2");
        solution1("abcde0");
    }
}
