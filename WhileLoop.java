import java.utils.Scanner;

class WhileLoop{
	public static void main(String args[]){
		String input;
		Scanner iScan = new Scanner(System.in);

		while(input != "Hello there"){
			System.out.prinln("Please type 'Hello there'");
			input = iScan.nextLine();
		}
		System.out.prinln("Thanks");
	}
}
