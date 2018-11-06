import java.util.*;

//Game class
class TicTacToe
{
    Scanner in = new Scanner(System.in);

    //Playing game function
    public void play()
    {
        Scanner in = new Scanner(System.in);

        //For holding board
        char[][] board = new char[3][3];

        int n = 1;
        //Initializing with spaces
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                board[i][j] = (char)(n++ + '0');
            }
        }

        //Displaying board
        displayBoard(board);

        //Iterate either game is Tie or there is a win
        while(true)
        {
            //Player plays round
            playerPlays(board, 'X');

            //Displaying board
            displayBoard(board);

            //Checking for win
            if(checkWin(board, 'X'))
            {
                System.out.println("\n Player X Wins \n");
                System.exit(0);
            }

            //Checking for tie
            if(checkTie(board))
            {
                System.out.println("\n Tie game \n");
                System.exit(0);
            }

            //Player plays round
            playerPlays(board, 'O');

            //Displaying board
            displayBoard(board);

            //Checking for win
            if(checkWin(board, 'O'))
            {
                System.out.println("\n Player O Wins \n");
                System.exit(0);
            }

            //Checking for tie
            if(checkTie(board))
            {
                System.out.println("Tie game");
                System.exit(0);
            }
        }
    }

    // Prompt the user for row & column index. Continue asking until an empty cell is selected. set the cell to 'O'
    public void playerPlays(char [][] board, char symbol)
    {
        int row=0, col=0, pos;

        //Scanner class object
        Scanner reader = new Scanner(System.in);

        //Prompting user for position
        System.out.print("\n What Square Player " + symbol + "? ");
        pos = reader.nextInt();

        //Mapping position to row and col
        switch(pos)
        {
            case 1:   row=0; col=0; break;
            case 2:   row=0; col=1; break;
            case 3:   row=0; col=2; break;
            case 4:   row=1; col=0; break;
            case 5:   row=1; col=1; break;
            case 6:   row=1; col=2; break;
            case 7:   row=2; col=0; break;
            case 8:   row=2; col=1; break;
            case 9:   row=2; col=2; break;
        }

        //Validating position
        while(row < 0 || row > 2 || col < 0 || col > 2)
        {
            //Re-prompting user
            System.out.print("\n Invalid location!!! Re-Enter row, column pair: ");
            row = reader.nextInt();
            col = reader.nextInt();
        }

        //If cell is already filled
        while(board[row][col] == 'X' || board[row][col] == 'O')
        {
            //Re-prompting user
            System.out.print("\n Cell already filled!!! Re-Enter row, column pair: ");
            row = reader.nextInt();
            col = reader.nextInt();
        }

        //Storing in cell
        board[row][col] = symbol;
    }

    // Check by row, column, and diagonals
    public boolean checkWin( char[][] board, char ch)
    {
        //Check by row, column and then both the diagonals
        return (board[0][0] == ch && board[0][1] == ch && board[0][2] == ch) ||
                (board[1][0] == ch && board[1][1] == ch && board[1][2] == ch) ||
                (board[2][0] == ch && board[2][1] == ch && board[2][2] == ch) ||
                (board[0][0] == ch && board[1][0] == ch && board[2][0] == ch) ||
                (board[0][1] == ch && board[1][1] == ch && board[2][1] == ch) ||
                (board[0][2] == ch && board[1][2] == ch && board[2][2] == ch) ||
                (board[0][0] == ch && board[1][1] == ch && board[2][2] == ch) ||
                (board[0][2] == ch && board[1][1] == ch && board[2][0] == ch);
    }


    // check for tie. If there no empty cells, then it is a tie
    public boolean checkTie( char [][] board)
    {
        int i, j;

        //Outer loop for rows
        for(i=0; i<3; i++)
        {
            //Inner loop for columns
            for(j=0; j<3; j++)
            {
                //Board is not Full
                if(board[i][j] != 'X' || board[i][j] != 'O')
                    return false;
            }
        }

        //Board Full
        return true;
    }

    // Display the board
    public void displayBoard( char [][] board)
    {
        int i, j;

        System.out.print("\n\n The board is: \n");

        System.out.print("\n |---|---|---| \n");

        //Outer loop for rows
        for(i=0; i<3; i++)
        {
            //Inner loop for columns
            for(j=0; j<3; j++)
            {
                //Printing character
                System.out.print(" | " + board[i][j]);
            }

            System.out.print(" |");

            //Printing footer
            System.out.print("\n |---|---|---| \n");
        }

        System.out.println("\n");
    }
}

//Driver class
class TicTacToePlay
{
    //Main method
    public static void main(String args[])
    {
        //Creating object
        TicTacToe playGame = new TicTacToe();

        //Playing game
        playGame.play();
    }

}