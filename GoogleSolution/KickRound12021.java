import java.util.Scanner;

public class KickRound12021 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T,N,K,count=0;

        T=sc.nextInt();
        for(int i=1;i<=T;i++){

            N=sc.nextInt();
            K=sc.nextInt();
            if((1 < K) && (K<N/2)){
                String s=sc.nextLine().toUpperCase();
                char[] ch = s.toCharArray();
                System.out.println("Case #:"+i);
                for(int j=0;j<N;j++){
                    if((ch[j]==ch[j+1])){
                        count++;
                    }
                    if(count==K){
                        System.out.println("0");
                    }
                    else{
                        int r=count;
                        while(r==K) {
                            r++;
                        }
                        System.out.println(r);

                    }
                }
            }
        }
    }
}
