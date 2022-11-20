public class lv0옷가게할인받기 {
    public static int solution1(int price) {
        int answer = 0;
        double low = 0.05;
        double middle = 0.1;
        double high = 0.2;
        if(price >= 500_000){
            answer = (int)(price * (1-high));
        } else if(price >= 300_000){
            answer = (int)(price * (1-middle));
        } else if(price >= 100_000){
            answer = (int)(price * (1-low));
        } else{
            answer = price;
        }
        return answer;
    }

    public static int solution2(int price){
        double low = 0.05;
        double middle = 0.1;
        double high = 0.2;
        if(price>=500_000) return (int)(price*(1-low));
        if(price>=300_000) return (int)(price*(1-middle));
        if(price>=100_000) return (int)(price*(1-high));
        return price;
    }

    public static void main(String[] args){
        System.out.println("solution1(150_000) = " + solution2(150_000));
        System.out.println("solution1(350_000) = " + solution2(350_000));
        System.out.println("solution1(500_000) = " + solution2(500_000));
    }
}
