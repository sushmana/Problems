import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(isSorted(arr));

    }
    public static boolean isSorted(int[] a)
    {
        int i;
        for(i = 0; i < a.length-1; i ++){
        if (a[i] > a[i+1]) {
            return false;
        }
    }
    return true;
    }
}