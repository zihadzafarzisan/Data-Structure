public class matrixMultiplication {
    public static void main(String[] args) {
        int[][] arr1 = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
        int[][] arr2 = {
            {2,3,4},
            {5,6,7},
            {8,9,10}
        };
        int[][] result = multiplication(arr1, arr2);
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
    }
}
    public static int[][] multiplication(int[][] a, int[][] b){
        int[][] c = new int [a.length][b[0].length];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b[0].length; j++){
                for(int k = 0; k < b.length; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
}
