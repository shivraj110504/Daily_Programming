public class Pract_Day03 {
    public static int duplicate(int [] arr){
		for(int i=0;i<=arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
			if(arr[i]==arr[j]){
				return arr[i];
			}
		}
		}
		return -1;
	}

    public static void main(String[] args) {
        int [] arr ={ 1, 3, 2, 3, 4, 5};
		System.out.println("Element is: "+duplicate(arr));
    }
}
