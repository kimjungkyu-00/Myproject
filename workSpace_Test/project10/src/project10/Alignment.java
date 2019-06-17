package project10;

public class Alignment {

	public void arr(int[] arr) {
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				System.out.print(arr[j]+" ");
			}
			System.out.print(arr[arr.length-1]);
			System.out.println();
		}

	}

}
