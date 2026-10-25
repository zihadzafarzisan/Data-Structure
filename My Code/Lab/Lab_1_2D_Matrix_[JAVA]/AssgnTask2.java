//Assignment Task 02: Matrix Compression
class AssgnTask2{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer[][] compressMatrix( Integer[][] matrix ){

        //For this task you'll need to create new 2D array
        
        //TO DO

        //remove the line below and return the newly created Compressed 2D matrix
    int m = matrix.length;
    int n = matrix[0].length;

    Integer[][] result = new Integer[m / 2][n / 2];

    for (int r = 0; r < m / 2; r++) {
        for (int c = 0; c < n / 2; c++) {
            int i = 2 * r;
            int j = 2 * c;
            result[r][c] = matrix[i][j] + matrix[i][j + 1]
                         + matrix[i + 1][j] + matrix[i + 1][j + 1];
        }
    }
        return result;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}
