public class Constructor {

    public static void main(String [] args){
        Constructor2 c2  = new Constructor2();
        Constructor2 c3  = new Constructor2();

        c2.age = 12;
        
        c3.age=13;
        c2.printAge();
        c3.printAge();
    }
}

 class Constructor2{
    static int age;

    void printAge(){
        System.out.println("AGE : " + this.age);
    }

}