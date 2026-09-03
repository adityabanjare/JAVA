import java.util.Scanner;

public class StreakMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int streak = 0;

        while (true) {
            System.out.print("Aaj practice ki? (1 = Yes, 0 = No): ");
            int choice = sc.nextInt();

            if (choice == 1) {
                streak++;
                System.out.println("🔥 Current Streak: " + streak);
            } 
            else if (choice == 0) {
                streak = 0;
                System.out.println("Streak broken! 😢");
            } 
            else {
                System.out.println("Invalid input!");
            }

            System.out.print("Continue? (1 = Yes, 0 = No): ");
            int again = sc.nextInt();

            if (again == 0) {
                break;
            }
        }

        System.out.println("Final Streak: " + streak);
        sc.close();
    }
}