import java.util.*;

public class test {

    public static int solution1(int money, int[] costs){
        int answer = 0;

        int[] coins = new int[]{1,5,10,50,100,500};
        Map<Integer, Double> ratioMap = new LinkedHashMap<>();
        for(int i = 0; i < coins.length; i++){
            ratioMap.put(coins[i], (double) (costs[i]*100)/(coins[i]*100) );
        }

        System.out.println("ratioMap = " + ratioMap);

        List<Map.Entry<Integer, Double>> entries = new LinkedList<>(ratioMap.entrySet());
        Collections.sort(entries, ((o1, o2) -> o1.getValue().compareTo(o2.getValue())));

        LinkedHashMap<Integer, Double> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<Integer, Double> entry : entries){
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("sortedMap = " + sortedMap);

        List<Integer> coinList = new ArrayList<>(sortedMap.keySet());
        System.out.println("coinList = " + coinList);

        Map<Integer, Integer> resultMap = new LinkedHashMap<>();

        for(int i = 0; i < coins.length; i++){
            resultMap.put(coinList.get(i), money / coinList.get(i));
            money -= coinList.get(i) * resultMap.get(coinList.get(i));
        }
        System.out.println("resultMap = " + resultMap);

        List<Map.Entry<Integer, Integer>> rentries = new LinkedList<>(resultMap.entrySet());
        Collections.sort(rentries, ((o1, o2) -> o1.getKey().compareTo(o2.getKey())));
        System.out.println("rentries = " + rentries);

        int i = 0;
        for(int cost : costs){
            System.out.println("rentries.get(i) = " + rentries.get(i));
            answer += rentries.get(i).getValue() * cost;
            i++;
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println("solution1(4578, new int[]{1,4,99,35,50,1000}) = " + solution1(4578, new int[]{1, 4, 99, 35, 50, 1000}));
    }
}
