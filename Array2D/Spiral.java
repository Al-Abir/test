package Array2D;

public class Spiral {
    public static void spiralMatrix(int matrix[][]) {

        int stRow = 0;
        int stCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (stRow <= endRow && stCol <= endCol) {

            // Traverse from left to right (Top row)
            for (int i = stCol; i <= endCol; i++) {
                System.out.print(matrix[stRow][i] + " ");
            }
            stRow++;

            // Traverse from top to bottom (Right column)
            for (int j = stRow; j <= endRow; j++) {
                System.out.print(matrix[j][endCol] + " ");
            }
            endCol--;

            // Traverse from right to left (Bottom row)
            if (stRow <= endRow) { 
                for (int k = endCol; k >= stCol; k--) {
                    System.out.print(matrix[endRow][k] + " ");
                }
                endRow--;
            }

            // Traverse from bottom to top (Left column)
            if (stCol <= endCol) { 
                for (int i = endRow; i >= stRow; i--) {
                    System.out.print(matrix[i][stCol] + " ");
                }
                stCol++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
        };
        spiralMatrix(matrix);
    }
}
