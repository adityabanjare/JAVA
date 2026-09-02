import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;
        int uppercase = 0;
        int lowercase = 0;

        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {

                vowels++;
            }
            else if ((ch >= 'A' && ch <= 'Z') ||
                     (ch >= 'a' && ch <= 'z')) {

                consonants++;
            }

            if (ch >= '0' && ch <= '9') {
                digits++;
            }

            if (ch == ' ') {
                spaces++;
            }

            if (ch >= 'A' && ch <= 'Z') {
                uppercase++;
            }

            if (ch >= 'a' && ch <= 'z') {
                lowercase++;
            }
        }

        System.out.println("Characters: " + sentence.length());
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);

        sc.close();
    }
}
