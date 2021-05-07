import java.util.Arrays;
import java.util.Scanner;

class Main {

    private static int n;

    private static void printSpiralOrder(int[] arr, int[][] mat)
    {
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        int index = 0;

        while (true)
        {
            if (left > right) {
                break;
            }

            // print top row
            for (int i = left; i <= right; i++) {
                mat[top][i] = arr[index++];
            }
            top++;

            if (top > bottom) {
                break;
            }

            // print right column
            for (int i = top; i <= bottom; i++) {
                mat[i][right] = arr[index++];
            }
            right--;

            if (left > right) {
                break;
            }

            // print bottom row
            for (int i = right; i >= left; i--) {
                mat[bottom][i] = arr[index++];
            }
            bottom--;

            if (top > bottom) {
                break;
            }

            // print left column
            for (int i = bottom; i >= top; i--) {
                mat[i][left] = arr[index++];
            }
            left++;
        }
    }

    // Create Spiral Matrix from given array
    public static void main(String[] args) throws IndexOutOfBoundsException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n*n];
        for (int i = 0; i < (n * n); i++) {

            arr[i] = i+1;
        }

        int[][] mat = new int[n][n];
        printSpiralOrder(arr, mat);

        for (int[] r: mat) {
            for(int i:r) {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}







