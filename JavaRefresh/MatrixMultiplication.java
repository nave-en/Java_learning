import java.util.Arrays;

public class MatrixMultiplication {
   public static void main(String[] args) {
        int mat1[][] = {{1, 2}, {3, 4}};
        int mat2[][] = {{3, 4}, {1, 2}};
        int rowLen = mat1.length;
        int colLen = mat2.length;
        int res[][] = new int[rowLen][colLen];
        for (int rowInd = 0; rowInd < rowLen; rowInd++) {
            for (int colInd = 0; colInd < colLen; colInd++) {
                int temp = 0;
                for (int k = 0; k < colLen; k++) {
                    System.out.println(mat1[rowInd][k] * mat2[k][colInd]);
                    temp += mat1[rowInd][k] * mat2[k][colInd];
                }
                res[rowInd][colInd] = temp;
            }
        }

        System.out.println(Arrays.deepToString(res));
   } 
}
