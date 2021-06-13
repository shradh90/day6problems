package dayofweek;

import java.util.Scanner;

public class dayofweek {
	 public static void main(String[] args) {
	        System.out.println("enter point  day : ");
			Scanner sc = new Scanner(System.in);
			int d = sc.nextInt();
			System.out.println("enter a point month : ");
			Scanner sc1 = new Scanner(System.in);
			int m = sc1.nextInt();
			System.out.println("enter a point year : ");
	        Scanner sc2 = new Scanner(System.in);
	        int y = sc2.nextInt();
	        double yo = y - (14 - m) / 12 ;
	        double x = yo + (yo / 4) - (yo / 100) + (yo / 400);
	        double mo = m + 12 * ((14 - m) / 12) - 2;
	        double d1 = (d + x + 31 * mo /12) % 7;
	        System.out.println("year : " + yo);
	        System.out.println("x : " + x);
	        System.out.println(" month : " + mo);
	        System.out.println(" day : " + d1);
	 }
}
