import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.*;
        import java.io.BufferedReader;

public class Codejamio14 {

    public static void main(String args[]) throws IOException {
        Scanner bf = new Scanner(System.in);
        int T =bf.nextInt();


        String[] st = new String[T+1];

        bf.nextLine();

        for (int i = 0;i<T; i++) {
            st[i] = " "+bf.nextLine()+" ";

        }

        for(int i=0;i<T;i++){
            System.out.println("Case #"+ (i+1)+":");

            System.out.print("+");
            for(int j=0;j<st[i].length();j++)
                System.out.print("-");
            System.out.println("+");

            System.out.println("|"+st[i]+"|");

            System.out.print("+");
            for(int j=0;j<st[i].length();j++)
                System.out.print("-");
            System.out.println("+");
        }

    }
}

