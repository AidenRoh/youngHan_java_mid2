package generic.ex1;

public class BoxMain2 {

	public static void main(String[] args) {
		ObjectBox integerBox = new ObjectBox();
		integerBox.set(10);
		Integer integer = (Integer) integerBox.get(); // Object --> Integer casting
		System.out.println("integer = " + integer);

		ObjectBox stringBox = new ObjectBox();
		stringBox.set("hello");
		String string = (String) stringBox.get(); // Object --> String casting
		System.out.println("string = " + string);

		//transferring parameter of wrong type
		integerBox.set("letterA");
		Integer result = (Integer) integerBox.get(); // String --> Integer casting exception
		System.out.println("result = " + result);
	}
}
