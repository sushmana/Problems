import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;
import static java.lang.Integer.min;


public class Codejam14 {
        public static void main(String args[]) throws IOException {
            Scanner b = new Scanner(System.in);
            int T = b.nextInt();

            int A, B, alpha, beta, Y, initialA, initialB, DecoA, DecoB, no_of_couples, total_offspring, alpha_offspringA, beta_offspringB, Remaining_offspring, offspringA, offspringB, onedaylaterA, onedaylaterB, nextdayA = 0, nextdayB = 0;

            for (int i = 1; i <= T; i++) {
                //Step1:Initial Population of the Acrobat and Bouncoids
                A = b.nextInt();
                B = b.nextInt();
                alpha = b.nextInt();
                beta = b.nextInt();
                Y = b.nextInt();
                initialA = A;
                initialB = B;
                System.out.println("Case #:" + i);
                if (Y == 0) {
                    System.out.println(A + " " + B);
                } else {
                    if(Y<=100)
                        for (int j = 1; j <= Y; j++) {

                            //Step2:Decommossioning
                            DecoA = A / 100;
                            DecoB = B / 100;

                            //step3:min(A,B)
                            no_of_couples = min(A, B);
                            //Step4:calculate no of offspring by getting 2% of min(A,B)
                            total_offspring = (2 * no_of_couples) / 100;
                            //Step5:offspringA=alpha% of total_offspring and offspringB=beta% of total_offspring
                            alpha_offspringA = (alpha * total_offspring) / 100;
                            beta_offspringB = (beta * total_offspring) / 100;
                            //Step6:Remaining offspring
                            Remaining_offspring = total_offspring - alpha_offspringA - beta_offspringB;
                            //step7:Split the remaining offspring (if odd then add 1 more in B)
                            if (Remaining_offspring % 2 == 0) {
                                offspringA = Remaining_offspring / 2;
                                offspringB = Remaining_offspring / 2;
                            } else {
                                offspringA = Remaining_offspring / 2;
                                offspringB = (Remaining_offspring / 2) + 1;
                            }
                            //Step8: Acrobots and Bouncoids in one day later
                            onedaylaterA = initialA + alpha_offspringA + offspringA;
                            onedaylaterB = initialB + beta_offspringB + offspringB;

                            //Step9: Acrobots and Bouncoids in next day
                            nextdayA = onedaylaterA - DecoA;
                            nextdayB = onedaylaterB - DecoB;
                            A=nextdayA;
                            B=nextdayB;
                            initialA=A;
                            initialB=B;
                        }

                    System.out.println(nextdayA + " " + nextdayB);
                }
            }
        }
}
