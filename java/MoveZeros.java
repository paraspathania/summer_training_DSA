

public class MoveZeros {
    // This method moves all zeros in the array to the end while maintaining the order of non-zero elements.
    // It uses a two-pointer technique where one pointer tracks the position of the next non-zero element.
       public static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,0,78,0,56,23,0,85,0};
	
	System.out.print("Elements before move all the zeros: ");
	for (int num1 : arr){
	System.out.print(num1 + " ");
	}
    System.out.println();
    System.out.println("Moving all zeros to the end of the array...");
        moveZerosToEnd(arr);
// Print the result
        System.out.print("Result: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
