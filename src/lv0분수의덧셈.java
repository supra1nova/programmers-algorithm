public class lv0분수의덧셈 {
    public static int[] solution1(int denum1, int num1, int denum2, int num2) {
        // 분자
        int top = num1*denum2 + num2*denum1;
        // 분모
        int bottom = num1*num2;
        // 최소 공배수
        int maximum = 1;
        // 약분
        for(int i = 1 ; i <= top ; i ++) {
            if(top%i == 0 && bottom%i == 0) {
                maximum = i;
            }
        }
        return new int[]{top/maximum, bottom/maximum};
    }

    public static int GCD(int num1, int num2) {
        if (num1 % num2 == 0)
            return num2;
        return GCD(num2, num1 % num2);
    }

    public static int[] solution2(int denum1, int num1, int denum2, int num2) {
        int[] answer;

        denum1 *= num2;
        denum2 *= num1;

        answer = new int[]{denum1 + denum2, num1 * num2};

        int greatest_common_divisor = GCD(answer[0], answer[1]);
        answer[0] /= greatest_common_divisor;
        answer[1] /= greatest_common_divisor;

        return answer;
    }

    public static void main(String[] args) {
        int[] a = solution1(9,2,1,3);
        System.out.println("a[0] = " + a[0]);
        System.out.println("a[1] = " + a[1]);
        System.out.println("a.toString() = " + a.toString());

        int[] b = solution2(1,2,3,4);
        System.out.println("b[0] = " + b[0]);
        System.out.println("b[1] = " + b[1]);
        System.out.println("b = " + b);
    }

}