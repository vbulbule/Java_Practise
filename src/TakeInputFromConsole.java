import java.util.Scanner;

public class TakeInputFromConsole {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        String name = sc.nextLine();
        System.out.println("Enter your Marks : "); 

        sc.nextLine();
        sc.nextInt();
        sc.nextLong();
        sc.nextBoolean();
    }
}
