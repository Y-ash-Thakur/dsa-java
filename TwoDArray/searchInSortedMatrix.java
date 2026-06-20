package TwoDArray;

public class searchInSortedMatrix {
    public static boolean search_in_a_sorted_matrix(int[][] matrix, int key){
        int row = 0;
        int col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("present at index :" + row + " " + col);
                return true;
            }
            else if (key < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        return false;
    }

    static void main(String[] args) {
        int [][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
        boolean result = search_in_a_sorted_matrix(matrix,27);
        System.out.println(result);
    }
}
