import java.util.Scanner;

public class splitclass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String name = sc.nextLine();
        int totalletter = name.length();
        String sentence[] = name.split("");
        for(int i =0; i<sentence.length; i++){
            System.out.println("The split words are:"+sentence[i]);
        }
        System.out.println("The total number of letter is:"+totalletter);
        sc.close();
    }
}
