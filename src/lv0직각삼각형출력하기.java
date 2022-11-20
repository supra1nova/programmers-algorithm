import java.util.Scanner;

public class lv0직각삼각형출력하기 {
    public static void solution1(){
        System.out.print("직각 삼각형 밑변의 길이를 입력해 주세요 : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = "";
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                result += "*";
            }
            result += "\n";
        }
        System.out.println(result);
    }
    public static void solution2(){
        System.out.print("직각 삼각형 밑변의 길이를 입력해 주세요 : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("*".repeat(i));
        }
    }

    public static void main(String[] args) {
        solution1();
        solution2();
    }
}
