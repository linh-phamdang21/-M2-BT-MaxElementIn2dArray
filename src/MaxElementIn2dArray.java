public class MaxElementIn2dArray {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int max = array[0][0];
        int tempI = 0, tempJ = 0;
        System.out.println("2d Array is: ");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] == max){
                    tempI = i;
                    tempJ = j;
                }
            }
        }
        System.out.println("Max Element in Array is " + max + " at position [" + tempI + "][" + tempJ + "]");
    }
}
