class mobile{
    String brandname;
    String modelname;
    int price;

     mobile(String brandname,String modelname,int price) {
        this.brandname = brandname;
        this.modelname = modelname;
        this.price = price;
        
    }

     mobile(String brandname) {
        this.brandname = brandname;
        this.modelname = "unkown";
        this.price = 0 ;
        
    }

     mobile() {
        this.brandname = "unkown";
        this.modelname = "unkown";
        this.price = 0;
    }
    void display(){
        System.out.println("The brand name of company:"+brandname);
        System.out.println("The model of phone is :"+modelname);
        System.out.println("The of price of phone is :"+price);
    }
    
}

public class constructoroverloadingMobile {
    public static void main(String[] args) {
        mobile m1 = new mobile();
        mobile m2 = new mobile("vivo","vfive",2000);
        mobile m3 = new mobile("iphone");
        m1.display();
        m2.display();
        m3.display();
    }
}
