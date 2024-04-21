package construction.example;

public class Construction_exmple_01 {

	public Construction_exmple_01() {
		this(55,66,77,88);
		System.out.println("Default Constructor");
	}
	public Construction_exmple_01(int a) {
		this(22,33,44);  //this will go to three parameteirzed constructor
		System.out.println("Single Parameter Constructor.");
	}
	
	public Construction_exmple_01(int a, int b) {
		this();
		System.out.println("Two parameterized constructor..");
	}
	
	
	public Construction_exmple_01(int a,int b,int c) {
		this(33,44);
		System.out.println("Three paramterized constructor...");
		
	}
	
	public Construction_exmple_01(int a,int b,int c,int d) {
		
		System.out.println("Four Paramterized constructor....");
	}
	
	public static void main(String[] args) {
		
		Construction_exmple_01 ce=new Construction_exmple_01(11);
	
	}

}
