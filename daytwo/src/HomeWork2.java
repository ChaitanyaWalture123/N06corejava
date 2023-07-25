import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int number=sc.nextInt();
		int count=0;
		do {
			
			number/=10;
			count++;
		}while(number !=0);
		System.out.println("no of digits in the number are : "+count);

	}

}
