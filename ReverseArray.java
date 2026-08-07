import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[]={""};
        System.out.println("enter the array element:");
        String name = sc.nextLine();
        for(int i =str.length()-1; i>=0; i--){
            System.out.println(str[i]);
        }
    }
    
}
