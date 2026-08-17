import java.util.Scanner;
class carbrand{
    String companyname;
    String modelname;
    int price;
    void display(){
        System.out.println("The name of car company is:"+companyname);
        System.out.println("The name of model :"+modelname);
        System.out.println("The price of car is:"+price);
    }

}
public class CarObject1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        carbrand cr = new carbrand();
        System.out.println("Enter the company name of car:");
        cr.companyname=sc.nextLine();
        System.out.println("Enter the model name of car:");
        cr.modelname= sc.nextLine();
        System.out.println("Enter the price of car:");
        cr.price = sc.nextInt();
        cr.display();
        sc.close();

    }
}
