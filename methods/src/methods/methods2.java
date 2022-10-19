package methods;

public class methods2 {

	public static void main(String[] args) {
		String message = "Today weather is good.";
		String newMessage= giveCity();
		System.out.println(newMessage);
		int number=total(5,7);
		System.out.println(number);
		int total =total2(2,3,4,5,6,7);
		System.out.println(total);

	}
	public static void add() {
		System.out.println("Added");
	}
	
	public static void delete() {
		System.out.println("Deleted");
	}
	
	public static void update() {
		System.out.println("Updated");
	}
	public static int total(int num1,int num2) {
		return num1+num2;
	}
	public static int total2(int... numbers) {
		int total=0;
		for (int number:numbers) {
			total+=number;
		}
		return total;
	}
	
	
	public static String giveCity() {
		return "Ankara";
	} 

}
