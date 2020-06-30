class A{
	static String name = "a";
	static String greeting(){
		return "class a";
	}
}
class B extends A{
	static String name ="b";
	static String greeting(){
		return "class b";
	     }	
	}
public class Test3{
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.name);
		System.out.println(b.greeting()); 
	}
}