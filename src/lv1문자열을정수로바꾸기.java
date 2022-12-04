public class lv1문자열을정수로바꾸기 {
    public static int solution1(String s){
        return Integer.parseInt(s);
    }
    public static void main(String[] args) {
        System.out.println("solution1(\"-1234\") = " + solution1("-1234"));
    }
}
