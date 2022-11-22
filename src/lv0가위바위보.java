import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class lv0가위바위보 {
    public static String solution1(String rsp){
        Map<String, String> map = new HashMap<>();
        map.put("2", "0");
        map.put("0", "5");
        map.put("5", "2");
        return Arrays.stream(rsp.split("")).map(map::get).collect(Collectors.joining());
    }
    public static void main(String[] args){
        System.out.println("solution1(2) = " + solution1("2"));
        System.out.println("solution1(2) = " + solution1("205"));
    }
}
