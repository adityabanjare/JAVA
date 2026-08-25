class student{
    String name ; 
    String Classsection;
    int rollno;

    student() {
        this.name ="unkown";
        this.Classsection = "unkown";
        this.rollno= 0;
    }
    student(String name, String Classsection){
        this.name = name;
        this.Classsection = Classsection;
        this.rollno = 0;
    }
    student(String name, int rollno){
        this.name = name;
        this.Classsection = "unkown";
        this.rollno = rollno;
    }
    void display(){
        System.out.println("The name of student is :"+name);
        System.out.println("The class section of student is :"+Classsection);
        System.out.println("The roll number of that student is :"+rollno);
    }
    
}
public class Studentoverloading {
    public static void main(String[] args) {
       student m1 =new student();
       student m2 =new student("aditya","A");
       student m3 = new student("sonu",10);
       m1.display();
       m2.display();
       m3.display();
    }
}
