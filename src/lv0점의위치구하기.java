public class lv0점의위치구하기 {
    public static int solution1(int[] dot){
        int x = dot[0];
        int y = dot[1];
        return x > 0 && y > 0 ? 1 : x < 0 && y > 0 ? 2 : x < 0 && y < 0 ? 3 : 4;
    }
    public static void main(String[] args){
        System.out.println("solution1(new int[]{-2,3}) = " + solution1(new int[]{-2, 3}));
    }
}
