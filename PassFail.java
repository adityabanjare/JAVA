import java.util.Scanner;
public class PassFail {
    public static void passFail(int num)
{
    if(num>=35){
        System.out.println("result =Pass");
    }
    else{
        System.out.println("result =fail");
    }

}
public static void main(String[] args){
   
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the num:");
  int num = sc.nextInt();
  passFail(num);
  sc.close();
}
}
