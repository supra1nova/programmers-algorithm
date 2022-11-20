import java.util.regex.Pattern;

public class lv0편지 {
    public static int solution1(String message){
        return message.length() * 2;
    }

    public static void main(String[] args){
        System.out.println("solution1(\"happy birthday!\") = " + solution1("happy birthday!"));
    }
}
