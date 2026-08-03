package Recurssion;

public class Word_search {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char board[][]={{'A','B','C','E'},
                        {'S','F','C','S'},
                        {'A','D','E','E'}};
        String word="ABCCED";
        System.out.print(exist(board,word));
    }
    public boolean exist(char[][] board, String word) {
        boolean visited[][]=new boolean[board.length][board[0].length];
        boolean flag=false;
          for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(solve(board,i,j,board.length-1,board[0].length-1,word,0,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean solve(char board[][],int cr,int cc,int er,int ec,String word,int idex,boolean visited[][]){
        //boundary chck,already visied ,not equal to the word
         if(cr>er || cc>ec || cc<0 || cr<0 || board[cr][cc]!=word.charAt(idex) || visited[cr][cc]==true ){
            return false;
        }
        //base case
        if(idex==word.length()-1){
            return true;
        }
      //backtracking
        visited[cr][cc]=true;
        boolean up=solve(board,cr-1,cc,er,ec,word,idex+1,visited);
        boolean down=solve(board,cr+1,cc,er,ec,word,idex+1,visited);
        boolean right=solve(board,cr,cc+1,er,ec,word,idex+1,visited);
        boolean left=solve(board,cr,cc-1,er,ec,word,idex+1,visited);
        visited[cr][cc]=false;
        
        return up||down||right||left;

    }
}
