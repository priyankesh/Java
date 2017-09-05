import java.util.Arrays;

public class PythagorasTriplets {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 4, 6, 5 };
		System.out.println("Is Pythgoras triplet present: " + isTriplet(arr, arr.length));
	}

	public static boolean isTriplet(int[] arr, int len) {
		// squaring the array
		for (int i = 0; i < len; i++) {
			arr[i] *= arr[i];
		}

		// Sorting the array
		Arrays.sort(arr);

		// Finding triplets
		for (int i = len - 1; i >= 2; i--) {
			int l = 0;
			int r = i - 1;
			while (l < r) {
				if (arr[i] == arr[l] + arr[r]) {
					System.out.println(arr[i] + ", " + arr[l] + ", " + arr[r]);
					return true;
				}
				if (arr[i] > arr[l] + arr[r]) {
					l++;
				} else {
					r--;
				}
			}
		}
		return false;
	}
}