package Array2D;

public class Search_Sorted {
    public static void Search(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1; // Start from the top-right corner

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Found at (" + row + ", " + col + ")");
                return;  // Exit after finding the key
            } 
            else if (key < matrix[row][col]) {
                col--;  // Move left
            } 
            else {
                row++;  // Move down
            }
        }

        System.out.println("Not found");
    }

    public static void main(String[] args) {
        int matrix[][] = { 
            { 10, 20, 30, 40 },
            { 15, 25, 35, 45 },
            { 27, 29, 37, 48 },
            { 32, 33, 39, 50 } 
        };
        int key = 33;
        Search(matrix, key);
    }
}
