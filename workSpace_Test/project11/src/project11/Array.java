package project11;

public class Array {

	public void arr(int[][] arr) {
		boolean check = true;
		int k = 1;

		for (int i = 0; i < arr.length; ++i) {
			if (check) {

				for (int j = 0; j < arr.length; ++j) {
					arr[i][j] = k;
					k++;
				}check = false;
			}
			else {
				for(int j = arr.length-1;j>=0;j--) {
					arr[i][j] = k;
					k++;
				}
				check= true;
			}
		}
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
