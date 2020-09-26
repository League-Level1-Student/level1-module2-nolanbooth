package _01_getters_and_setters;

public class RunnerClass {
	public static void main(String[] args) {
		GetterSetter gs = new GetterSetter();
		
		gs.setNumber(70);
		int number = gs.getNumber();
		System.out.println("Number is " + number);
	gs.setString("bill");
	String name = gs.getString();
	System.out.println("Name is "+name);
	}
}
