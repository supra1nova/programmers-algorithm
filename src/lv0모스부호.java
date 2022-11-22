import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class lv0모스부호 {
    public static String solution1(String letter){

        Map<String, String> map = new LinkedHashMap<>();
        String[] morse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        char alphabet = 'a';
        for(String e : morse){
            map.put(e, String.valueOf(alphabet++));
        }
        return Arrays.stream(letter.split(" ")).map(map::get).collect(Collectors.joining());
    }

    public static void main(String[] args){
        System.out.println("solution1(\".... . .-.. .-.. ---\") = " + solution1(".... . .-.. .-.. ---"));
    }
}
