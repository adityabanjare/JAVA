 import java.util.Scanner;
class Mainj {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    int num , digit,count=0;
    System.out.println("enter the number:");
    num = sc.nextInt();
     while(num!=0){
         digit=num%2;
         if(digit%2!=0){
             count++;
         }
         num=num/10;
     }
     System.out.println("total number of odd number:"+count);
    
    sc.close();
    }
} 
    
