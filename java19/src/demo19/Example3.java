package demo19;
interface Alpha{
	default void show1() {
		System.out.println("default method");		
	}
	//default void display() {
		//System.out.println("Default Method for alpha");
	//}
}
interface Alpha1{
	public int call();
	abstract void run();
}
interface Alpha2{
	public int eat();
	public static void show() {
		System.out.println("Static show method");
	}
	default void display() {
		System.out.println("Default Method for alpha2");
	}
}
public class Example3 implements Alpha,Alpha1,Alpha2{
	public void show1() {
		System.out.println("Show Method for Main Class Example3");
		Alpha.super.show1();
	}

  public static void main(String[] args) {
	Example3 ex = new Example3();
	ex.show1();
	ex.display();
	ex.eat();
	ex.run();
	ex.call();
}

@Override
public int eat() {
	// TODO Auto-generated method stub
	System.out.println("Eating Method");
	return 0;
}

@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("Run Method");
}

@Override
public int call() {
	// TODO Auto-generated method stub
	System.out.println("Call Method");
	return 0;
}
}
