
public class BinarySearch {

	public static void main(String[] args) {
		
		int[] numbers = {1,5,8,10,15,25,62,85,90,91,98,100,104};
		
		System.out.println(binarySearch(numbers,85));
		
	}
	
	public static int binarySearch(int[] elements, int target) {
		int left = 0;
		int right = elements.length -1;
		while (right >= left) {
			int mid = (right+left)/2;
			if (target == elements[mid]) {
				return mid;
			}
			else if (target < elements[mid]) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		return -1;
	}

}
