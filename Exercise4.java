package m1.task3;
import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		System.out.println("Enter the value:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        Exercise4 obj=new Exercise4();
        for(int i = 2;i <= num;i++) {
        	int x = obj.primenumber(i);
        	if(x == 1) {
        		System.out.println(i);
        	}
        }

	}
	public int primenumber(int num) {
		int count =0;
		for(int i = 2;i <=num / 2;i++) {
			if(num % i == 0) {
				count = 1;
			}
		}
		if(count == 0) {
			return 1;
		}
		return 0;
	}

}
