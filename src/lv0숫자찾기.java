public class lv0숫자찾기 {
    public static int solution1(int num, int k){
        int answer = -1;
        for(int i = 1; i <= String.valueOf(num).length(); i++){
            if(Integer.parseInt(String.valueOf(num).split("")[i - 1]) == k) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static int solution2(int num, int k) {
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);
        int answer = numStr.indexOf(kStr);
        return answer < 0 ? -1 : answer + 1 ;
    }

    public static int solution3(int num, int k) {
        return ("-" + num).indexOf(String.valueOf(k));
    }


    public static void main(String[] args) {
        System.out.println("solution1(29183, 1) = " + solution1(29183, 1));
        System.out.println("solution2(232443, 4) = " + solution2(232443, 4));
        System.out.println("solution3(123456, 7) = " + solution3(123456, 7));
    }
}
