import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String name = sc.nextLine();

        for (int i = 0; i < name.length(); i++) {

            int count = 0;

            // Character ki frequency count karna
            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(i) == name.charAt(j)) {
                    count++;
                }
            }

            // Check: character pehle aa chuka hai ya nahi
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (name.charAt(i) == name.charAt(k)) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (!alreadyPrinted) {
                System.out.println(name.charAt(i) + " = " + count);
            }
        }

        sc.close();
    }
}