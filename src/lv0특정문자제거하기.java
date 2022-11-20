public class lv0특정문자제거하기 {
    public static String solution1(String my_string, String letter) {
        return my_string.replace(letter, "");
    }

    public static void main(String[] args){
        System.out.println("solution1(\"abcdef\", \"f\") = " + solution1("abcdef", "f"));
        System.out.println("solution1(\"BCBdbe\", \"B\") = " + solution1("BCBdbe", "B"));
    }
}
