import java.util.Scanner;
public class addfirstandlast {
    public static void addFirstAndLast(int num){
        int Lastnumber, digit ,temp,firstnumber;
            digit = num%10;
            Lastnumber=digit;
            temp = num;
            while(temp>=10){
            
                temp= temp/10;
            }
            firstnumber = temp;
            int sum = firstnumber + Lastnumber;
            System.out.println("the sumation of first and last number:"+sum);
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        addFirstAndLast(num);
        sc.close();
    }
    
}
