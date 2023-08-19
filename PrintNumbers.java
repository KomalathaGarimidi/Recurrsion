import java.util.Scanner;

//print 1 to N numbers without loops
public class PrintNumbers {
    public static void printN(int N){
        if(N>0){
            printN(N-1);
            System.out.println(N);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number ");
        int N=scanner.nextInt();
        PrintNumbers.printN(N);
    }
}
