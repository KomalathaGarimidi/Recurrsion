import java.util.Scanner;

public class SumOfNNumbers {
    public static void sum(int i,int N){
        if(N==0){
            System.out.println(i);
            return;

        }

        sum(N+i,N-1);

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number ");
        int N=scanner.nextInt();
        int i=0;
        SumOfNNumbers.sum(i,N);
    }
}
