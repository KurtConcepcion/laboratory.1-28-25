
package namewithage;
import java.util.Scanner;

public class NameWithAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Enter your Age ");
        int age = scanner.nextInt();
        
        System.out.println("My Name is Kurt and I am " + age + " Years old.");
        scanner.close();
        
       
        
       
    }
    
}
