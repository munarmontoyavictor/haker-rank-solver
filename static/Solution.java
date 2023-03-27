mport java.io.*;
import java.util.*;

public class Solution {
     // Height
      static  int B;  
     // Breadth
      static  int H;
      static {
          try(Scanner input = new Scanner(System.in)) {
              B = input.nextInt();
               H =  input.nextInt();
          }
      }

    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
           
            if(B <= 0 || H <= 0) throw new Exception("java.lang.Exception: Breadth and height must be positive");
            System.out.println(B*H);
            
        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
