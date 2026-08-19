import java.util.Scanner;

class Mobile1{
    String BrandName;
    String ModelName;
    int price;
    Mobile1(String Brandname, String ModelName, int price){
        this.ModelName= ModelName;
        this.BrandName = Brandname;
        this.price = price;

    }

}
public class myfirstconstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the brand name of :-");
        String BrandName = sc.nextLine();
        System.out.println("Enter the model name of phone:-");
        String ModelName = sc.nextLine();
        System.out.println("Enter the price of phone:-");
        int price = sc.nextInt();
        Mobile1 m1= new Mobile1( ModelName,  BrandName, price);
        System.err.println("The brand name of mobile is:"+m1.BrandName);
        System.err.println("The brand name of mobile is:"+m1.ModelName);
        System.err.println("The brand name of mobile is:"+m1.price);
        sc.close();

    }
}
