import java.util.Scanner;

public class CountUpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String name = sc.nextLine();
        int uppercount =0;
        int lowercount =0;
        for(int i =0; i<name.length(); i++){
            char letter = name.charAt(i);
            if(letter >= 'A' && letter<='Z'){
               uppercount++;
            }
            else if(letter>='a' && letter<='z'){
                lowercount++;
            }
        }
        System.out.println("letter in form of upper case:"+uppercount);
        System.out.println("letter in form of lower case:"+lowercount);
        sc.close();
    }
}
