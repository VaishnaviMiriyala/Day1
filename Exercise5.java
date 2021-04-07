package m1.task3;
import java.util.Scanner;
public class Exercise5 {

	public static void main(String[] args) {
		System.out.println("Enter the value:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        Exercise5 obj = new Exercise5();
        System.out.println("The sum is "+obj.calculateSum(num));

	}
    public int calculateSum(int num) {
    	   int sum = 0;
    	for(int i = 0;i <= num;i++) {
    		sum += i;
    	}
    	return sum;
    }
}
