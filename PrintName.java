import java.util.Scanner;

//print the name N time without loops
public class PrintName {
    public static void print(int N){

        if(N>0) {
            print(N-1);//function repeatedly calling itself until it reaches the base condition
            System.out.println("Java");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number how many times you need to print the string");
        int N=scanner.nextInt();
        PrintName.print(N); //Method call
    }
}
