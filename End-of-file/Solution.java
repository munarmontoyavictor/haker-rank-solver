import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int currentNumberLine = 1;
        try(Scanner lines = new Scanner(System.in)) {
            while (lines.hasNext() != false) {
                String currentLine = lines.nextLine();
                System.out.println(currentNumberLine + " " + currentLine); 
                currentNumberLine++;
            }
        }
    }
}
