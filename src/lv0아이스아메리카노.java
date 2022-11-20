public class lv0아이스아메리카노 {
    public static int[] solution1(int money){
        int price = 5_500;
        int cnt = money/price;
        int rest = money - (cnt * price);
        return new int[]{cnt, rest};
    }

    public static void main(String[] args){

    }
}
