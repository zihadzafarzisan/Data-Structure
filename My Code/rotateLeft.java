public class rotateLeft {
      public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
         transpose(arr);
        swapRow(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    /*public static void rotation(int[][] arr){
        transpose(arr);
        swapRow(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    */
     public static void swapRow(int[][] arr){
        for(int i = 0; i < arr.length/2; i++){
            for(int j = 0; j < arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[arr.length -1-i][j];
                arr[arr.length-1-i][j] = temp;

            }
        }
    }
    public static void transpose(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
