
public class LinearSearch {

	public static int linearSearch(int a[], int size,int key) {
		for (int i = 0; i < size; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = { 10, 20, 45, 48, 52, 700, 586 };
		int size = a.length;
		int keyElement = 45;
		int position = linearSearch(a, size, keyElement);
		if (position == -1) {
			System.out.println("Element is not present in the given array");
		} else {
			System.out.println("Element is present at the index :" + position);
		}
	}
}


//time complexity= O(n)
// space complexity = O(1)