// ********************************************************************

/*     Program Author:    Robert Resendez                           */
/*         Class Name:    CO-SCI 290 Java Programming               */
/*      Course Lesson:    Week6 Project 4                           */
/*        Discription:    Computer Stations / Computer Lab Status   */

// ********************************************************************


import java.util.Scanner;


public class userStation {

    public static void main(String[] args) {

        // create an array assign it to function call
        int[][] arr = intializeStation();

        // create an array
        int[] logOff = new int[18];

        // variable declaration
        int rows = 4;
        int count = 0;

        // create a scanner object called sc
        Scanner sc = new Scanner(System.in);

        // variable declaration
        int userID,labNumber,stationNumber;

        // system out discription
        System.out.println("***********************************");
        System.out.println("LAB STATUS: Lab # Computer Stations");
        System.out.println("***********************************");

        while(true) {

            System.out.println("MAIN MENU \n0) Quit\n1) Simulate login\n2) Simulate logoff\n3) Search");
            System.out.println("--------------------------------");
            int choice = sc.nextInt();

            //  If choice is 0 then break the loop

            if(choice == 0) {
                break;
            }

            // If choice is 1 take the user details for filling the stations in lab

            if(choice == 1) {

                System.out.println("Enter the 5 digit ID number of the user logging in:");
                userID = sc.nextInt();

                System.out.println("Enter the lab number the user is logging in from (1-4):");
                labNumber = sc.nextInt();

                System.out.println("Enter computer station number the user is logging in to (1-6):");
                stationNumber = sc.nextInt();

                arr[labNumber - 1][stationNumber - 1] = userID;
                printStation(arr,rows);

            }

            // If choice is 2 take the user details for closing the stations in lab

            else if(choice == 2) {

                System.out.println("Enter the 5 digit ID number of the user log off:");
                userID = sc.nextInt();

                System.out.println("Enter the lab number the user for logOff (1-4):");
                labNumber = sc.nextInt();

                System.out.println("Enter computer station number the user for logOff (1-6):");
                stationNumber = sc.nextInt();

                // Collecting the user logoff details
                logOff[count++] = userID;
                arr[labNumber - 1][stationNumber - 1] = 0;
                printStation(arr,rows);

            }

            else if( choice == 3 ) {

                System.out.println("Enter the 5 digit ID number of the user log off:");
                userID = sc.nextInt();

                // Search in the current lab labs
                int found = search(arr,rows,userID);;

                // Search in the logoff details
                if(found == 0) {

                    int i;
                    for(i = 0 ; i < count;i++) {

                        if(logOff[i] == userID) {
                            System.out.println("User "+userID+" is logged off.");
                            break;
                        }

                    }

                }

                else {
                    System.out.println("User details None");
                }

            }

        }

        sc.close();

    }

    private static int search(int[][] array,int rows, int userID) {

        int i,j;

        // First search user present in the station if present print userid,station number,lab number

        for(i = 0; i < rows; i++) {
            for(j = 0; j < array[i].length ; j++) {
                if(array[i][j] == userID) {

                    System.out.println("User "+userID+" is loggedIn In station Number ."+(j+1)+" In Lab Number "+(i+1));
                    return 1;
                }
            }
        }

        return 0;

    }

    // Method to initialize the array in the beginning
    private static int[][] intializeStation() {

        int[][] data = { {0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0}, {0,0,0} };
        return data;
    }

    // Method to print the station and lab info
    private static void printStation(int[][] arr,int rows) {

        int i,j;
        for(i = 0; i < rows ; i++) {
            System.out.print((i+1)+" ");
            for(j = 0; j < arr[i].length ; j++) {
                if(arr[i][j] == 0) {
                    System.out.print((j+1)+": empty ");
                }

                else {
                    System.out.print((j+1)+": "+arr[i][j]+" ");
                }
            }

            System.out.println("");
        }
    }
}