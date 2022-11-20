public class lv0문자반복출력하기 {
    public static String solution1(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++){
            sb.append(String.valueOf(my_string.charAt(i)).repeat(n));
        }
        return sb.toString();
    }

    public static String solution2(String my_string, int n) {
        String answer = "";
        String[] str = my_string.split("");
        for(int i=0; i<my_string.length(); i++){
            answer += str[i].repeat(n);
        }
        return answer;
    }

    public static String solution3(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println("solution1(\"hello\", 5) = " + solution1("hello", 5));
        System.out.println("solution2(\"hello\", 5) = " + solution2("hello", 5));
        System.out.println("solution3(\"hello\", 5) = " + solution3("hello", 5));
    }
}
