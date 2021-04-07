package m1.task3;
import java.util.Scanner;
public class Exercise6 {

		public static void main(String[] args) {
			System.out.println("Enter the value:");
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        sc.close();
	        Exercise6 obj = new Exercise6();
	        System.out.println("The  differece is:  "+obj.calculateDifference(num));

		}
	    public int calculateDifference(int num) {
	    	   int sum = 0,sum1 = 0;
	    	   for(int i = 1;i <= num;i++) {
	    		   sum += (i*i);
	    		   sum1 += i;
	    	   }
	    	   int diff = sum -(sum1*sum1);
               return diff;
	    }
}
