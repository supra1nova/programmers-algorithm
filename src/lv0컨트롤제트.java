import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

public class lv0컨트롤제트 {
    public static int solution1(String s){
        String[] strArr = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < strArr.length; i++){
            if(!strArr[i].equals("Z")){
                list.add(Integer.parseInt(strArr[i]));
            } else if(strArr[i].equals("Z") && list.size() > 0){
                list.remove(list.size()-1);
            }
        }
        return list.size() == 0 ? 0: list.stream().reduce((l, r) -> l + r).get();
    }

    public static int solution2(String s){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        String[] strArr = s.split(" ");

        for(int i = 0; i < strArr.length; i++){
            if(!strArr[i].equals("Z")){
                stack.push(Integer.parseInt(strArr[i]));
            } else{
                if(stack.size() >= 1){
                    stack.pop();
                }
            }
        }
        while(stack.size() != 0){
            answer += stack.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("solution1(\"1 2 Z 3\") = " + solution1("1 2 Z 3"));
        System.out.println("solution1(\"10 20 30 40\") = " + solution1("10 20 30 40"));
        System.out.println("solution1(\"10 Z 20 Z 1\") = " + solution1("10 Z 20 Z 1"));
        System.out.println("solution1(\"1 1 Z Z\") = " + solution1("1 1 Z Z"));
        System.out.println("solution1(\"1 1 Z Z Z\") = " + solution1("1 1 Z Z Z"));
        System.out.println("solution1(\"100 1 Z Z Z\") = " + solution1("1 1 Z Z Z"));

        System.out.println();

        System.out.println("solution2(\"1 2 Z 3\") = " + solution2("1 2 Z 3"));
        System.out.println("solution2(\"10 20 30 40\") = " + solution2("10 20 30 40"));
        System.out.println("solution2(\"10 Z 20 Z 1\") = " + solution2("10 Z 20 Z 1"));
        System.out.println("solution2(\"1 1 Z Z\") = " + solution2("1 1 Z Z"));
        System.out.println("solution2(\"1 1 Z Z Z\") = " + solution2("1 1 Z Z Z"));
        System.out.println("solution2(\"100 1 Z Z Z\") = " + solution2("1 1 Z Z Z"));
    }
}
