import java.io.Console;

public class Pattern22 {
    public static void main(String[] args) {
         int i, j,n=6;
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // inner loop to print space
            for (j = 1; j <= n - i; j++) {
                
               System.out.print(" ");
            }
            // inner loop to print star
            for (j = 1; j <= i; j++) {
                System.out.print("*"+" ");
                // Console.Write(i + " ");
            }
            // print new line for each row
            // Console.WriteLine();
            System.out.println();
        }
    }
}
