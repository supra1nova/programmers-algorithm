public class lv0캐릭터의좌표 {
    public static int[] solution1(String[] keyinput, int[] board){
        int[] answer = new int[]{0, 0};
        for(int i = 0; i < keyinput.length; i++){
            if(keyinput[i].equals("left")) {
                answer[0] = Math.max(answer[0] - 1, board[0] / 2 * -1);
            } else if(keyinput[i].equals("right")){
                answer[0] = Math.min(answer[0] + 1, board[0] / 2);
            } else if(keyinput[i].equals("down")){
                answer[1] = Math.max(answer[1] - 1, board[1] / 2 * -1);
            } else{
                answer[1] = Math.min(answer[1] + 1, board[1] / 2);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        solution1(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11});
    }
}
