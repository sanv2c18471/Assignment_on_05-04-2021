package demo19;

public interface Example1 {
public static void main(String[] args) {
	System.out.println("Welcome");
	Test1.print();
}
}
interface Test1{
	public static void print() {
		System.out.println("Static method");
	}
}