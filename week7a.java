import java.util.Random;
import java.util.Scanner;

public class week7a {
    public static void main(String[] args) {
        int x1, x2;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Boundaries : ");
        x1=sc.nextInt();
        x2=sc.nextInt();
        if(x1>0){
            int r = rand.nextInt(x2-x1)+x1;
            System.out.println("Random Number : "+r);
        }
    }
}
