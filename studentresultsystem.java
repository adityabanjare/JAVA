import java.util.Scanner;
public class studentresultsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter the number of subject;");
        int n = sc.nextInt();
        System.out.println("enter the name of student");
        String name = sc.next();
        System.out.println("enter the roll number of student:");
        int rollnum=sc.nextInt();
        System.out.println("enter the marks of chemistry:");
        float chemistrymarks = sc.nextFloat();
        System.out.println("enter the marks of physics:");
        float physicsmarks=sc.nextFloat();
        System.out.println("enter the marks of maths:");
        float mathsmarks=sc.nextFloat();
        float sum = chemistrymarks+physicsmarks+mathsmarks;
         float average= sum /n;
         System.out.println("The name of student:"+name);
         System.out.println("The roll number of student :"+rollnum);
         System.out.println("total marks of student is:"+sum);
         System.out.println("the average of student marks:"+average);
         if(average>=90){
            System.out.println("Grade A+");
         }
         else if(average>=80){
            System.out.println("Grade A");
         }
         else if(average>=70){
            System.out.println("Grade B+");
         }
         else if(average>=60){
            System.out.println("Greade B");
         }
         else if(average>=50){
            System.out.println("Grade C+");
         }
         else if(average>=35){
            System.out.println("Grade C");
         }
         else {
            System.out.println("result = fail");
         }
    
    sc.close();
        }
}