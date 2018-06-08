package SimpleInsertionSort;

public class InsertionSort {

  public static void main(String[] args) {
    int[] arr = {5, 2, 4, 6, 1, 3};
    InsertionSort iSort = new InsertionSort();
    iSort.insertionSort(arr);
    System.out.print("Final sorted array: ");
    iSort.printArray(arr);
  }

  /**
   * Insertion sort method.<br>
   * It sorts the array in ascending order.
   * 
   * 2 modifications needs to be done in algorithm as the one given in book assumes array starts
   * from 1 while in java indexing starts from 0.
   * 
   * @param arr
   */
  private void insertionSort(int[] arr) {
    int key, i;
    for (int j = 1; j < arr.length; j++) { // 1) j taken from 1 instead of 2
      System.out.print("After step " + j+": ");
      printArray(arr); // printing array after each step for better explanation
      key = arr[j];
      i = j - 1;
      while (i >= 0 && arr[i] > key) { // 2) 0th element will be considered
        arr[i + 1] = arr[i];
        i--;
      }
      arr[i + 1] = key;
    }
  }

  /**
   * Added this method for printing the array and for better explanation.
   * 
   * @param arr
   */
  private void printArray(int[] arr) {
    for (int a : arr) {
      System.out.print(a);
    }
    System.out.println();
  }
}
