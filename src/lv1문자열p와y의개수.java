public class lv1문자열p와y의개수 {
    public static boolean solution1(String s){
        String[] strArr = s.split("");
        int pCounter = 0;
        int yCounter = 0;
        for(String str : strArr){
            if(str.equals("p") || str.equals("P")) {
                pCounter++;
            } else if(str.equals("y") || str.equals("Y")){
                yCounter++;
            };
        }
        return pCounter == yCounter ? true : false;
    }

    public static boolean solution2(String s) {
        s = s.toUpperCase();
        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }

    public static void main(String[] args) {
        System.out.println("solution1(\"pPoooyY\") = " + solution1("pPoooyY"));
        System.out.println("solution2(\"Pyy\") = " + solution2("Pyy"));
    }
}
