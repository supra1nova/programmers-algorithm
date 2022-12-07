public class lv0다항식더하기 {
    public static String solution1(String polynomial){
        String[] strArr = polynomial.split(" [+] ");
        int num = 0;
        int xNum = 0;
        for(String str : strArr){
            if(str.contains("x")){
                // 1. x의 계수가 한자리가 아닐수 있다는 점 => str.split("")이 아니라 str.replace("x", "")로 접근
                xNum += str.length() == 1 ? 1 : Integer.parseInt(str.replace("x", ""));
            } else {
                num += Integer.parseInt(str);
            }
        }
        // 2. x의 계수가 0일 수도 있다는 점 => 없을 떄는 공란으로 접근
        String xStrNum = xNum == 1 ? "x" : xNum == 0 ? "" : xNum + "x";
        // 3. 상수 항이 0일 수도 있다는 점 => 없을 때 공란으로 접근
        return xStrNum.equals("") ? String.valueOf(num) : num == 0 ? xStrNum : xStrNum + " + " + num;
    }

    public static String solution2(String polynomial) {
        String[] arr = polynomial.split(" \\+ ");
        int xNum = 0;
        int num = 0;
        for (String s : arr){
            if(s.contains("x")){
                //x의 계수가 한자리수가 아닐 수 있다.
                xNum += s.length() == 1? 1 : Integer.parseInt(s.replace("x",""));
            }else{
                num+=Integer.parseInt(s);
            }
        }
        StringBuilder answer = new StringBuilder();
        answer.append(xNum == 0 ? num : num == 0 ? xNum + "x" : xNum + "x" + " + " + num);
        answer = new StringBuilder(answer.toString().replace("1x", "x"));
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println("solution1(\"3x + 7 + x\") = " + solution1("3x + 7 + x"));
        System.out.println("solution1(\"x + x + x\") = " + solution1("x + x + x"));
        System.out.println("solution1(\"x\") = " + solution1("x"));
        System.out.println("solution1(\"3x + 7 + x + 3x + 7 + x + 3x + 7 + x\") = " + solution1("3x + 7 + x + 3x + 7 + x + 3x + 7 + x"));
        System.out.println("solution1(\"3x + 4x + 5x + 8x + 2x\") = " + solution1("3x + 4x + 5x + 8x + 2x"));
        System.out.println("solution1(\"3 + 2 + 1 + 5\") = " + solution1("3 + 2 + 1 + 5"));
    }
}
