package pig;

public class secondBOI extends Player{
	int i = 1;
	@Override
	public boolean throwAgain(Player opponent){
		if(i>0){
			i--;
		return true;
		}else{
		i++;
		return false;
		}
	}
}
