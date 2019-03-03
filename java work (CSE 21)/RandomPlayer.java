package pig;
import java.util.Random;

public class RandomPlayer extends Player{
	Random rand = new Random();
	protected int choice = rand.nextInt(3);
	@Override
	public boolean throwAgain(Player opponent){
		if(choice>0){
			choice--;
			return true;
		}
		else{
		choice = rand.nextInt(3);
		return false;
		}
	}
}
