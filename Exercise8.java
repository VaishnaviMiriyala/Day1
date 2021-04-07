package m1.task3;
import java.util.Scanner;
public class Exercise8 {

	public static void main(String[] args) {
		System.out.println("Enter the value:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        Exercise8 obj = new Exercise8();
        System.out.println("Output is: "+obj.checkMethod(num));

	}
    public boolean checkMethod(int num) {
    	boolean flag = true;
    	if(num == 0) {
    		return false;
    	}
		while(num != 1) {
			if(num % 2 != 0) {
				return false;
			}
			num = num / 2;
		}
        return flag;
	}

}
