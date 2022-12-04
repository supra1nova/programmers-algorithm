import java.util.Arrays;
import java.util.stream.Collectors;

public class lv1서울에서김서방찾기 {

    public static String solution1(String[] seoul){
        int index = Arrays.stream(seoul).collect(Collectors.toList()).indexOf("Kim");
        return "김서방은 " + index + "에 있다";
    }

    // TODO: Arrays 에 대해 더욱 공부하자 - Arrays.asList를 매번 까먹네.
    public static String solution2(String[] seoul){
        int x = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 "+ x + "에 있다";
    }

    public static String solution3(String[] seoul){
        int x = 0;
        while(x<seoul.length){
            if(seoul[x] == "Kim")
                break;
            else x++;
        }
        return "김서방은 "+ x + "에 있다";
    }

    public static void main(String[] args){
        System.out.println("solution1(new String[]{\"Jane\", \"Kim\"}) = " + solution1(new String[]{"Jane", "Kim"}));
        System.out.println("solution2(new String[]{\"Jane\", \"Kim\"}) = " + solution2(new String[]{"Jane", "Kim"}));
        System.out.println("solution3(new String[]{\"Jane\", \"Kim\"}) = " + solution3(new String[]{"Jane", "Kim"}));
    }
}
