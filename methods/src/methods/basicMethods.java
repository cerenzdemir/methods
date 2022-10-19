package methods;

public class basicMethods {

	public static void main(String[] args) {
		numFound();
	}
	public static void numFound(){
		
			int[] numb = new int [] {1,2,3,5,7,9,0};
			int search =5;
			
			boolean isThere=false;
			
			for (int numbers :numb) {
				if(numbers==search) {
					isThere = true;
					break;
				}
			}
			if(isThere) {
				message="number is found"+search;
				giveMessage(message);
			}else {
				giveMessage("Number not found"+search);
			}
			
	}
	public static void giveMessage(string message) {
		System.out.println(message);
	}
}
