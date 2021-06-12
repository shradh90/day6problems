package vendingmachine;
import java.util.Scanner;
public class vending {
	 public static void main(String[] args) {
     System.out.println("enter a amount");
	 Scanner sc = new Scanner(System.in);
   	 int amount = sc.nextInt();
   	 
   	 int[] notes = new int[] {1000,500,100,50,10,5,2,1};
   	 int[] notecount = new int[50];
   	 for(int i = 0; i < 50; i++) {
   		 if(amount >= notes[i]) {
   		 notecount[i] = amount / notes[i];
   		 amount = amount - notecount[i] * notes[i];
   		 }
   		}
   	 System.out.println("currency count");
   	 for(int i = 0; i < 50; i++) {
   		 if(notecount[i] != 0) {
   			 System.out.println(notes[i] + ":" + notecount[i]);
   		 }
   	}
  }
}
