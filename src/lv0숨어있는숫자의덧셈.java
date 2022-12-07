public class lv0숨어있는숫자의덧셈 {
    public static int solution1(String my_string) {
        int answer = 0;
        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        for(String s : str){
            if(!s.equals("")) answer += Integer.valueOf(s);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("solution1(\"aAb1B2cC34oOp\") = " + solution1("aAb1B2cC34oOp"));
        System.out.println("solution1(\"1a2b3c4d123Z\") = " + solution1("1a2b3c4d123Z"));
        System.out.println("solution1(\"102b3c4d123Z\") = " + solution1("102b3c4d123Z"));
        System.out.println("solution1(\"123\") = " + solution1("123"));
        System.out.println("solution1(\"asasv\") = " + solution1("asasv"));
    }
}
