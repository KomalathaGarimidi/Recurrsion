import java.util.Scanner;

public class FactorialOfANumber {
    public static int factorial(int N){
        if(N==1 || N==0 ){
            return 1;
        }
        return N*factorial(N-1);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number ");
        int N=scanner.nextInt();
        System.out.println(FactorialOfANumber.factorial(N));
    }
}
