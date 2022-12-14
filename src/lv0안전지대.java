public class lv0안전지대 {
    public static int solution1(int[][] board){
        int[][] newBoard = new int[board.length][board.length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 1){
                    newBoard[i][j] = 1;
                    if(i - 1 >= 0){
                        newBoard[i-1][j] = 1;
                    }
                    if(j - 1 >= 0){
                        newBoard[i][j-1] = 1;
                    }
                    if(i - 1 >= 0 && j - 1 >= 0){
                        newBoard[i-1][j-1] = 1;
                    }
                    if(i + 1 < board.length){
                        newBoard[i+1][j] = 1;
                    }
                    if(j + 1 < board.length){
                        newBoard[i][j+1] = 1;
                    }
                    if(i + 1 < board.length && j + 1 < board.length){
                        newBoard[i+1][j+1] = 1;
                    }
                    if(i + 1 < board.length && j - 1 >= 0) {
                        newBoard[i + 1][j - 1] = 1;
                    }
                    if(i - 1 >= 0 && j + 1 < board.length){
                        newBoard[i-1][j+1] = 1;
                    }
                }
            }
        }
        int answer = 0;
        for(int i = 0; i < newBoard.length; i++){
            for(int j = 0; j < newBoard.length; j++){
                if(newBoard[i][j] == 0){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("solution1(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}) = " + solution1(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}));
        System.out.println("solution1(new int[][]{{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},}) = " + solution1(new int[][]{{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1},}));
    }
}
