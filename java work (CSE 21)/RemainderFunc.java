import java.util.Scanner;

public class RemainderFunc {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter the max number.");
	int max = input.nextInt();
	
	System.out.println("Please enter the devisor.");
	int dev = input.nextInt();
	
	int i = 0;
	
	for(i=1; i <= max; i++){
		System.out.println("num: "+i+"%"+dev+" = "+i%dev);
	}
	}
}
