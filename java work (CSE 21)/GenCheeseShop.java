import java.util.Random;
import java.util.Scanner;

public class GenCheeseShop {
	public static void main(String[] args) {

		final int MAXCHEESE = 20;
		Scanner input = new Scanner(System.in);
		String[] names = new String[MAXCHEESE];
		double[] prices = new double[MAXCHEESE];
		int[] amounts = new int[MAXCHEESE];
		double total = 0;
		int list = 0;

		// Three Special Cheeses
		
		
 		System.out.println("We sell " + MAXCHEESE + " kinds of Cheese");
 		
 		if(MAXCHEESE > 0){
 		names[0] = "Dalaran Sharp";
		prices[0] = 1.25;
		System.out.println(names[0] + ": $" + prices[0] + " per pound");
 		}
 		if(MAXCHEESE > 1){
		names[1] = "Stormwind Brie";
		prices[1] = 10.00;
		System.out.println(names[1] + ": $" + prices[1] + " per pound");
 		}
 		if(MAXCHEESE>2){
		names[2] = "Alterac Swiss";
		prices[2] = 40.00;
		System.out.println(names[2] + ": $" + prices[2] + " per pound");
 		}
 		Random ranGen = new Random(100);
 		if(MAXCHEESE>3){
		for (int i = 3; i < MAXCHEESE; i++) {
			names[i] = "Cheese Type " + (char)('A' + i);
			prices[i] = ranGen.nextInt(1000)/100.0;
			amounts[i] = 0;

			System.out.println(names[i] + ": $" + prices[i] + " per pound");
		}
 		}
		if(MAXCHEESE >0){
		for (int i = 0; i < MAXCHEESE; i++) {
			System.out.println("Enter the amount of "+ names[i] +" in lbs:");
			amounts[i] = input.nextInt();
			if(amounts[i]>0){
				total = total+amounts[i]*prices[i];
			}
		}
		System.out.println("Display itemized list? (1 for yes).");
		list = input.nextInt();
		if(list==1){
			for(int i=0; i<MAXCHEESE; i++){
				if(amounts[i]>0){
					System.out.println(amounts[i]+" lbs of "+names[i]+" @ "+prices[i]+" = "+prices[i]*amounts[i]);
				}
			}
		}
		System.out.println("subtotal: "+total);
		if(total>=100.00){
			total=total-25.00;
			System.out.println("-discount: 25.0");
		}else if(total>=50.00){
			total=total-10.00;
			System.out.println("-discount: 10.0");
		}
		System.out.println("total: "+total);
		}
	}
}
