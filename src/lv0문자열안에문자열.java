public class lv0문자열안에문자열 {

    public static int solution1(String str1, String str2){
        return str1.contains(str2) ? 1 : 2;
    }
    public static void main(String[] args) {
        System.out.println("solution1(\"ab6CDE443fgh22iJKlmn1o\", \"6CD\") = " + solution1("ab6CDE443fgh22iJKlmn1o", "6CD"));
        System.out.println("solution1(\"ppprrrogrammers\", \"pppp\") = " + solution1("ppprrrogrammers", "pppp"));
    }
}
