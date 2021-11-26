package arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int [] [] matrix = {{45, 32, 4}, {23, 43, 45, 56}};

        for (int i = 0; i < matrix.length; i++){ //rows
            for (int j = 0; j < matrix[i].length; j++){//columns
                System.out.printf("Element in position %d%d is %d%n",i,j,matrix[i][j]);
            }
        }
    }
}
