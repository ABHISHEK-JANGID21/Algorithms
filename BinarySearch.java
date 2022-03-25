 import java.util.Scanner;
public class BinarySearch {
public static void binarySearch(int a[],int first, int last, int key) {
	int mid=(first+last)/2;
	while(first<=last) {
		if(a[mid]==key) {
			System.out.println("Element found at the index of :" +mid);
			break;
		}
		else if(a[mid]<key) {
			first=mid +1;
		}
		else {
			last =mid-1;
		}
		mid=(first+last)/2;
	}
	if(first>last) {
		System.out.println("Element is not present in the given array");
	}
}
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60}; // must be sorted otherwise it won't work
		int size= a.length;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value to search");
		int key=sc.nextInt();
        binarySearch(a,0,size-1,key);

	}

}

// time complexity = O(log(n))
// space complexity = O(1)