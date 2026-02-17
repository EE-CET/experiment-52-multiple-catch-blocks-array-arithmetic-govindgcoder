import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args){
        // Read N
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // Create array and read N integers
        int[] arr = new int[N];
        sc.nextLine();
        for (int i = 0; i < N; i++) {
          arr[i]=sc.nextInt();
        }
        sc.nextLine();
        // Read index
        int index = sc.nextInt();
        sc.nextLine();
        // Read divisor
        int divisor = sc.nextInt();
        sc.close(); 
        try {
            try{
                System.out.print(arr[index]/divisor);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.print("Invalid Index");
            }
        } catch(ArithmeticException e){
            System.out.print("Divide by zero error");
        }
        // TODO: catch ArrayIndexOutOfBoundsException -> Print "Invalid Index"
        // TODO: catch ArithmeticException -> Print "Divide by zero error"
    }
}
