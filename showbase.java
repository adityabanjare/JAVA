
public class showbase {
void showdata(){
     System.out.println("hello from base:");

}    
class der extends base{
    public static void main(String[] args) {
        der ob = new der();
        ob.show_data();
    }
}
}
