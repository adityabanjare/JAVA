interface one {
    void show ();
}
interface two {
    void disp();
}
class inter2 implements one {
    public void show(){
        System.out.println("show");
    }
    void myprint(){
        System.out.println("My print");
    }
    public static void main(String[] args) {
        inter2 ob = new inter2();
        ob.show();
        ob.myprint();
    }
} 