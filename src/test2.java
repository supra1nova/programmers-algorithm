import java.util.*;

public class test2 {

    /*
        int n : 컵의 갯수, int[][] d : 변경대상 컵 좌표, int k : 위치를 찾고자 하는 컵의 번호
     */
    public static int solution1(int n, int[][] d, int k){
        int answer = 0;
        // 컵 리스트 생성
        List<Integer> cupList = new ArrayList();
        for(int i = 1; i <= n; i++){
            cupList.add(i);
        }
        // 변경대상 컵 좌표들을 리스트로 생성
        List<Integer> indexList = new ArrayList();
        for(int[] e : d){
            for(int f : e){
                indexList.add(f);
            }
        }
        System.out.println(indexList);
        System.out.println("cupList = " + cupList);

        System.out.println("indexList.size() = " + indexList.size());
        // 변경 대상 좌표 내용으로 자리를 변경
        for(int i = 0; i < indexList.size(); i+=2){
            int firstIndex = indexList.get(i)-1;
            int secondIndex = indexList.get(i+1)-1;
            int firstNum = cupList.get(firstIndex);
            int secondNum = cupList.get(secondIndex);
            cupList.remove(firstIndex);
            cupList.add(firstIndex, secondNum);
            cupList.remove(secondIndex);
            cupList.add(secondIndex, firstNum);
            System.out.println("1");
        }
        System.out.println("cupList = " + cupList);

        // 컵리스트를 이용해 인덱스를 키로 한 map을 생성
        Map<Integer, Integer> cupMap = new LinkedHashMap<>();
        int i = 1;
        for(int num : cupList){
            cupMap.put(i, num);
            i++;
        }

        // 위치를 찾고하자는 번호와 일치하는 번호에 해당하는 인덱스 번호를 answer에 넣어준다.
        Iterator iterator = cupMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, Integer> subMap = (Map.Entry<Integer, Integer>) iterator.next();
            if(subMap.getValue() == k){
                answer = subMap.getKey();
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("solution1(10, new int[][]{{2,3},{3,5}}, 3) = " + solution1(10, new int[][]{{2, 3}, {3, 5},{7, 4},{4,6}}, 7));
    }
}
