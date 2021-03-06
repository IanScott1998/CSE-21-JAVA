import java.util.Random;
import java.util.Scanner;

public class GenCheeseShopv2 {

	public static void intro(String[] names, double[]prices, int[] amounts) {
		
		System.out.println("We sell " + names.length + " kinds of Cheese");
		
		if(names.length >= 1){
	 		names[0] = "Dalaran Sharp";
			prices[0] = 1.25;
			System.out.println(names[0] + ": $" + prices[0] + " per pound");
	 		}
	 		if(names.length > 1){
			names[1] = "Stormwind Brie";
			prices[1] = 10.00;
			System.out.println(names[1] + ": $" + prices[1] + " per pound");
	 		}
	 		if(names.length>2){
			names[2] = "Alterac Swiss";
			prices[2] = 40.00;
			System.out.println(names[2] + ": $" + prices[2] + " per pound");
	 		}
	 		Random ranGen = new Random(100);
	 		if(names.length>3){
			for (int i = 3; i < names.length; i++) {
				names[i] = "Cheese Type " + (char)('A' + i);
				prices[i] = ranGen.nextInt(1000)/100.0;
				amounts[i] = 0;

				System.out.println(names[i] + ": $" + prices[i] + " per pound");
			}
	 		}
	}

	public static void getAmount(Scanner input, String[] names, int[] amounts) {
		if(names.length >0){
			for (int i = 0; i < names.length; i++) {
				System.out.println("Enter the amount of "+ names[i] +" in lbs:");
				amounts[i] = input.nextInt();
			}
	}
	}

	public static void itemizedList(String[] names, double[]prices, int[] amounts) {
		for(int i=0; i<names.length; i++){
			if(amounts[i]>0){
				System.out.println(amounts[i]+" lbs of "+names[i]+" @ "+prices[i]+" = "+prices[i]*amounts[i]);
			}
		}
	}

	public static double calcSubTotal(double[] prices, int[] amounts) {
		double total = 0;
		for(int i = 0; i<prices.length; i++){
			if(amounts[i]>0){
				total=total+prices[i]*amounts[i];
			}
		}
		return total;
	}

	public static int discount(double subTotal){
		if(subTotal>=100.00){
			subTotal=subTotal-25.00;
			return 25;
		}else if(subTotal>=50.00){
			return 10;
		}
		return 0;
	}

	public static void printTotal(double subTotal, int discount) {
		System.out.println("subtotal: "+subTotal);
		System.out.println("-discount: "+discount);
		subTotal=subTotal-discount;
		System.out.println("total: "+ subTotal);

	}

	public static void main(String[] args) {

		final int MAXCHEESE = 0;

		// DO NOT CHANGE ANYTHING BELOW
		String[] names = new String[MAXCHEESE];
		double[] prices = new double[MAXCHEESE];
		int[] amounts = new int[MAXCHEESE];

		Scanner input = new Scanner(System.in);

		intro(names, prices, amounts);

		getAmount(input, names, amounts);

		double total = calcSubTotal(prices, amounts);
		
		if (MAXCHEESE > 0) {
			System.out.print("Display the itemized list? (1 for yes) ");
			int itemized = input.nextInt();

			if (itemized == 1) {
				itemizedList(names, prices, amounts);
			}
		}

		System.out.println();

		printTotal(total, discount(total));
	}
}