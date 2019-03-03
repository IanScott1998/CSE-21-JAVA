package oop;

public class DecrementableCounter extends Counter{
	int myCount = 0;
	public DecrementableCounter(int n){
		myCount = n;
	}
	public void decriment() {
		
		if(myCount!=0){
			for(int i = 0; i<myCount-1; i++){
				super.increment();
			}
		}
	}
}
