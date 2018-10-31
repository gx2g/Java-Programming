import java.util.Scanner;

public class TicTacToe {
    private static char [ ] [ ] ttt = new char [4] [4] ;
    private static int gameNum = 1;


    public static void main(String[] args)
    {//MAIN OPEN
        System.out.println("Welcome to play the game of guessing who is winning!");
        Scanner scan = new Scanner (System.in);
        String gameString;
        System.out.println("Please enter your game " + gameNum + " board (* to exit) > ");
        gameString = scan.nextLine();
        int n;

        while (!gameString.equals("*"))
        {//WHILE LOOP OPEN
            System.out.println("Your game " + gameNum + " is as follows: ");
            n = 0;
            ttt = new char [4][4];
            for(int i = 1 ; i < 4; i++)
            {//FOR LOOP OPEN
                for(int j = 1; j < 4; j++)
                {//NESTED FOR LOOP OPEN
                    ttt [i][j]= gameString.charAt(n);
                    n++;
                }//NESTED FOR LOOP CLOSED
            }//FOR LOOP CLOSED
            System.out.println(ttt[1][1] + "" + ttt[1][2] + "" + ttt[1][3]);
            System.out.println(ttt[2][1] + "" + ttt[2][2] + "" + ttt[2][3]);
            System.out.println(ttt[3][1] + "" + ttt[3][2] + "" + ttt[3][3]);

            if(winRow1('O' , ttt))
                System.out.println("Your game " + gameNum + ": O won the game by row 1");
            if(winRow2('O' , ttt))
                System.out.println("Your game " + gameNum + ": O won the game by row 2");
            if(winRow3('O' , ttt))
                System.out.println("Your game " + gameNum + ": O won the game by row 3");
            if(winRow1('X' , ttt))
                System.out.println("Your game " + gameNum + ": X won the game by row 1");
            if(winRow2('X' , ttt))
                System.out.println("Your game " + gameNum + ": X won the game by row 2");
            if(winRow3('X' , ttt))
                System.out.println("Your game " + gameNum + ": X won the game by row 3");
            if(winColumn1('O' , ttt))
                System.out.println("Your game " + gameNum + ": O won the game by Column 1");
            if(winColumn2('O' , ttt))
                System.out.println("Your game " + gameNum + ": O won the game by Column 2");
            if(winColumn3('O' , ttt))
                System.out.println("Your game " + gameNum + ": O won the game by Column 3");
            if(winColumn1('X' , ttt))
                System.out.println("Your game " + gameNum + ": X won the game by Column 1");
            if(winColumn2('X' , ttt))
                System.out.println("Your game " + gameNum + ": X won the game by Column 2");
            if(winColumn3('X' , ttt))
                System.out.println("Your game " + gameNum + ": X won the game by Column 3");
            if(winDiagonal1('O' , ttt))
                System.out.println("Your game " + gameNum + ": O won the game by diagonal 1");
            if(winDiagonal1('X' , ttt))
                System.out.println("Your game " + gameNum + ": X won the game by diagonal 1");
            if(winDiagonal2('O' , ttt))
                System.out.println("Your game " + gameNum + ": O won the game by diagonal 2");
            if(winDiagonal2('X' , ttt))
                System.out.println("Your game " + gameNum + ": X won the game by diagonal 2");

            gameNum++;

            System.out.print("Please enter your game " + gameNum + " board (* to exit) > ");
            gameString = scan.nextLine();




        }//WHILE LOOP CLOSED
    }//MAIN CLOSED

    public static boolean winDiagonal1( char player, char a [][])
    {
        if ( ttt[1][1] == player && ttt[2][2] == player && ttt[3][3] == player )
            return true;
        return false;
    }

    public static boolean winDiagonal2 (char player, char a [][])
    {
        if( ttt[1][3] == player && ttt[2][2] == player && ttt[3][1] == player )
            return true;
        return false;
    }
    public static boolean winRow1 (char player, char a [][])
    {
        if (ttt[1][1] == player && ttt[1][2] == player && ttt[1][3] == player)
            return true;
        return false;
    }

    public static boolean winRow2 (char player, char a [][])
    {
        if (ttt[2][1] == player && ttt[2][2] == player && ttt[2][3] == player)
            return true;
        return false;
    }

    public static boolean winRow3 (char player, char a [][])
    {
        if (ttt[3][1] == player && ttt[3][2] == player && ttt[3][3] == player)
            return true;
        return false;
    }
    public static boolean winColumn1 (char player, char a [][])
    {
        if (ttt[1][1] == player && ttt[2][1] == player && ttt [3][1] == player)
            return true;
        return false;
    }

    public static boolean winColumn2 (char player, char a [][])
    {
        if (ttt[1][2] == player && ttt[2][2] == player && ttt [3][2] == player)
            return true;
        return false;
    }

    public static boolean winColumn3 (char player, char a [][])
    {
        if (ttt[1][3] == player && ttt[2][3] == player && ttt [3][3] == player)
            return true;
        return false;
    }
}