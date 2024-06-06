
public class unionOfTwoArray {

	public static void main(String[] args) {
		int arr[] = new int[] {10,22,13,94,55,36,97};
		int arr2[] = new int[] {22,94,6,54,36};
		for (int i=0;i<arr.length;i++) {
			for(int j = 0; j<arr2.length;j++) {
				if (arr[i]!=arr2[j]) {
					arr[i] = -1;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	}

}
