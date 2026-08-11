import java.util.Scanner;
public class countarraysnature {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int positive = 0; 
      int negative = 0;
      int zero=0;
      System.out.println("Enter the five element of arrays element :");
      int a[]= new int[5];
      for(int i =0; i<a.length; i++){
        a[i]=sc.nextInt();
      }
      for(int i =0; i<a.length; i++){
        if(a[i]>0){
            positive++;
        }
        else if(a[i]<0){
           negative++;
        }
        else {
            zero++;
        }
      }
      System.out.println("Total positive number:"+positive);
      System.out.println("Total negative number:"+negative);
      sc.close();
  }    
}
