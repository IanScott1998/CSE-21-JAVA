import java.util.Scanner;
public class cheeseShop {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double sharpCost = 1.25;
	double brieCost = 10.00;
	double swissCost = 40.00;
	double sharp = 0;
	double swiss =0;
	double brie = 0;
	int list = 0;
	double total = 0;
	System.out.println("Welcome to the cheese shop. Today our stock is:");
	//Dalaran Sharp: $1.25 per pound
	System.out.println("Dalaran Sharp at $"+sharpCost+" per pound.");
	//Stormwind Brie: $10.00 per pound
	System.out.println("Stormwind Brie at $"+brieCost+" per pound.");
	//Alterac Swiss: $40.00 per pound
	System.out.println("Alterac Swiss at $"+swissCost+" per pound.");
	System.out.println("Enter the amount of Sharp in lbs:");
	sharp = input.nextDouble();
	System.out.println("Enter the amount of Brie in lbs:");
	brie = input.nextDouble();
	System.out.println("Enter the amount of Swiss in lbs:");
	swiss = input.nextDouble();
	System.out.println("Display the itemized list? (1 for yes)");
	list = input.nextInt();
	if(list == 1){
		System.out.println(sharp + "lbs of Sharp @ "+sharpCost+" = "+sharp*sharpCost);
		System.out.println(brie + "lbs of Brie @ "+brieCost+" = "+brie*brieCost);
		System.out.println(swiss + "lbs of Swiss @ "+swissCost+" = "+swiss*swissCost);
	}
	total= sharp*sharpCost+brie*brieCost+swiss*swissCost;
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
