public class lv0세균증식 {
    public static int solution1(int n, int t){
        return (int) (n * Math.pow(2, t));
    }

    public static int solution2(int n, int t) {
        int answer = 0;
        answer = n << t;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("solution1(2, 10) = " + solution1(2, 10));
        System.out.println("solution2(7, 15) = " + solution2(7, 15));
    }
}
