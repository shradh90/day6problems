import java.util.Scanner;

public class perfect {
        public static void main(String[] args) {
                System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int perfectnum = PerfectNum(num);
		if(perfectnum == num) {
				System.out.println( num + " is perfect number");
			}
			else {
				System.out.println( num + " is not a perfect number");
			}
		}
		private static int PerfectNum(int num)
		{
		 	int i;
			int temp = num;
		 	int sum = 0;
			for(i=1;i<temp;i++){
				if(temp % i == 0){
					sum = sum + i;
				}
			}
			return sum;
		}
}
