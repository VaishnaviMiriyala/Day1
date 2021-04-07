package m1.task3;
import java.util.Scanner;
public class Exercise3 {
    static int x = 1,y = 1;
	public static void main(String[] args) {
          System.out.println("Enter the nth value requied in the series:");
          Scanner sc = new Scanner(System.in);
          int num = sc.nextInt();
          sc.close();
          Exercise3 obj = new Exercise3();
          obj.fibonacci(num);
          obj.fibonacci1(num,x,y);
	}
	public void fibonacci(int data) {
		int a = 1,b = 1;
		for(int i = 2;i < data;i++) {
			int num = a+b;
			   a = b;
			   b = num;
		}
		System.out.println(b);
	}
	public void fibonacci1(int data,int a,int b) {
	    if(data > 0) {
	     int num = a+b;
	    	a = b;
	    	b = num;
	    	if(data -1 == 2) {
	    		System.out.println(num);
	    	}
	    	fibonacci1(data - 1,a,b);
	    }
	}

}
