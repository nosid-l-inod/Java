// Java Multidimensional array

// Matrix/Multidimensional array

// matrix[Column number][Row Number]


public class Matrix {
    public static void main(String[] args) {

        // Declare and allocate memory
        String[][] names = new String[5][5]; // Can store 25 elements

        // 2D array
        int[][] ages = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Calculate the length of each row
        System.out.println("Length of row 1: " + ages[0].length);
        System.out.println("Length of row 2: " + ages[1].length);

        // Print all the elements in matrix
        // For of
        for (int[] age : ages) {
            for (int i : age) {
                System.out.println(i);
            }
        };


        // 3D array
        int[][][] test = {
                {
                    {1, -2, 3},
                    {2, 3, 4}
                },
                {
                    {-4, -5, 6, 9},
                    {1},
                    {2, 3}
                }
        };

        // Loop 3D array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }


    }
}
