import java.io.*;
public class SonuBuff {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the your name:");
        String name = br.readLine();
        System.out.println("enter your age:");
        String n  = br.readLine();
        int age = Integer.parseInt(n);
        System.out.println("your name is:"+name);
        System.out.println("your age is :"+age);
    }
    
}


