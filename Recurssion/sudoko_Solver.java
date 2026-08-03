public class sudoko_Solver {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int board[][]={{3,0,6,5,0,8,4,0,0},
                       {5,2,0,0,0,0,0,0,0},
                       {0,8,7,0,0,0,0,3,1},
                       {0,0,3,0,1,0,0,8,0},
                       {9,0,0,8,6,3,0,0,5},
                       {0,5,0,0,9,0,6,0,0},
                       {1,3,0,0,0,0,2,5,0},
                       {0,0,0,0,0,0,0,7,4},
                       {0,0,5,2,0,6,3,0,9}};
        if(solve(board)){
            print(board);
        }
        else{
            System.out.print("No solution exists");
        }
    }
    public static boolean 
}