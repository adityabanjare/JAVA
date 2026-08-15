public class ClassA{

	public int age ;
	public String name;
	public int roll; 
	
	
	public void printDetails(){
		System.out.println("------------------");
		System.out.println("Name :" + this.name);
		System.out.println("Age :" + this.age);
		System.out.println("Roll :" + this.roll);

	}

	//parimeter constructor
	public ClassA(int age , String name, int roll){
		
		//initialization
		this.age = age;
		this.name = name;
		this.roll = roll; 
	}

	
	
	public static void main(String [] args){
		
		ClassA a1 =  new ClassA(20, "Sonu" ,3097 );

		a1.printDetails();
	}	 
}
