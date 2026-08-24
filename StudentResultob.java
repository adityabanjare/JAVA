import java.util.Scanner;
class studentgrade{
    String name;
    int rollno;
    int sub1;
    int sub2;
    int sub3;

    public studentgrade(String name , int rollno , int sub1,int sub2,int sub3) {
        this.name = name;
        this.rollno = rollno;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }
    void show(){
        int average = (sub1+sub2+sub3)/3;
        System.out.println("The name of student is :"+name);
        System.out.println("The roll numbe of student is:"+rollno);
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
            System.out.println("Grade B");
        }
        else if(average>=50){
            System.out.println("Grade C+");
        }
        else if(average>=35){
            System.out.println("Grade C");
        }
        else{
            System.out.println("FAIL");
        }

    }
    
}
public class StudentResultob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student name:");
        String name = sc.nextLine();
        System.out.println("Enter the roll number of student:");
        int rollno = sc.nextInt();
        System.out.println("Enter the marks of subject one:");
        int sub1= sc.nextInt();
        System.out.println("Enter the marks of subuject two:");
        int sub2 = sc.nextInt();
        System.out.println("Enter the marks of subject three:");
        int sub3 = sc.nextInt();
        studentgrade m1 = new studentgrade(name, rollno , sub1, sub2, sub3);
        m1.show();
        sc.close();
    }
}
