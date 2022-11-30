import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class lv0한번만등장한문자 {
    public static String solution1(String s){
        String answer = "";
        Map<String, Integer> map = new LinkedHashMap<>();
        String[] strArr = s.split("");
        for(int i = 0; i < strArr.length; i++){
            if(map.containsKey(strArr[i])){
                map.replace(strArr[i], map.get(strArr[i]) + 1);
            } else {
                map.put(strArr[i], 1);
            }
        }
        for(String str : map.keySet()){
            if(map.get(str) == 1){
                answer += str;
            }
        }
        return Arrays.stream(answer.split("")).sorted().reduce((l, r) -> l + r).get();
    }

    public static String solution2(String s) {
        return Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(s1 -> s1))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() <= 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println("solution1(\"abcabcadc\") = " + solution1("abcabcadc"));
        System.out.println("solution1(\"abdc\") = " + solution1("abdc"));
        System.out.println("solution1(\"hello\") = " + solution1("hello"));

        System.out.println("solution2(\"abcabcadc\") = " + solution2("abcabcadc"));
        System.out.println("solution2(\"abdc\") = " + solution2("abdc"));
        System.out.println("solution2(\"hello\") = " + solution2("hello"));
    }
}
