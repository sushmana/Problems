import java.io.IOException;
import java.util.Scanner;

class Main{
            public static int m,n;
            public static void main(String[] args) throws IOException {

                Scanner sc=new Scanner(System.in);
                m=sc.nextInt();
                n=sc.nextInt();
                int[][] arr = new int[m][n];
                int[][] rotatedmatrix=new int[n][m];
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        arr[i][j]=sc.nextInt();
                    }
                }
                for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++){
                        rotatedmatrix[i][j]=arr[j][i];
                    }
                }
                for(int i=0;i<n;i++){
                    for(int j=m-1;j>=0;j--){
                        System.out.print(rotatedmatrix[i][j]+" ");
                    }
                    System.out.println();
                }
            }
        }
