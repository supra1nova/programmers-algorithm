public class lv0영어가싫어요 {

    public static long solution1(String numbers){
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] intArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for(int i = 0 ; i < strArr.length; i++){
            numbers = numbers.replace(strArr[i], intArr[i]);
        }
        return Long.parseLong(numbers);
    }


    public static long solution2(String numbers) {

        String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbers_arr.length; i++) {
            numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
        }

        long answer = Long.parseLong(numbers);
        return answer;
    }

    public static void main(String[] args){
        System.out.println("solution1(\"onetwothreefourfivesixseveneightnine\") = " + solution1("onetwothreefourfivesixseveneightnine"));
        System.out.println("solution1(\"onefourzerosixseven\") = " + solution1("onefourzerosixseven"));

        System.out.println("solution2(\"onetwothreefourfivesixseveneightnine\") = " + solution2("onetwothreefourfivesixseveneightnine"));
        System.out.println("solution2(\"onefourzerosixseven\") = " + solution2("onefourzerosixseven"));
    }
}
