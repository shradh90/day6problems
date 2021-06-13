package tobinary;

import java.util.Scanner;

public class tobinary {
	 public static void main(String[] args) {
	        System.out.println("enter decimal number : ");
			Scanner sc = new Scanner(System.in);
			int dec = sc.nextInt();
			long bin = convertdectobin(dec);
			System.out.println("converted binary number : " + bin);
	 }
	 public static long convertdectobin(int dec) {
		 long binary = 000000;
		 int rem;
		 int i = 1;
		 int step = 1;
				while(dec != 0) {
					rem = dec % 2;
					dec = dec / 2;
					binary = binary + rem * i;
					i = i * 10;
				}
				return binary;
			}
		}
