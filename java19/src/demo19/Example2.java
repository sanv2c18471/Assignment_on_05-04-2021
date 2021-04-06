package demo19;
interface call{
	default void display() {
		System.out.println("Call Default Method");
	}
}
interface call2{
	public static void printable () {
		System.out.println("call2 Static Method");
	}
}
public class Example2 implements call{
 public static void main(String[] args) {
	 call2.printable();
	 Example2 ex = new  Example2();
    ex.display();
}
}
