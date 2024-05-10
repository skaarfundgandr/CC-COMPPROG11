class HelloObject {
	private String greet;

	public HelloObject(String str){
		this.greet = str;
	}

	public void morningGreeting(){
		System.out.println("Good morning " + greet + "!");
	}
	public void eveningGreeting(){
		System.out.println("Good evening " + greet + "!");
	}
}

public class Exercise2 {
	public static void main(String[] args) {
		HelloObject hello;

		hello = new HelloObject("World");

		hello.morningGreeting();
		hello.eveningGreeting();
	}
}