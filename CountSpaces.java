import java.util.Scanner;
public class CountSpaces {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string name:");
        String name = sc.nextLine();
        int countspace=0;
        for(int i =0; i<name.length(); i++){
            char let = name.charAt(i);
            if(let == ' '){
                countspace++;
            }
        }
        System.out.println("the total number of space in entire string :"+countspace);
        sc.close();
    }
}
