public class copycon {
    int a ,b ;
    copycon(){
        a=10;
        b=20;
        System.out.println("no argument constructor called:");
    }
    copycon(int x ,int y){
        a=x;
        b=y;
        System.out.println("two argument constructor called:");
    }
  public static void main(String[] args) {
      copycon ob1=new copycon();
      copycon ob2 = new copycon(100,200);
  }
}
