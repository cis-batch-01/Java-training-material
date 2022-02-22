import java.util.Scanner;

public class TwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int sumOfNumbers = Integer.parseInt(scan.nextLine()); // x+y=number1
		int productOfNumbers = Integer.parseInt(scan.nextLine()); // x*y=number2
		// product===>sum*assum -assum*assum ===>x=assum
		int operand1 = 1, operand2 = 1;
		int temp = 1, i = 2;
		while (temp != operand1) {
			if (productOfNumbers % i == 0) {
				operand1 = sumOfNumbers - i;
				temp = productOfNumbers / i;
			}
			i++;
		}
		operand2 = sumOfNumbers - operand1; // x+y y=sum-x;
		System.out.println("x=" + operand1);
		System.out.println("y=" + operand2);

	}

}
