package reverse;

import java.util.Scanner;

public class reverse {
	 public static void main(String[] args) {
         System.out.println("enter a number");
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         int revers = rev(num);
         System.out.println("reverse of a number : " + revers);
	 }
	 private static int rev(int num) {
		 int rem = 0;
		 int rev = 0;
		 int temp = num;
		 while(temp > 0) {
			 rem = temp % 10;
		     rev = rev * 10 + rem;
		     temp = temp / 10;
		 }
		 return rev;
	 }
 }
