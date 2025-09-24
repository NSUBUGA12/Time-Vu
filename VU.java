
package time.vu;

import java.util.Scanner;
public class VU {
  //number of seconds is 60
    //the minutes totsl upto 1
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter the number of seconds");
         int allSeconds = scanner.nextInt();
          int minutes = allSeconds / 60;
            int remainingSeconds = allSeconds % 60;
       
       System.out.println(allSeconds + "seconds is equal to"+ minutes + "minute(s) and"+ remainingSeconds + "second(s).");
        
        
    }
}
