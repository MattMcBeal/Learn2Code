import java.util.Scanner;

class ReturningThings{
	public static void main(String args[]){
		int num = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("please enter a number: ");
		num = scanner.nextLine();
		num = addTwo(num);
		System.out.prinln("The new number is: " + num);	
	}

	int addTwo(int number){
		return (number + 2);
	}
}
