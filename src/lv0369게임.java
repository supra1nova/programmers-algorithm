import java.util.Arrays;

public class lv0369게임 {

    public static int solution1(int order){
        return (int) Arrays.stream(String.valueOf(order).split("")).filter(i -> i.equals("3") || i.equals("6") || i.equals("9")).count();
    }

    public static int solution2(int order){
        int answer = 0;
        for(String str : String.valueOf(order).split("")){
            if(str.equals("3") || str.equals("6") || str.equals("9")) answer++;
        }
        return answer;
    }

    public static int solution3(int order) {
        return (int) Arrays.stream(String.valueOf(order).split("")).map(Integer::parseInt).filter(i -> i == 3 || i == 6 || i == 9).count();
    }

    public static void main(String[] args) {
        System.out.println("solution1(3) = " + solution1(3));
        System.out.println("solution1(29423) = " + solution1(29423));

        System.out.println("solution2(3) = " + solution2(3));
        System.out.println("solution2(29423) = " + solution2(29423));

        System.out.println("solution3(3) = " + solution3(3));
        System.out.println("solution3(29423) = " + solution3(29423));
    }
}
