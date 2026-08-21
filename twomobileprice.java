import java.util.Scanner;
class mobilename1{
    String companyname1;
    String modelname1;
    int price1;

    public mobilename1(String companyname1, String modelname1,int price1) {
        this.companyname1= companyname1;
        this.modelname1 = modelname1;
        this.price1 = price1;
    }
    
}
class mobilename2{
    String companyname2;
    String modelname2;
    int price2;
    public mobilename2(String companyname2, String modelname2,int price2) {
        this.companyname2= companyname2;
        this.modelname2 = modelname2;
        this.price2 = price2;
    }
}
public class twomobileprice {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the of name of mobile company:");
     String companyname1 = sc.nextLine();
     System.out.println("Enter model name of mobile:");
     String modelname1 =sc.nextLine();
     System.out.println("Enter the price of mobile");
     int price1=sc.nextInt();
     sc.nextLine();
     System.out.println("enter the of name of mobile company:");
     String companyname2 = sc.nextLine();
     System.out.println("Enter model name of mobile:");
     String modelname2 =sc.nextLine();
     System.out.println("Enter the price of mobile");
     int price2=sc.nextInt();
     mobilename1 m1 = new  mobilename1(companyname1,modelname1,price1);
     mobilename2 m2 = new mobilename2(companyname2,modelname2,price2);

     if (m1.price1 > m2.price2) {
            System.out.println("Expensive mobile: " + m1.companyname1);
            System.out.println("Model: " + m1.modelname1);
            System.out.println("Price: " + m1.price1);
        }
        else if (m2.price2 > m1.price1) {
            System.out.println("Expensive mobile: " + m2.companyname2);
            System.out.println("Model: " + m2.modelname2);
            System.out.println("Price: " + m2.price2);
        }
        else {
            System.out.println("Both mobiles have the same price.");
        }

        sc.close();
    }
}

