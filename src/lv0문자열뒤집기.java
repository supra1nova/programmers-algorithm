public class lv0문자열뒤집기 {
    public static String solution1(String my_string){
        return new StringBuilder().append(my_string).reverse().toString();
    }
    public static void main(String[] args){
        System.out.println("solution1(\"jaron\") = " + solution1("jaron"));
    }
}
