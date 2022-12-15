public class lv0외계어사전 {
    public static int solution1(String[] spell, String[] dic){
        int answer = 2;
        for(int i = 0; i < dic.length; i++){
            boolean temp = false;
            for(int j = 0; j < spell.length; j++){
                temp = dic[i].contains(spell[j]) ? true : false;
                if(temp != true){
                    break;
                }
            }
            if(temp == true){
                answer = 1;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println("solution1(new String[]{\"p\", \"o\", \"s\"}, new String[]{\"sod\", \"eocd\", \"qixm\", \"adio\", \"soo\"}) = " + solution1(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println("solution1(new String[]{\"z\", \"d\", \"x\"}, new String[]{\"def\", \"dww\", \"dzx\", \"loveaw\"}) = " + solution1(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
        System.out.println("solution1(new String[]{\"s\", \"o\", \"m\", \"d\"}, new String[]{\"moos\", \"dzx\", \"smm\", \"sunmmo\", \"som\"}) = " + solution1(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
    }
}
