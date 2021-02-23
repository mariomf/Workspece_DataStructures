package array;

public class SingleDimensionArray {
	int arr[] = null;
	
	public SingleDimensionArray(int sizeOfArray) {
		arr = new int[sizeOfArray];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}
	
	public void traverseArray() {
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i] + " ");
			}
		}catch (Exception e) {
			System.out.println("Array no loger exists !");
		}
	}
	
	

}
