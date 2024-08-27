package mypack;

public class BlockDEmo {

	private static int count;
	private String msg;

	static {// static is keyword//no need to call 
		count = 100;
		// msg = "Hello"// in static block we can't access non-static data member
		System.out.println("Inside Static Block ");// static block execute before main method.and it executes only once
	}
	{
		msg = "Hello";// non static can be access in initial
		count = 200;
		System.out.println("Inside Iniatilization Block");
	}

	public BlockDEmo() {
		System.out.println("Inside default constructor");
	}

	public BlockDEmo(String msg) {// p constructor
		super();
		this.msg = msg;
		System.out.println("Inside Parameterized constructor");
	}

	public static void main(String[] args) {
		System.out.println("Inside Main method");
		System.out.println("Count : " + count);
		System.out.println();
		BlockDEmo demo = new BlockDEmo();
		System.out.println("Message is : " + demo.msg);
		System.out.println("Count : " + count);
		System.out.println();
		BlockDEmo demo1 = new BlockDEmo("Welcome");
		System.out.println("Message : " + demo1.msg);

	}

}
