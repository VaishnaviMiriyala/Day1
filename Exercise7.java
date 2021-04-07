package m1.task3;
import java.util.Scanner;
public class Exercise7 {

	public static void main(String[] args) {
		System.out.println("Enter the value:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        Exercise7 obj = new Exercise7();
        System.out.println("Output is: "+obj.checkMethod(num));

	}
    public boolean checkMethod(int num) {
    	int temp = num % 10;
    	boolean flag = true;
    	num = num / 10;
    	   while(num != 0) {
    		   if(temp < num % 10) {
    			   flag = false;
    			   break;
    		   }
    		   temp = num % 10;
    		   num =num /10;
    	   }
    	   return flag;
    }
    	   

}
