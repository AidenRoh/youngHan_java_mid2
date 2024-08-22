package generic.ex1;

public class BoxMain3 {

	public static void main(String[] args) {
		GenericBox<Integer> integerBox = new GenericBox<Integer>();
		integerBox.set(10);
//		integerBox.set("letterA"); // Only Integer is acceptable
		Integer integer = integerBox.get();
		System.out.println("integer = " + integer);

		GenericBox<String> stringBox = new GenericBox<String>();
		stringBox.set("hello");
		String str = stringBox.get();
		System.out.println("str = " + str);

		//All types are available
		GenericBox<Double> doubleBox = new GenericBox<Double>();
		doubleBox.set(10.5);
		Double doubleValue = doubleBox.get();
		System.out.println("aDouble = " + doubleValue);

		//Type assumption:
		GenericBox<Integer> integer2 = new GenericBox<>(); // <-- doesn't need to declare type here
	}
}
