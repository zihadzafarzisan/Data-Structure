public class rowToColumn {
    public static void main(String[] args){
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        for (int j = 0; j<arr[0].length; j++){
            for (int[] arr1 : arr) {
                System.out.println(arr1[j]);
            }
            System.out.println();
        }
    }
}
