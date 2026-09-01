import java.util.Scanner;

public class sonuCharacterCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String name = sc.nextLine();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        for (int i = 0; i < name.length(); i++) {

            char letter = name.charAt(i);

            if (letter == 'a' || letter == 'e' || letter == 'i' ||
                letter == 'o' || letter == 'u' ||
                letter == 'A' || letter == 'E' || letter == 'I' ||
                letter == 'O' || letter == 'U') {

                vowels++;
            }

            else if ((letter >= 'a' && letter <= 'z') ||
                     (letter >= 'A' && letter <= 'Z')) {

                consonants++;
            }

            else if (letter >= '0' && letter <= '9') {

                digits++;
            }

            else if (letter == ' ') {

                spaces++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);

        sc.close();
    }
}
