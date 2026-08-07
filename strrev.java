import java.util.Scanner;
public class strrev {
    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("your name is :");
        System.out.println("reverser name is :");
        int n = name.length();
        for(int i = n-1; i>=0;i--){
            System.out.println(name.charAt(i));
        }

    }
    
}
