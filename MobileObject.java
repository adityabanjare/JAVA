import java.util.Scanner;
class mobileobject{
    String BrandName;
    String ModelName;
    int price;
}
public class MobileObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mobileobject m1 = new mobileobject();
        System.out.println("Enter the brand name of :-");
        m1.BrandName=sc.nextLine();
        System.out.println("Enter the Model name of that phone:-");
        m1.ModelName=sc.nextLine();
        System.out.println("Enter the price of brand name:-");
        m1.price = sc.nextInt();
        System.err.println("The brand name of mobile is:"+m1.BrandName);
        System.err.println("The brand name of mobile is:"+m1.ModelName);
        System.err.println("The brand name of mobile is:"+m1.price);
        sc.close();

    }
}
