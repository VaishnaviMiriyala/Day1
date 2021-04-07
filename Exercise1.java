package m1.task3;
import java.util.Scanner;
public class Exercise1 {
    
	public static void main(String[] args) {
		int num;
	    Scanner sc = new Scanner(System.in);
	    num = sc.nextInt();
	    sc.close();
		Exercise1 obj = new Exercise1();
		System.out.println("The sum is "+obj.cubes(num));
	}
	
	public int cubes(int data) {
		int sum = 0;
		while(data != 0) {
			int temp = data % 10;
			sum += (temp*temp*temp);
			data = data / 10;
		}
		return sum;
	}

}
