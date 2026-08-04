import java.util.Scanner;
public class Car {
    public static void carName(String name){
    System.out.println("name name is :"+name);
    }
    public static void main(String[] args){
        Scanner mycar= new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = mycar.nextLine();
        carName(name);
        mycar.close();
    }
    
}
