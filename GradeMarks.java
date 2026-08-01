import java.util.Scanner;

public class GradeMarks {
    public static void grade(int num){
    if(num>=90){
        System.out.println("grade=A+");
    }
    else if(num>=80){
        System.out.println("grade=A");
    }
    else if(num>=70){
        System.out.println("grade=B+");
    }
    else if(num>=60){
        System.out.println("grade=b");
    }
    else if(num>=50){
        System.out.println("grade=c+");
    }
    else if(num>=35){
        System.out.println("grade=c");
    }
    else{
        System.out.println("fail");
    }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int num=sc.nextInt();
        grade(num);
        sc.close();
    }
}
