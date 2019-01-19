package RunniExuma;

public class Runner {
    public class TokenPassRunner{
        public static void main(String[] args){
            TokenPass testGame = new TokenPass(5);
            int[] testBoard = testGame.getBoard();
            System.out.println("Construct Test Board: ");
            for (int i=0; i<testBoard.length; i++){
                System.out.print(testBoard[i]+" ");
            }
            System.out.println();

            testGame.distributeCurrentPlayerTokens();
            System.out.println(" After distributing tokens from the player "+testGame.getCurrentPlayer()+": ");
            for (int i=0; i<testBoard.length; i++){
                System.out.print(testBoard[i]+" ");
            }
        }
    }
}
