import java.util.Scanner;
class car{
    String companynameofcar;
    String modelname;
    String price;  
}
public class CarObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        car cr = new car();
        cr.companynameofcar= "mahindra";
        cr.modelname ="Thar roxx";
        cr.price = "25 Lakhs";
      System.out.println("The brand name of company is:"+cr.companynameofcar);
      System.out.println("The model name of car is:"+cr.modelname);
      System.out.println("The price of car is:"+cr.price);
      sc.close();

    }
}
