import java.util.Arrays;

public class lv0OX퀴즈 {

    public static String[] solution1(String[] quiz) {
        for(int i = 0; i < quiz.length; i++){
            String[] strArr = quiz[i].split(" ");
            quiz[i] = Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1] + 1) * Integer.parseInt(strArr[2]) == Integer.parseInt(strArr[4]) ? "O" : "X";
        }
        return quiz;
    }

    public static String[] solution2(String[] quiz) {
        for(int i=0; i<quiz.length; i++){
            String[] text = quiz[i].split(" ");
            int result = Integer.parseInt(text[0]) + ( Integer.parseInt(text[2]) * ( text[1].equals("+") ? 1:-1) );
            quiz[i] = result == Integer.parseInt(text[4])? "O": "X";
        }
        return quiz;
    }

    public static void main(String[] args) {
        Arrays.stream(solution1(new String[]{"3 - 4 = -3", "5 + 6 = 11"})).forEach(i -> System.out.print(i + " "));
        System.out.println();
        Arrays.stream(solution1(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"})).forEach(i -> System.out.print(i + " "));
        System.out.println();
        Arrays.stream(solution2(new String[]{"-3 - -6 = -9", "-3 + 3 = 71", "-3 - 3 = 63", "3 - 1 = 2"})).forEach(i -> System.out.print(i + " "));
    }
}
