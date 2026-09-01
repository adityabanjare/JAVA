import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string name:");
        String name = sc.nextLine();
        int countdigit=0;
        for(int i =0; i<name.length(); i++){
            char letter = name.charAt(i);
            if(letter >='0' && letter<='9'){
               countdigit++;
            }
        }
        System.out.println("total number digit in entire string is:"+countdigit);
        sc.close();
        
        
    }
}
