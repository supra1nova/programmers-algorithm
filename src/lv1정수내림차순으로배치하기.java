import java.util.Arrays;
import java.util.stream.Collectors;

public class lv1정수내림차순으로배치하기 {
    public static long solution1(long n){
        String s = Arrays.stream(String.valueOf(n).split("")).collect(Collectors.toList()).stream().sorted().reduce((l, r) -> l + r).get();
        return Long.parseLong(new StringBuilder().append(s).reverse().toString());
    }

    public static long solution2(long n) {
        String[] strArr = String.valueOf(n).split("");
        Arrays.sort(strArr);
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) sb.append(str);
        return Long.parseLong(sb.reverse().toString());
    }

    static String solution3Res = "";
    public static int solution3(int n){
        solution3Res = "";
        Integer.toString(n).chars().sorted().forEach(c -> solution3Res = Character.valueOf((char)c) + solution3Res);
        return Integer.parseInt(solution3Res);
    }

    public static void main(String[] args){
        System.out.println("solution1(118372) = " + solution1(118372));
        System.out.println("solution2(118372) = " + solution2(118372));
        System.out.println("solution3(118372) = " + solution3(118372));
    }
}
