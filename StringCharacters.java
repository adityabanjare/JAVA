import java.util.Scanner;

public class StringCharacters {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the your name:");

        String name = sc.nextLine();

        for(int i =0; i<name.length(); i++){

            char letter =name.charAt(i);

            System.out.println("index"+ i + "="+letter);

        }
      sc.close();

    }
    
}
