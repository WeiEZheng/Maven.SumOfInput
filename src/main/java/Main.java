import java.util.Scanner;

/**
 *
 */
public class Main {

    public static void main(String[] args){
        Main Nsum = new Main();
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter an integer:"); //prompt for input
        int N = Scan.nextInt(); //gets an integer from user
        System.out.println("The sum of 1 to "+N+" is "
                +nsum.sumToN(N)); //calls method and prints result
        Scan.close();
    }
    public Integer sumToN(Integer N){
        int sum = 0, i=1;
        while (i<=N){
            sum += i; // add i to the rolling sum
            i++;
        }
        return sum;
    }
}
