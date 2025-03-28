import java.util.Arrays;

public class MatrixAdd {
    public static void main(String[] args) {
        int [][]mat1 = {{1, 2, 3}, {4, 5, 6}};
        int [][]mat2 = {{6, 5, 4}, {3, 2, 1}};
        int rowLen = mat1.length;
        int colLen = mat1[0].length;
        int res[][] = new int[rowLen][colLen];
        for (int rowInd = 0; rowInd < rowLen; rowInd++) {
            for (int colInd = 0; colInd < colLen; colInd++) {
                res[rowInd][colInd] = mat1[rowInd][colInd] + mat2[rowInd][colInd];
            }
        }

        System.out.println(Arrays.deepToString(res));
    }
}
