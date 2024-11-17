import java.util.*;

public class StringTokenSum {  // Renamed class to avoid confusion with java.util.StringTokenizer
    public static void main(String[] args) {
        int sum = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter integers separated by spaces:");

        String s = obj.nextLine();  // Read the input line
        StringTokenizer tokenizer = new StringTokenizer(s, " ");  // Tokenize the string by spaces
        
        while (tokenizer.hasMoreTokens()) {
            String temp = tokenizer.nextToken();  // Get the next token
            int n = Integer.parseInt(temp);  // Parse it as an integer
            System.out.println(n);  // Print the integer
            sum += n;  // Add the integer to the sum
        }
        
        System.out.println("Sum: " + sum);  // Print the sum
    }
}
