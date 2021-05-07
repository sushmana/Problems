import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        //input the element of matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int bookSeats = sc.nextInt();
        boolean flag=false;
//
        for (int i = 0; i < m; i++) {
            int count=0;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    count++;
                    if (count == bookSeats) {
                        System.out.println(i + 1);
                        flag=true;
                        break;
                    }
                }
                else{
                    count=0;
                }
            }if(flag)break;

        }
        if(!flag){
            System.out.println(0);
        }
    }

}