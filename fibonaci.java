import java.util.Scanner;

public class fibonaci {
        public static void main(String[] args) {
                System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = 0;
		int b = 1;
     		System.out.println("fibonaci series are : ");
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=num;i++) {
			int c = a;
			a = b;
			b = b + c;
			System.out.println(b);
		}
	}
}
