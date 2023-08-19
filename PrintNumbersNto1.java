import java.util.Scanner;

public class PrintNumbersNto1 {
    public static void printNto1(int N){
        if(N>0){
            System.out.println(N);
            printNto1(N-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number ");
        int N=scanner.nextInt();
        PrintNumbersNto1.printNto1(N);
    }
}
