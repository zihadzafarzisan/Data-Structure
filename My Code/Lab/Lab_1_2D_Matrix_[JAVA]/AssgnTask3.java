//Assignment Task 03: Game Arena
class AssgnTask3{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static void playGame( Integer[][] arena ){

        //For this task you don't need to create any new 2D array
        //just print the result inside the function
        
        //TO DO
        int m = arena.length;
    int n = arena[0].length;
    int points = 0;

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            // a player is a positive multiple of 50
            if (arena[i][j] > 0 && arena[i][j] % 50 == 0) {
                if (i - 1 >= 0 && arena[i - 1][j] == 2) points += 2;  // up
                if (i + 1 < m  && arena[i + 1][j] == 2) points += 2;  // down
                if (j - 1 >= 0 && arena[i][j - 1] == 2) points += 2;  // left
                if (j + 1 < n  && arena[i][j + 1] == 2) points += 2;  // right
            }
        }
    }

    if (points >= 10) {
        System.out.println("Points Gained: " + points + ". Your team has survived the game.");
    } else {
        System.out.println("Points Gained: " + points + ". Your team is out.");
    }
}

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] arena = {
            {0,2,2,0},
            {50,1,2,0},
            {2,2,2,0},
            {1,100,2,0}
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena );

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
            {0,2,2,0,2},
            {1,50,2,1,100},
            {2,2,2,0,2},
            {0,200,2,0,0}
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena1 );
    }
}
