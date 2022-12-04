import java.util.Arrays;

public class lv0문자열계산하기 {
    public static int solution1(String my_string){
        String[] strArr = my_string.split(" ");
        int answer = 0;
        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].equals("-") || strArr[i].equals("+")) {
                strArr[i+1] = strArr[i] + strArr[i+1];
            } else {
                answer += Integer.parseInt(strArr[i]);
            }
        }
        return answer;
    }

    public static int solution2(String my_string){
        return Arrays.stream(my_string.replaceAll("- ", "-").replaceAll("[+] ", "").trim().split(" ")).mapToInt(Integer::parseInt).sum();
    }

    public static void main(String[] args) {
        System.out.println("solution1(\"3 + 4\") = " + solution1("3 + 4"));
    }
}
