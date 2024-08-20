package HalfDiamond;
import java.util.Scanner;
public class HalfDiamondPattern; {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        System.out.println("*");
        //first half
        int i = 1;
        while (i<=n) {
            System.out.println("*");
            int = j=1;
            while (j<=i) { 
                System.out.println(j);
                j=j+1;
            }
            j=j-2;
            while (j>=1) {
                
                System.out.println(j);
                j=j-1;
            }
            System.out.println("*");
            System.out.println();
            i=i+1;
        }
        //second half
        i=1;
        while (i<=n-1) {
            System.out.println(j);
            j=j+1;
        }
        j=j-2;
        while (j>=1) {
            System.out.println(j);
            j=j-1;
        }
        System.out.println("*");
        System.out.println();
        i=i+1;
    }
    System.out.println("*");
}
