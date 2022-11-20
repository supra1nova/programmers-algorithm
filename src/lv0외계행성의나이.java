import java.util.Arrays;
import java.util.stream.Collectors;

public class lv0외계행성의나이 {
    public static String solution1(int age){
        String answer = "";
        String[] ageString = String.valueOf(age).split("");
        String strList = "abcdefghij";
        for(String strNum : ageString){
            answer += Arrays.stream(strList.split("")).collect(Collectors.toList()).get(Integer.parseInt(strNum));
        }
        return answer;
    }
    public static String solution2(int age) {
        return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
    }
    public static void main(String[] args){
        System.out.println("solution1(23) = " + solution1(121));
        System.out.println("solution2(23) = " + solution2(121));
    }
}
