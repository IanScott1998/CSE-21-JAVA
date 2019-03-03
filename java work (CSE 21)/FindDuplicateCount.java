

public class FindDuplicateCount {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 2, 4, 3, 0, 5, 3, 2};
		int i = 0;
		int f = 0;
		int duplicates = 0;
		for(i = 0; i<arr.length; i++){
			for(f=i+1; f<arr.length; f++){
				if(arr[i]==arr[f]){
					duplicates++;
				}
			}
			if (duplicates == 0){
				System.out.println("There are no duplicate instances of value "+arr[i]+" beyond index "+i);
			}else{
				System.out.println("There are "+duplicates+" duplicate instances of value "+arr[i]+" starting at index "+i);
			}
			duplicates=0;
		}
	}

}

