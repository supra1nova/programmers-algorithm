public class lv07의개수 {
    public static int solution1(int[] array){
        int count = 0;
        for(int num : array){
            String[] strArr = String.valueOf(num).split("");
            for(String str : strArr){
                if(str.equals("7")) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("solution1(new int[]{7, 77, 17}) = " + solution1(new int[]{7, 77, 17}));
        System.out.println("solution1(new int[]{10, 29}) = " + solution1(new int[]{10, 29}));
    }
}
