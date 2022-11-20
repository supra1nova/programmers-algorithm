public class lv0피자나눠먹기2 {
    // 인원 n명이 모두 양의 피자 조각을 먹기 위한 주문량 연산
    public static int solution1(int n) {
        // 최소공약수 초기화
        int gcd = 0;
        // 피자 한 판 당 조각 갯수
        int size = 6;
        // 최소공약수 연산
        for(int i = 1; i<=n && i<=size; i++){
            if(n%i == 0 && size%i == 0){
                gcd = i;
            }
        }
        return n * size / gcd / 6;
    }

    public static int solution2(int n) {
        int answer = 1;
        while(true){
            if(6*answer%n==0) break;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution1(8));
        System.out.println(solution2(8));
    }
}
