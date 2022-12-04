public class lv1콜라츠추측 {
    public static int solution1(int num){
        int counter = 0;
        long longNum = num;
        while(longNum != 1){
            if(counter > 500) {
                counter = -1;
                break;
            }
            longNum = longNum % 2 == 0 ? longNum / 2 : (longNum * 3) + 1;
            counter++;
        }
        return counter;
    }

    public static int solution2(int num) {
        long n = (long) num;
        for (int i = 0; i < 500; i++) {
            if (n == 1) return i;
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("solution1(1) = " + solution1(1));
        System.out.println("solution1(6) = " + solution1(6));
        System.out.println("solution1(16) = " + solution1(16));
        System.out.println("solution1(11) = " + solution1(11));
        System.out.println("solution2(626331) = " + solution2(626331));
    }
}
