package monthlypayment;

import java.util.Scanner;

public class monthlypayment {
	
	        public static void main(String[] args) {
	        System.out.println("enter point  p");
			Scanner sc = new Scanner(System.in);
			int p = sc.nextInt();
			System.out.println("enter a point R");
			Scanner sc1 = new Scanner(System.in);
			int R = sc1.nextInt();
			System.out.println("enter a point y");
	        Scanner sc2 = new Scanner(System.in);
	        int y = sc2.nextInt();
	        double n = 12 * y;
	        double r = R / (12 * 100);
	        double payment = (p * r)/(1 - Math.pow(1 * r , -n ));
	        System.out.println("payment: " + payment);
        }
}
