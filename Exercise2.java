package m1.task3;
import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		System.out.println("Enter the Choise 1,2,3:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		if(num == 1) {
			System.out.println("Stop");
		}else if(num == 2) {
			System.out.println("Ready");
		}else if(num == 3) {
			System.out.println("Go");
		}else {
			System.out.println("Invalid Choise");
		}
		

	}

}
