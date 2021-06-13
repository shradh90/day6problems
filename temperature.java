package temperature;
import java.util.Scanner;
public class temperature {
	 public static void main(String[] args) {
	     System.out.println("enter a celsius value to convert it in to 	F :	");
		 Scanner sc = new Scanner(System.in);
	   	 int cel = sc.nextInt();
	   	 System.out.println("enter a fahrenhiet value to convert it in to 	c :	");
		 Scanner sc1 = new Scanner(System.in);
	   	 int fah = sc1.nextInt();
	   	 int f = (cel * (9 /5)) + 32;
	   	 int c = (f - 32) * (5 / 9);
	     System.out.println("celsius value to converted into F :" + f );
	     System.out.println("fahrenhiet value to converted into c :	" + c);
 }
}
