import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your name:");
        String name = sc.nextLine();
        int lettnumbers = name.length();
        char firstname = name.charAt(0);
        int count =0;
        for(int i =0; i<name.length(); i++){
            char letter = name.charAt(i);
        if(letter == 'a'|| letter =='i'||letter == 'e'||letter =='o'|| letter =='u'){
            count++;
        }
    }
        System.out.println("The total number of vowel in name is:"+count);
        System.out.println("the total number in a string is "+lettnumbers);
        System.out.println("The first letter of the string is :"+firstname);
        sc.close();
    }
}
